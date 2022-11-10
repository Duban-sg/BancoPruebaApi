package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cuenta")

public class Cuenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String numero;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipe_cuenta_id", referencedColumnName = "id")
	private TipoCuenta tipo_cuenta;
	
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	private Number saldo;
	
	@ManyToOne
	@JoinColumn(name="clientes")
	private Cliente clientes_id;
	
	//el mappedBy conecta con el objeto de la tabla creada
	//debe ser el mismo nombre de la variable
	
	
	@OneToMany(mappedBy="cuenta")
	private List<Transaccion>transaccion;
	
	@ManyToOne
	@JoinColumn(name="tipo_cuenta_id")
	private TipoCuenta tipoCuenta;
	
}
