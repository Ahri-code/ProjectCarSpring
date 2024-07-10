package com.betacom.projectCarSpring.pojo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "macchina")
public class Macchina{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id; 
	
	@Column
	Integer numeroPorte; 
	
	@Column(unique = true)
	String targa;
	
	@Column
	Integer cilindrata; 
	
	@OneToOne
	(mappedBy = "macchina")
	private Veicolo veicolo; 
	
	
}
