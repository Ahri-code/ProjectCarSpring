package com.betacom.projectCarSpring.service;


import com.betacom.projectCarSpring.dto.VeicoloDto;
import com.betacom.projectCarSpring.exeption.AcademyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface iVeicoloService {

    Integer createVeicolo(VeicoloDto veicolo);
    List<VeicoloDto> listAllVeicolo();
    void remove(VeicoloDto veicolo) throws AcademyException;
