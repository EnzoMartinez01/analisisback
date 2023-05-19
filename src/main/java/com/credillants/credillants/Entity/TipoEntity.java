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
public class TipoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipo;
	private String nomtipo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipo")
	@JsonIgnore
	private Set<LlantaEntity> llantas = new LinkedHashSet<>();
	
	public Integer getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}
	public String getNomtipo() {
		return nomtipo;
	}
	public void setNomtipo(String nomtipo) {
		this.nomtipo = nomtipo;
	}
	public Set<LlantaEntity> getLlantas() {
		return llantas;
	}
	public void setLlantas(Set<LlantaEntity> llantas) {
		this.llantas = llantas;
	}
}
