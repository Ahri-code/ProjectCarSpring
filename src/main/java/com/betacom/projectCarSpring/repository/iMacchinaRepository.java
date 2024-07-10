package com.betacom.projectCarSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.betacom.projectCarSpring.pojo.Macchina;

@Repository
public interface iMacchinaRepository extends JpaRepository<Macchina, Integer>{

}
