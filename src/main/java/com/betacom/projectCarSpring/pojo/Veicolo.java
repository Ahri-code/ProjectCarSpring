package com.betacom.projectCarSpring.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Veicolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id; 
	
	@Column(nullable = false)
	Integer numeroRuote; 
	
	@Column(nullable = false)
	Integer numeroPosti; 

	

	@OneToOne
	@JoinColumn(
			name = "moto_id",
			referencedColumnName= "id"
			)	
	private Moto moto;
	
	@OneToOne
	@JoinColumn(
			name = "macchina_id",
			referencedColumnName= "id"
			)
	private Macchina macchina;
	
	@OneToOne
	@JoinColumn(
			name = "bici_id",
			referencedColumnName= "id"
			)
	private Bici bici;
	

	
	@ManyToOne
	@JoinColumn(
			name = "id_colore")
	private TipoColore tipoColore; 
	
	@ManyToOne
	@JoinColumn(
			name = "id_alimentazione")
	private TipoAlimentazione tipoAlimentazione;
	
	@ManyToOne
	@JoinColumn(
			name = "id_marca")
	private TipoMarca tipoMarca;
	
	@ManyToOne
	@JoinColumn(
			name = "id_veicolo")
	private TipoVeicolo tipoVeicolo;
	
	
}
