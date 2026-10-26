package vehiculos;

public abstract class VehiculoAereo extends Vehiculo {
	
	protected int alturaMaxima;
	
	public VehiculoAereo() {
		alturaMaxima=10000;
		System.out.println("Se crea un VehiculoAereo con alturaMaxima=10000");
	}
	
	public VehiculoAereo(int alturaMaxima) {
		this.alturaMaxima=alturaMaxima;
		System.out.println("Se crea un VehiculoAereo con alturaMaxima="+alturaMaxima;
	}

}
