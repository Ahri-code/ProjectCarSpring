package com.betacom.projectCarSpring.dto;


public class Moto {
	
	Integer id; 
	String targa;
	Integer cilindrata;
	
	public Moto() {
		super();
	}
	
	public Moto(Integer id, String targa, Integer cilindrata) {
		super();
		this.id = id;
		this.targa = targa;
		this.cilindrata = cilindrata;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Moto [id=" + id + ", targa=" + targa + ", cilindrata=" + cilindrata + "]";
	} 
	
	
	
	
	
	
	
	
	
	
	

}
