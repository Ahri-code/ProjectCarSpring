package com.betacom.projectCarSpring.dto;


public class TipoAlimentazione {
	Integer code_tipo; 
	String descrizione;
	
	public TipoAlimentazione() {
		super();
	}

	public TipoAlimentazione(Integer code_tipo, String descrizione) {
		super();
		this.code_tipo = code_tipo;
		this.descrizione = descrizione;
	}

	public Integer getCode_tipo() {
		return code_tipo;
	}

	public void setCode_tipo(Integer code_tipo) {
		this.code_tipo = code_tipo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "TipoAlimentazione [code_tipo=" + code_tipo + ", descrizione=" + descrizione + "]";
	}
	
}
