package com.credillants.credillants.Entity;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class MarcaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	private String nombmarca;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "marca")
	@JsonIgnore
	private Set<LlantaEntity> llantas = new LinkedHashSet<>();
	
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombmarca() {
		return nombmarca;
	}
	public void setNombmarca(String nombmarca) {
		this.nombmarca = nombmarca;
	}
	public Set<LlantaEntity> getLlantas() {
		return llantas;
	}
	public void setLlantas(Set<LlantaEntity> llantas) {
		this.llantas = llantas;
	}
}
