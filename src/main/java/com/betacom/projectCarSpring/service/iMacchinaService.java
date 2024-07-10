package com.betacom.projectCarSpring.service;

import com.betacom.projectCarSpring.dto.MacchinaDto;
import org.springframework.stereotype.Service;

@Service
public interface iMacchinaService {

    Integer createMacchina(MacchinaDto socio);

}
