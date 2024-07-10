package com.betacom.projectCarSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.betacom.projectCarSpring.pojo.Veicolo;

@Repository
public interface iVeicoloRepository extends JpaRepository<Veicolo, Integer>{

}
