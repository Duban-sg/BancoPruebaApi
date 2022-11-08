package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.entity.Cuenta;


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
	@JoinColumn(name="cuenta_id")
	private Cuenta cuenta;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public char getTipoDeTransaccion() {
		return TipoDeTransaccion;
	}
	public void setTipoDeTransaccion(char tipoDeTransaccion) {
		TipoDeTransaccion = tipoDeTransaccion;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getSaldo_actual() {
		return saldo_actual;
	}
	public void setSaldo_actual(int saldo_actual) {
		this.saldo_actual = saldo_actual;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
	

}
