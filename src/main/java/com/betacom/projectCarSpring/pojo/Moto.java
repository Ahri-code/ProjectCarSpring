package com.betacom.projectCarSpring.pojo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id; 
	
	@Column (unique = true)
	String targa;
	
	Integer cilindrata; 

	
	@OneToOne
	(mappedBy = "moto")
	private Veicolo veicolo; 
}
