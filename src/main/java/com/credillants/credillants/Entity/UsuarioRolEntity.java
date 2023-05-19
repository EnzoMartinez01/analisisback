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
public class UsuarioRolEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idusuariorol;
	
	@ManyToOne (fetch = FetchType.EAGER)
	private UsuarioEntity usuariorol;
	
	@ManyToOne (fetch = FetchType.EAGER)
	private RolEntity rolusuario;

	public Integer getIdusuariorol() {
		return idusuariorol;
	}

	public void setIdusuariorol(Integer idusuariorol) {
		this.idusuariorol = idusuariorol;
	}

	public UsuarioEntity getUsuariorol() {
		return usuariorol;
	}

	public void setUsuariorol(UsuarioEntity usuariorol) {
		this.usuariorol = usuariorol;
	}

	public RolEntity getRolusuario() {
		return rolusuario;
	}

	public void setRolusuario(RolEntity rolusuario) {
		this.rolusuario = rolusuario;
	}
}
