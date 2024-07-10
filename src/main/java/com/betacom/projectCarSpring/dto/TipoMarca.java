package com.betacom.projectCarSpring.dto;


public class TipoMarca {


	Integer code_marca; 
	String descrizione;
	
	public TipoMarca() {
		super();
	}

	public TipoMarca(Integer code_marca, String descrizione) {
		super();
		this.code_marca = code_marca;
		this.descrizione = descrizione;
	}

	public Integer getCode_marca() {
		return code_marca;
	}

	public void setCode_marca(Integer code_marca) {
		this.code_marca = code_marca;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "TipoMarca [code_marca=" + code_marca + ", descrizione=" + descrizione + "]";
	}
	
	
}
