package com.credillants.credillants.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class DetalleCompraEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetCompra;
	@ManyToOne(fetch = FetchType.EAGER)
	private LlantaEntity llanta;
	private Integer llantCant;
	private Double total;
	
	public Integer getIdDetCompra() {
		return idDetCompra;
	}
	public void setIdDetCompra(Integer idDetCompra) {
		this.idDetCompra = idDetCompra;
	}
	public LlantaEntity getLlanta() {
		return llanta;
	}
	public void setLlanta(LlantaEntity llanta) {
		this.llanta = llanta;
	}
	public Integer getLlantCant() {
		return llantCant;
	}
	public void setLlantCant(Integer llantCant) {
		this.llantCant = llantCant;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
}
