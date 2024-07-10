package com.betacom.projectCarSpring.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_colore")
public class TipoColore {

	@Id	
	Integer code_colore; 
	@Column(length = 50)
	String descrizione;
	
	@OneToMany(
			mappedBy = "tipoColore",
			fetch = FetchType.EAGER)
	private List<Veicolo> veicolo; 
}
