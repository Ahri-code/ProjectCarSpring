package com.betacom.projectCarSpring.implService;

import com.betacom.projectCarSpring.dto.MacchinaDto;
import com.betacom.projectCarSpring.exeption.AcademyException;
import com.betacom.projectCarSpring.pojo.Macchina;
import com.betacom.projectCarSpring.repository.iMacchinaRepository;
import com.betacom.projectCarSpring.service.iMacchinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MacchinaServiceImpl implements iMacchinaService {

    @Autowired
    iMacchinaRepository macchinaR;

    @Override
    public Integer createMacchina(MacchinaDto macchinaDto) {
        Macchina macchinaDto1 = new Macchina();
        macchinaDto1.setCilindrata(macchinaDto.getCilindrata());
        macchinaDto1.setTarga(macchinaDto.getTarga());
        macchinaDto1.setNumeroPorte(macchinaDto.getNumeroPorte());
        return macchinaR.save(macchinaDto1).getId();
    }

    @Override
    public List<MacchinaDto> listAllMacchine() {
        List<Macchina> resp = macchinaR.findAll();
        return trasformInListDto(resp);
    }

    private List<MacchinaDto> trasformInListDto(List<Macchina> resp){
        return resp.stream()
                .map(s->new MacchinaDto(s.getId(),
                        s.getNumeroPorte(),
                        s.getTarga(),
                        s.getCilindrata()
                ))

                .collect(Collectors.toList());
    }

    @Override
    public void remove(MacchinaDto socio) throws AcademyException {
        Optional<Macchina> mac = macchinaR.findById(socio.getId());
        if(mac.isEmpty()) {
            throw new AcademyException("Macchina non trovata");
        }

        macchinaR.delete(mac.get());
    }

}