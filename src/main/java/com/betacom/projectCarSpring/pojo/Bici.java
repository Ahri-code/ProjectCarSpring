package com.betacom.projectCarSpring.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bici")
public class Bici{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column
	Boolean pieghevole;
	
	@Column
	Boolean assistita;
	
	@Column(nullable = false,
			name = "tipo_ammortizzatore")
	Integer ammortizzatore;
	
	
	@ManyToMany
	(fetch = FetchType.EAGER)
	@JoinTable(
			name = "bici_ammortizzatore",
			joinColumns = @JoinColumn(name = "bici_id"),
			inverseJoinColumns = @JoinColumn(name= "ammortizzatore_id")
			)
	
	private List<TipoAmmortizzatore> tipoAmmortizzatore;
	
	@OneToOne
	(mappedBy = "bici")
	private Veicolo veicolo; 
}
