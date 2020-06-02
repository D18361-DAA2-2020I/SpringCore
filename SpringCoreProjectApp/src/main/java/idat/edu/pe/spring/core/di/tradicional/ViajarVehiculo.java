package idat.edu.pe.spring.core.di.tradicional;

public class ViajarVehiculo {

	VehiculoI vehiculo;

	
	public ViajarVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViajarVehiculo(VehiculoI vehiculo) {
		super();
		this.vehiculo = vehiculo;
	}

	public VehiculoI getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoI vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	public void empezarAcelerar()
	{
		this.vehiculo.acelerar();
	}
	
}
