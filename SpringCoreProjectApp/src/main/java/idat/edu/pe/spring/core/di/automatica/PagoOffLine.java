package idat.edu.pe.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "off")
public class PagoOffLine implements PagoI {

	DAOBaseI repositorio;
	
	
	@Autowired
	public PagoOffLine(@Qualifier(value = "mongoDbDAO") DAOBaseI repositorio) {
		super();
		this.repositorio = repositorio;
	}



	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
		repositorio.conectar();
	}

}
