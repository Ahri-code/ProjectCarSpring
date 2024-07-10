package com.betacom.projectCarSpring.dto;

import com.betacom.projectCarSpring.pojo.Veicolo;


public class Bici extends Veicolo{


	Integer id;
	Boolean pieghevole;
	Boolean assistita;
	Integer ammortizzatore;
	

	public Bici() {
		super();
	}
	
	public Bici(Integer id, Boolean pieghevole, Boolean assistita, Integer ammortizzatore) {
		super();
		this.id = id;
		this.pieghevole = pieghevole;
		this.assistita = assistita;
		this.ammortizzatore = ammortizzatore;
	}


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

	@Override
	public String toString() {
		return "Bici [id=" + id + ", pieghevole=" + pieghevole + ", assistita=" + assistita + ", ammortizzatore="
				+ ammortizzatore + "]";
	}
	
}
