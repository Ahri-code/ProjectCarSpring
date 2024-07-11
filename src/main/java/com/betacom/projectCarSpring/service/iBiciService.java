package com.betacom.projectCarSpring.service;

import com.betacom.projectCarSpring.dto.BiciDto;
import com.betacom.projectCarSpring.exeption.AcademyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface iBiciService {

    Integer createBici(BiciDto bici);
    List<BiciDto> listAllBici();
    void remove(BiciDto bici) throws AcademyException;
