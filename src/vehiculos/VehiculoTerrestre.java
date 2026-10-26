package vehiculos;

public abstract class VehiculoTerrestre extends Vehiculo {
	
	protected int numeroRuedas;

	public VehiculoTerrestre(int velocidadMaxima) {
		super(velocidadMaxima); //Constructor del padre
		System.out.println("Se crea un VehiculoTerrestre con velocidadMaxima="+velocidadMaxima+".");
	}
	
	public VehiculoTerrestre() {
		//super(); //new Vehiculo();
		System.out.println("Se crea un VehiculoTerrestre con velocidadMaxima=1000");
	}
	
	public String toString() {
		return "Objeto VehiculoTerrestre (velocidadMaxima="+velocidadMaxima+";velocidadActual="+velocidadActual+")";
	}

}
