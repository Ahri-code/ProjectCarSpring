package com.betacom.projectCarSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.betacom.projectCarSpring.pojo.Moto;

@Repository
public interface iMotoRepository extends JpaRepository<Moto, Integer>{

}
