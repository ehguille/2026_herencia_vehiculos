package vehiculos;

public abstract class Moto extends VehiculoTerrestre {
	
	public Moto() {
		numeroRuedas=2;
		System.out.println("Se crea un Coche.");
	}
	
	
	public String toString() {
		return "Objeto Moto (velocidadMaxima="+velocidadMaxima+";velocidadActual="+velocidadActual+";numeroRuedas=2)";
	}


}
