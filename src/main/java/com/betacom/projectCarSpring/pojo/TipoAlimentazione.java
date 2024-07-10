package com.betacom.projectCarSpring.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class TipoAlimentazione {
	@Id
	Integer code_tipo; 
	@Column
	String descrizione;
	
	@OneToMany(
			mappedBy = "tipoAlimentazione",
			fetch = FetchType.EAGER)
	private List<Veicolo> veicolo; 
}
