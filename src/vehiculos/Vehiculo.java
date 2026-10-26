package vehiculos;

public abstract class Vehiculo {
	
	protected int velocidadMaxima, velocidadActual;
	protected String tipoPropulsion; //electrica, mecánica (a pie,...).
	
	public Vehiculo() {
		velocidadMaxima=1000;
		velocidadActual=0;
		System.out.println("Se crea Vehiculo con velocidadMaxima="+velocidadMaxima+".");
	}
	
	public Vehiculo(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
		this.velocidadActual=0;
		System.out.println("Se crea Vehiculo con velocidadMaxima="+velocidadMaxima+".");
	}
	
	public void cambiarVelocidad(int incremento) {
		velocidadActual=velocidadActual+incremento;
		System.out.println("Se incrementa la velocidad "+incremento+" kmh.");
	}
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	public String toString() {
		return "Objeto Vehiculo (velocidadMaxima="+velocidadMaxima+";velocidadActual="+velocidadActual+")";
	}
	
}
