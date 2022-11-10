package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
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


@Table(name="transaccion")
public class Transaccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,unique=false,length=100)
	
	private Date fecha;
	private char TipoDeTransaccion;
	private int valor;
	private int saldo_actual;
	@ManyToOne
	@JoinColumn(name="cuenta_trans_id")
	private Cuenta cuenta_trans;
	@ManyToOne
	@JoinColumn(name="cuenta_id")
	private Cuenta cuenta;



	
	

}
