package com.credillants.credillants.Entity;

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
	
	
}
