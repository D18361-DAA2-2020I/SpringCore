package idat.edu.pe.spring.core.di.automatica;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public class OracleDAO implements DAOBaseI{

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectando a Oracle");
	}

}
