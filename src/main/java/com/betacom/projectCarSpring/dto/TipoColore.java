package com.betacom.projectCarSpring.dto;



public class TipoColore {


	Integer code_colore; 
	String descrizione;
	
	public TipoColore() {
		super();
	}

	public TipoColore(Integer code_colore, String descrizione) {
		super();
		this.code_colore = code_colore;
		this.descrizione = descrizione;
	}


	public Integer getCode_colore() {
		return code_colore;
	}

	public void setCode_colore(Integer code_colore) {
		this.code_colore = code_colore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "TipoColore [code_colore=" + code_colore + ", descrizione=" + descrizione + "]";
	}
	
	
	
}
