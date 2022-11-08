package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@Entity

@AllArgsConstructor
@Table(name="Cuenta")

public class Cuenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private String Tipo_cuenta;
	private Cliente Cliente;
	private Number saldo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo_cuenta() {
		return Tipo_cuenta;
	}
	public void setTipo_cuenta(String tipo_cuenta) {
		Tipo_cuenta = tipo_cuenta;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Number getSaldo() {
		return saldo;
	}
	public void setSaldo(Number saldo) {
		this.saldo = saldo;
	}

	
	
}
