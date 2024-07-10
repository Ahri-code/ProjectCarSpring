package com.betacom.projectCarSpring.implService;

import com.betacom.projectCarSpring.dto.MacchinaDto;
import com.betacom.projectCarSpring.pojo.Macchina;
import com.betacom.projectCarSpring.repository.iMacchinaRepository;
import com.betacom.projectCarSpring.service.iMacchinaService;
import org.springframework.beans.factory.annotation.Autowired;

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

}