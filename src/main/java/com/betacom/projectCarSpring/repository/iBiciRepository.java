package com.betacom.projectCarSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.betacom.projectCarSpring.pojo.Bici;

@Repository
public interface iBiciRepository extends JpaRepository<Bici, Integer>{

}
