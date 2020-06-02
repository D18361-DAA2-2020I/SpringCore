package idat.edu.pe.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PagoAgente implements PagoI {

	@Autowired
	DAOBaseI repositorio;
	
	
	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
       repositorio.conectar();
	}

}
