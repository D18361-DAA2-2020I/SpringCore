package idat.edu.pe.spring.core.di.tradicional;

import org.springframework.stereotype.Component;

@Component
public class Bicicleta implements VehiculoI {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Viajando en bicicleta");
	}

}
