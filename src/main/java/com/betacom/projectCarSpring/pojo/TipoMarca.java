package com.betacom.projectCarSpring.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_marca")
public class TipoMarca {

	@Id
	Integer code_marca; 
	@Column
	String descrizione;
	
	@OneToMany(
			mappedBy = "tipoMarca",
			fetch = FetchType.EAGER)
	private List<Veicolo> veicolo; 
}
