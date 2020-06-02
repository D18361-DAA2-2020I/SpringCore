package idat.edu.pe.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.spring.core.di.automatica.PagoAgente;
import idat.edu.pe.spring.core.di.automatica.PagoEnLinea;
import idat.edu.pe.spring.core.di.automatica.PagoI;
import idat.edu.pe.spring.core.di.automatica.PagoInternet;
import idat.edu.pe.spring.core.di.tradicional.Automovil;
import idat.edu.pe.spring.core.di.tradicional.VehiculoI;
import idat.edu.pe.spring.core.di.tradicional.ViajarVehiculo;
import idat.edu.pe.spring.core.ioc.SaludoEspannol;
import idat.edu.pe.spring.core.ioc.SaludoI;

@SpringBootApplication
public class SpringCoreProjectAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCoreProjectAppApplication.class, args);
        PagoI pago1 = ctx.getBean(PagoInternet.class);
        //pago1.realizarPago();
		
        /*
		PagoI pago2 = (PagoI) ctx.getBean("pagoAgencia");
		pago2.realizarPago();
		
		
		PagoI pago3 = ctx.getBean(PagoAgente.class);
		pago3.realizarPago();
		*/
        
		PagoI pago4 = ctx.getBean(PagoEnLinea.class);
		pago4.realizarPago();
		
		PagoI pago5 = (PagoI) ctx.getBean("off");
		pago5.realizarPago();
		
		/*
		 * //Pruebas de inyeccion de dependencia tradicional... ViajarVehiculo viajar1 =
		 * new ViajarVehiculo(); VehiculoI vehiculo1 = ctx.getBean(Automovil.class);
		 * viajar1.setVehiculo(vehiculo1); // De manera programatica en generado la
		 * inyenccion viajar1.empezarAcelerar();
		 * 
		 * 
		 * VehiculoI vehiculo2 = (VehiculoI) ctx.getBean("scoter"); ViajarVehiculo
		 * viajar2 = new ViajarVehiculo(vehiculo2 ); viajar2.empezarAcelerar();
		 * 
		 * 
		 * VehiculoI vehiculo3 = (VehiculoI) ctx.getBean("camioncito");
		 * viajar2.setVehiculo(vehiculo3 ); viajar2.getVehiculo().acelerar();
		 */

		/*
		 * Clase anterior String nombreAlumno = "Christian";
		 * 
		 * //Pidiendo al contexto...No estoy construyendo instancia de SaludoEspannol
		 * SaludoI saludo1 = ctx.getBean(SaludoEspannol.class);
		 * 
		 * String resultado = saludo1.saludar(nombreAlumno);
		 * 
		 * System.out.println("Imprimiendo saludo :: "+ resultado);
		 * 
		 * 
		 * SaludoI saludo2 = (SaludoI) ctx.getBean("saludoIngles");
		 * 
		 * resultado = saludo2.saludar("Kevin");
		 * 
		 * System.out.println("Imprimiendo saludo nro2 :: "+ resultado);
		 * 
		 * SaludoI saludo3 = (SaludoI) ctx.getBean("brasil");
		 * 
		 * resultado = saludo3.saludar("Flor");
		 * 
		 * System.out.println("Imprimiendo saludo nro3 :: "+ resultado);
		 */
	}

}
