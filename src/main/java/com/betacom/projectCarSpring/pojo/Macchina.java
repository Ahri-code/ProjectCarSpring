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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(Integer numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
}
