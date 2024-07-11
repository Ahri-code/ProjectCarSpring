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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getPieghevole() {
		return pieghevole;
	}

	public void setPieghevole(Boolean pieghevole) {
		this.pieghevole = pieghevole;
	}

	public Boolean getAssistita() {
		return assistita;
	}

	public void setAssistita(Boolean assistita) {
		this.assistita = assistita;
	}

	public Integer getAmmortizzatore() {
		return ammortizzatore;
	}

	public void setAmmortizzatore(Integer ammortizzatore) {
		this.ammortizzatore = ammortizzatore;
	}

	public List<TipoAmmortizzatore> getTipoAmmortizzatore() {
		return tipoAmmortizzatore;
	}

	public void setTipoAmmortizzatore(List<TipoAmmortizzatore> tipoAmmortizzatore) {
		this.tipoAmmortizzatore = tipoAmmortizzatore;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
}
