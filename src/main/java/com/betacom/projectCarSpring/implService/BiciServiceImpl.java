package com.betacom.projectCarSpring.implService;

import com.betacom.projectCarSpring.dto.BiciDto;
import com.betacom.projectCarSpring.dto.MacchinaDto;
import com.betacom.projectCarSpring.exeption.AcademyException;
import com.betacom.projectCarSpring.pojo.Bici;
import com.betacom.projectCarSpring.pojo.Macchina;
import com.betacom.projectCarSpring.repository.iBiciRepository;
import com.betacom.projectCarSpring.repository.iMacchinaRepository;
import com.betacom.projectCarSpring.service.iBiciService;
import com.betacom.projectCarSpring.service.iMacchinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BiciServiceImpl implements iBiciService {

    @Autowired
    iBiciRepository biciR;

    @Override
    public Integer createBici(BiciDto biciDto); {
        Bici biciDto1 = new Bici();
        biciDto1.setAssistita(biciDto.getAssistita());
        biciDto1.setPieghevole(biciDto.setAmmortizzatore();
        return biciR.save(biciDto1).getId();
    }

    @Override
    public List<BiciDto> listAllBici() {
        List<Bici> resp = biciR.findAll();
        return trasformInListDto(resp);
    }

    private List<BiciDto> trasformInListDto(List<Bici> resp){
        return resp.stream()
                .map(s->new BiciDto(s.getId(),
                        s.getPieghevole(),
                        s.getAssistita()
                ))

                .collect(Collectors.toList());
    }

    @Override
    public void remove(BiciDto bici) throws AcademyException {
        Optional<Bici> mac = biciR.findById(bici.getId());
        if(mac.isEmpty()) {
            throw new AcademyException("Bici non trovata");
        }

        biciR.delete(mac.get());
    }

}