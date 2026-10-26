import vehiculos.*;

public class Aplicacion {
	
	public Aplicacion() {
		/*Vehiculo unVehiculo=new Vehiculo(200);
		System.out.println(unVehiculo);*/
	/*	VehiculoTerrestre unVehiculoTerrestre=new VehiculoTerrestre(100);
		unVehiculoTerrestre.cambiarVelocidad(10);
		
		System.out.println(unVehiculoTerrestre.getVelocidadActual());*/
		
		VehiculoTerrestre unVehiculoTerrestre=new VehiculoTerrestre();
		System.out.println(unVehiculoTerrestre);
		
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();
	}

}
