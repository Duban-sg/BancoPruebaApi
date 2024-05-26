package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name="TipoCuenta")
public class TipoCuenta {

	@Id
	@NonNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@NonNull
	private String nombre;
	
	private Double interes;
	
	@OneToMany(mappedBy="tipoCuenta")
	private List<Cuenta> cuentas;

}
