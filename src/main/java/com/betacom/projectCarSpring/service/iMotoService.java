package com.betacom.projectCarSpring.service;


import com.betacom.projectCarSpring.dto.MotoDto;
import com.betacom.projectCarSpring.exeption.AcademyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface iMotoService {

    Integer createMoto(MotoDto moto);
    List<MotoDto> listAllMoto();
    void remove(MotoDto moto) throws AcademyException;
