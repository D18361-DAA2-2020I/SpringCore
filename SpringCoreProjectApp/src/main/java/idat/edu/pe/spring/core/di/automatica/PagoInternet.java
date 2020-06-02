package idat.edu.pe.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoInternet implements PagoI {

	 //Te proporciona un Bean , Inyeccion a nivel de atributo
	ComunicacionI comunicacion;
	
	 // Inyectando a nivel de metodo constructor
	
   

	public ComunicacionI getComunicacion() {
		return comunicacion;
	}


	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
       comunicacion.enviar();
	}

}
