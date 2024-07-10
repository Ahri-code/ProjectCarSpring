package com.betacom.projectCarSpring.dto;




public class TipoAmmortizzatore {
	Integer code; 
	String descrizione;
	
	public TipoAmmortizzatore() {
		super();
	}

	public TipoAmmortizzatore(Integer code, String descrizione) {
		super();
		this.code = code;
		this.descrizione = descrizione;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "TipoAmmortizzatore [code=" + code + ", descrizione=" + descrizione + "]";
	}

	
	
}
