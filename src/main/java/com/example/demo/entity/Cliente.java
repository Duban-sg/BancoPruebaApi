package com.example.demo.entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NonNull;


@Entity

@AllArgsConstructor
@Table(name="cliente")

public class Cliente {
	
	@Id
	@NonNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
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
	private List<Cuenta>cuentas;
	}