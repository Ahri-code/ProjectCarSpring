package com.betacom.projectCarSpring.service;

import com.betacom.projectCarSpring.dto.MacchinaDto;
import com.betacom.projectCarSpring.exeption.AcademyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface iMacchinaService {

    Integer createMacchina(MacchinaDto socio);
    List<MacchinaDto> listAllMacchine();
    void remove(MacchinaDto socio) throws AcademyException;

}
