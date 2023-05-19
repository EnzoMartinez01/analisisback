package com.credillants.credillants.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
public class EmpleadoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpleado;
	private String nombEmpleado;
	private String apellEmpleado;
	private Date fechaNacEmp;
	private String correoEmp;
	@Column(name="password")
	private String passEmp;
	private Integer telEmp;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "empldoc")
	private Set<UsuarioEmpDocEntity> usuarioempdocentity = new HashSet<>();
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombEmpleado() {
		return nombEmpleado;
	}
	public void setNombEmpleado(String nombEmpleado) {
		this.nombEmpleado = nombEmpleado;
	}
	public String getApellEmpleado() {
		return apellEmpleado;
	}
	public void setApellEmpleado(String apellEmpleado) {
		this.apellEmpleado = apellEmpleado;
	}
	public Date getFechaNacEmp() {
		return fechaNacEmp;
	}
	public void setFechaNacEmp(Date fechaNacEmp) {
		this.fechaNacEmp = fechaNacEmp;
	}
	public String getCorreoEmp() {
		return correoEmp;
	}
	public void setCorreoEmp(String correoEmp) {
		this.correoEmp = correoEmp;
	}
	public String getPassEmp() {
		return passEmp;
	}
	public void setPassEmp(String passEmp) {
		this.passEmp = passEmp;
	}
	public Integer getTelEmp() {
		return telEmp;
	}
	public void setTelEmp(Integer telEmp) {
		this.telEmp = telEmp;
	}
	public Set<UsuarioEmpDocEntity> getUsuarioempdocentity() {
		return usuarioempdocentity;
	}
	public void setUsuarioempdocentity(Set<UsuarioEmpDocEntity> usuarioempdocentity) {
		this.usuarioempdocentity = usuarioempdocentity;
	}
}
