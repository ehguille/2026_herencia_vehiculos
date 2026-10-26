package vehiculos;

public class VehiculoTerrestre extends Vehiculo {

	public VehiculoTerrestre(int velocidadMaxima) {
		super(velocidadMaxima); //Constructor del padre
		System.out.println("Se crea un VehiculoTerrestre con velocidadMaxima="+velocidadMaxima+".");
	}
	
	public VehiculoTerrestre() {
		super(); //new Vehiculo();
	}
	
	public String toString() {
		return "Objeto VehiculoTerrestre (velocidadMaxima="+velocidadMaxima+";velocidadActual="+velocidadActual+")";
	}

}
