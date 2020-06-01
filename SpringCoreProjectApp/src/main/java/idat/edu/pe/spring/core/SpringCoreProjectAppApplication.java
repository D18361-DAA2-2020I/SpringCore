package idat.edu.pe.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.spring.core.ioc.SaludoEspannol;
import idat.edu.pe.spring.core.ioc.SaludoI;

@SpringBootApplication
public class SpringCoreProjectAppApplication {

	public static void main(String[] args) {
		
		  ConfigurableApplicationContext ctx = SpringApplication.run(SpringCoreProjectAppApplication.class, args);
		  String nombreAlumno = "Christian";
		  
		  //Pidiendo al contexto...No estoy construyendo instancia de SaludoEspannol
		  SaludoI saludo1 = ctx.getBean(SaludoEspannol.class);
		 
		  String resultado = saludo1.saludar(nombreAlumno);  
		  
		  System.out.println("Imprimiendo saludo :: "+ resultado);
		  
		  
		  SaludoI saludo2 = (SaludoI) ctx.getBean("saludoIngles");
		  
		  resultado = saludo2.saludar("Kevin");
		  
		  System.out.println("Imprimiendo saludo nro2 :: "+ resultado);
		  
		  SaludoI saludo3 = (SaludoI) ctx.getBean("brasil");
		  
		  resultado = saludo3.saludar("Flor");
		  
		  System.out.println("Imprimiendo saludo nro3 :: "+ resultado);
	}

}
