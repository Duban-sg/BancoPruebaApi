package com.example.demo.entity;

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
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getInteres() {
		return interes;
	}
	public void setInteres(Double interes) {
		this.interes = interes;
	}


}
