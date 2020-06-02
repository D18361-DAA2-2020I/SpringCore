package idat.edu.pe.spring.core.di.automatica;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfiguracionDAO {

	
	@Bean
	
	public DAOBaseI crearSQLServer()
	{
		return new SqlServerDAO();
	}
	
	@Bean
	@Primary
	public DAOBaseI crearMySQLServer() 
	{
		return new MySqlDAO();
	}
	
}
