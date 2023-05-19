package com.credillants.credillants.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class RolEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRol;
	private String nombrol;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "rolusuario")
	private Set<UsuarioRolEntity> usuariorolentity = new HashSet<>();
	
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getNombrol() {
		return nombrol;
	}
	public void setNombrol(String nombrol) {
		this.nombrol = nombrol;
	}
	public Set<UsuarioRolEntity> getUsuariorolentity() {
		return usuariorolentity;
	}
	public void setUsuariorolentity(Set<UsuarioRolEntity> usuariorolentity) {
		this.usuariorolentity = usuariorolentity;
	}
	
}
