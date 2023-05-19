package com.credillants.credillants.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String lastname;
	private String nrodoc;
	private Date fechanac;
	private String email;
	@Column(name="password")
	private String pass;
	private Integer tel;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuariorol")
	@JsonIgnore
	private Set<UsuarioRolEntity> usuariorolentity = new HashSet<>();
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuariodoc")
	private Set<UsuarioEmpDocEntity> usuarioempdocentity = new HashSet<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNrodoc() {
		return nrodoc;
	}
	public void setNrodoc(String nrodoc) {
		this.nrodoc = nrodoc;
	}
	public Date getFechanac() {
		return fechanac;
	}
	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	
	public Set<UsuarioRolEntity> getUsuariorolentity() {
		return usuariorolentity;
	}
	public void setUsuariorolentity(Set<UsuarioRolEntity> usuariorolentity) {
		this.usuariorolentity = usuariorolentity;
	}
	public Set<UsuarioEmpDocEntity> getUsuarioempdocentity() {
		return usuarioempdocentity;
	}
	public void setUsuarioempdocentity(Set<UsuarioEmpDocEntity> usuarioempdocentity) {
		this.usuarioempdocentity = usuarioempdocentity;
	}
}
