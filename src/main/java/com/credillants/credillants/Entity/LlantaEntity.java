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
public class LlantaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLlanta;
	private Integer diametro;
	private String aro;
	private String ancho;
	private Double precio;
	@ManyToOne(fetch = FetchType.EAGER)
	private TipoEntity tipo;
	@ManyToOne(fetch = FetchType.EAGER)
	private MarcaEntity marca;
	
	public Integer getIdLlanta() {
		return idLlanta;
	}
	public void setIdLlanta(Integer idLlanta) {
		this.idLlanta = idLlanta;
	}
	public Integer getDiametro() {
		return diametro;
	}
	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}
	public String getAro() {
		return aro;
	}
	public void setAro(String aro) {
		this.aro = aro;
	}
	public String getAncho() {
		return ancho;
	}
	public void setAncho(String ancho) {
		this.ancho = ancho;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public TipoEntity getTipo() {
		return tipo;
	}
	public void setTipo(TipoEntity tipo) {
		this.tipo = tipo;
	}
	public MarcaEntity getMarca() {
		return marca;
	}
	public void setMarca(MarcaEntity marca) {
		this.marca = marca;
	}
}
