package com.betacom.projectCarSpring.dto;



public class Veicolo {

	
	Integer id; 
	Integer idColore; 
	Integer idTipoAlimentazione; 
	Integer idCodeMarca; 
	Integer numeroRuote; 
	Integer numeroPosti; 
	String idTipoVeicolo; 
	Integer idMacchina; 
	Integer idMoto;
	Integer idBici;
	
	public Veicolo() {
		super();
	}

	public Veicolo(Integer id, Integer idColore, Integer idTipoAlimentazione, Integer idCodeMarca, Integer numeroRuote,
			Integer numeroPosti, String idTipoVeicolo, Integer idMacchina, Integer idMoto, Integer idBici) {
		super();
		this.id = id;
		this.idColore = idColore;
		this.idTipoAlimentazione = idTipoAlimentazione;
		this.idCodeMarca = idCodeMarca;
		this.numeroRuote = numeroRuote;
		this.numeroPosti = numeroPosti;
		this.idTipoVeicolo = idTipoVeicolo;
		this.idMacchina = idMacchina;
		this.idMoto = idMoto;
		this.idBici = idBici;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdColore() {
		return idColore;
	}

	public void setIdColore(Integer idColore) {
		this.idColore = idColore;
	}

	public Integer getIdTipoAlimentazione() {
		return idTipoAlimentazione;
	}

	public void setIdTipoAlimentazione(Integer idTipoAlimentazione) {
		this.idTipoAlimentazione = idTipoAlimentazione;
	}

	public Integer getIdCodeMarca() {
		return idCodeMarca;
	}

	public void setIdCodeMarca(Integer idCodeMarca) {
		this.idCodeMarca = idCodeMarca;
	}

	public Integer getNumeroRuote() {
		return numeroRuote;
	}

	public void setNumeroRuote(Integer numeroRuote) {
		this.numeroRuote = numeroRuote;
	}

	public Integer getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(Integer numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public String getIdTipoVeicolo() {
		return idTipoVeicolo;
	}

	public void setIdTipoVeicolo(String idTipoVeicolo) {
		this.idTipoVeicolo = idTipoVeicolo;
	}

	public Integer getIdMacchina() {
		return idMacchina;
	}

	public void setIdMacchina(Integer idMacchina) {
		this.idMacchina = idMacchina;
	}

	public Integer getIdMoto() {
		return idMoto;
	}

	public void setIdMoto(Integer idMoto) {
		this.idMoto = idMoto;
	}

	public Integer getIdBici() {
		return idBici;
	}

	public void setIdBici(Integer idBici) {
		this.idBici = idBici;
	}

	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", idColore=" + idColore + ", idTipoAlimentazione=" + idTipoAlimentazione
				+ ", idCodeMarca=" + idCodeMarca + ", numeroRuote=" + numeroRuote + ", numeroPosti=" + numeroPosti
				+ ", idTipoVeicolo=" + idTipoVeicolo + ", idMacchina=" + idMacchina + ", idMoto=" + idMoto + ", idBici="
				+ idBici + "]";
	}
	
	
	
	
}
