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
public class UsuarioEmpDocEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iduserempdoc;
	@ManyToOne(fetch = FetchType.EAGER)
	private UsuarioEntity usuariodoc;
	@ManyToOne(fetch = FetchType.EAGER)
	private EmpleadoEntity empldoc;
	@ManyToOne(fetch = FetchType.EAGER)
	private TipoDocumentoEntity docuser;
	@ManyToOne (fetch = FetchType.EAGER)
	private TipoDocumentoEntity docemp;
	
	public Integer getIduserempdoc() {
		return iduserempdoc;
	}
	public void setIduserempdoc(Integer iduserempdoc) {
		this.iduserempdoc = iduserempdoc;
	}
	public UsuarioEntity getUsuariodoc() {
		return usuariodoc;
	}
	public void setUsuariodoc(UsuarioEntity usuariodoc) {
		this.usuariodoc = usuariodoc;
	}
	public EmpleadoEntity getEmpldoc() {
		return empldoc;
	}
	public void setEmpldoc(EmpleadoEntity empldoc) {
		this.empldoc = empldoc;
	}
	public TipoDocumentoEntity getDocuser() {
		return docuser;
	}
	public void setDocuser(TipoDocumentoEntity docuser) {
		this.docuser = docuser;
	}
	public TipoDocumentoEntity getDocemp() {
		return docemp;
	}
	public void setDocemp(TipoDocumentoEntity docemp) {
		this.docemp = docemp;
	}
	
}
