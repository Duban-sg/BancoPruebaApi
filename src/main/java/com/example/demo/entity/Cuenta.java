package com.example.demo.entity;

import java.util.List;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name="cuenta")


public class Cuenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String numero;

	private String Tipo_cuenta;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	private Number saldo;
	@OneToMany(mappedBy="cuenta")
	private List<Transaccion>transaccion;
	


}

