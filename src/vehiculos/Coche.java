package vehiculos;

public abstract class Coche extends VehiculoTerrestre {
	
	public Coche() {
		numeroRuedas=4;
		System.out.println("Se crea un Coche.");
		//super(); que viene a ser new VehiculoTerrestre();
	}
	
	public String toString() {
		return "Objeto Coche (velocidadMaxima="+velocidadMaxima+";velocidadActual="+velocidadActual+";numeroRuedas=4)";
	}

}
