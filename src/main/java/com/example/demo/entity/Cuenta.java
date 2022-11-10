package com.example.demo.entity;

import java.util.List;

<<<<<<< HEAD
import javax.persistence.CascadeType;
=======
>>>>>>> dev
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
<<<<<<< HEAD
import javax.persistence.OneToOne;
=======
>>>>>>> dev
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
<<<<<<< HEAD
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cuenta")
=======
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name="cuenta")
>>>>>>> dev

public class Cuenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String numero;
<<<<<<< HEAD
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipe_cuenta_id", referencedColumnName = "id")
	private TipoCuenta tipo_cuenta;
	
	
=======
	private String Tipo_cuenta;
>>>>>>> dev
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	private Number saldo;
	@OneToMany(mappedBy="cuenta")
	private List<Transaccion>transaccion;
	
<<<<<<< HEAD
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
=======

}
>>>>>>> dev
