package entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;

@Data
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

}
