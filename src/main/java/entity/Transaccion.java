package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class Transaccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,unique=false,length=100)
	private Date fecha;
	private char TipoDeTransaccion;
	private int valor;
	private int saldo_actual;
	private int saldo_final;
	@ManyToOne
	@JoinColumn(name="cuenta_id")
	private cuenta cuentas;
	
	
	

}
