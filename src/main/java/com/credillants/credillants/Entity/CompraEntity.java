package com.credillants.credillants.Entity;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="")
public class CompraEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompra;
	@OneToMany(mappedBy = "compra",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<TipoCompraEntity> tipocompra = new LinkedHashSet<>();
	@ManyToOne(fetch = FetchType.EAGER)
	private EmpleadoEntity empleado;
	@ManyToOne(fetch = FetchType.EAGER)
	private UsuarioEntity usuario;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "detcompra")
	@JsonIgnore
	private Set<DetalleCompraEntity> detalleCompraEntity = new LinkedHashSet<>();
	private Date fechaventa;
	private Double igv;
	private Double subtotal;
	private Double costocompra;
	
	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public Set<TipoCompraEntity> getTipocompra() {
		return tipocompra;
	}
	public void setTipocompra(Set<TipoCompraEntity> tipocompra) {
		this.tipocompra = tipocompra;
	}
	public EmpleadoEntity getEmpleado() {
		return empleado;
	}
	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	public Set<DetalleCompraEntity> getDetalleCompraEntity() {
		return detalleCompraEntity;
	}
	public void setDetalleCompraEntity(Set<DetalleCompraEntity> detalleCompraEntity) {
		this.detalleCompraEntity = detalleCompraEntity;
	}
	public Date getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getCostocompra() {
		return costocompra;
	}
	public void setCostocompra(Double costocompra) {
		this.costocompra = costocompra;
	}
}
