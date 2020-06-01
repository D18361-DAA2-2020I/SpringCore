package idat.edu.pe.spring.core.ioc;


import org.springframework.stereotype.Service;

@Service
public class SaludoEspannol implements SaludoI {

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Buenas noches alumno : " + nombre;
	}

}
