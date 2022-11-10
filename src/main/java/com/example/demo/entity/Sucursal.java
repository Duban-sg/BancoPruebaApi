package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sucursal")


public class Sucursal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false,unique=false,length=100)
	private String nombreSucursal;
	private String direccion;
	
	
	@JoinTable(
	        name = "rel_sucursal_cliente",
	        joinColumns = @JoinColumn(name = "FK_SUCURSAL", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="FK_CLIENTE", nullable = false)
	    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Cliente> clientes;
	
	

	
}
