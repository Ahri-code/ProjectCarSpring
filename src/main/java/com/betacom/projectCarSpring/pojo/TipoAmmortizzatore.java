package com.betacom.projectCarSpring.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_ammortizzatore")
public class TipoAmmortizzatore {
	
	@Id
	Integer code; 
	@Column(length = 50)
	String descrizione;
	
    @ManyToMany
    (mappedBy = "tipoAmmortizzatore",
    fetch = FetchType.EAGER)
 
    private List<Bici> biciclette;
}
