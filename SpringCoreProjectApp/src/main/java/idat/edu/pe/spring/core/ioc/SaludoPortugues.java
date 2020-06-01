package idat.edu.pe.spring.core.ioc;

import org.springframework.stereotype.Component;

@Component(value = "brasil")
public class SaludoPortugues implements SaludoI {

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Boa noite alumno : " + nombre;
	}

}
