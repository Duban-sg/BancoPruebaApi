package com.example.demo.entity;
<<<<<<< HEAD





import java.io.Serializable;
=======
>>>>>>> dev
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NonNull;


@Entity

@AllArgsConstructor
@Table(name="cliente")

public class Cliente implements Serializable{
	
	@Id
	@NonNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String documento;
	@NonNull
	private String nombre;
	@NonNull
	private String apellido;
	@NonNull
	private String correo;
	@NonNull
	private String direccion;
	@NonNull
	private String clave;
	@OneToMany(mappedBy="cliente")
<<<<<<< HEAD
	private List<Cuenta>lis_cuentas;
	
	@ManyToMany(mappedBy = "clientes")
    private List<Sucursal> sucursales;
=======
	private List<Cuenta>cuentas;

	@ManyToMany(mappedBy="clientes")
	private List<Sucursal>Sucursales;

>>>>>>> dev
	}