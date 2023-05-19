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
public class TipoDocumentoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDoc;
	private String nombDoc;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "docuser")
	private Set<UsuarioEmpDocEntity> usuarioempdocentity = new HashSet<>();
	
	public Integer getIdDoc() {
		return idDoc;
	}
	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}
	public String getNombDoc() {
		return nombDoc;
	}
	public void setNombDoc(String nombDoc) {
		this.nombDoc = nombDoc;
	}
	public Set<UsuarioEmpDocEntity> getUsuarioempdocentity() {
		return usuarioempdocentity;
	}
	public void setUsuarioempdocentity(Set<UsuarioEmpDocEntity> usuarioempdocentity) {
		this.usuarioempdocentity = usuarioempdocentity;
	}
}
