package com.betacom.projectCarSpring.dto;

import com.betacom.projectCarSpring.pojo.Veicolo;


public class MacchinaDto extends Veicolo{

	Integer id; 
	Integer numeroPorte; 
	String targa;
	Integer cilindrata;
	
	public MacchinaDto(Integer id, Integer numeroPorte, String targa, Integer cilindrata) {
		super();
		this.id = id;
		this.numeroPorte = numeroPorte;
		this.targa = targa;
		this.cilindrata = cilindrata;
	}

	public MacchinaDto() {
		super();
	}

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

	@Override
	public String toString() {
		return "Macchina [id=" + id + ", numeroPorte=" + numeroPorte + ", targa=" + targa + ", cilindrata=" + cilindrata
				+ "]";
	} 
	
	
}
