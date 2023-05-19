package com.credillants.credillants.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class TipoCompraEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoCompra;
	private String nombtipocomp;
	
	public Integer getIdTipoCompra() {
		return idTipoCompra;
	}
	public void setIdTipoCompra(Integer idTipoCompra) {
		this.idTipoCompra = idTipoCompra;
	}
	public String getNombtipocomp() {
		return nombtipocomp;
	}
	public void setNombtipocomp(String nombtipocomp) {
		this.nombtipocomp = nombtipocomp;
	}
}
