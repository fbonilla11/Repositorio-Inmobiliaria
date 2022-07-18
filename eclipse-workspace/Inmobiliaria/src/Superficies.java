
public abstract class Superficies implements Inmuebles{

	protected String ubicacion;
	protected double mCuadrados;
	protected double precio;
	protected double precioMCuadrado;
	
	

	public Superficies(String ubicacion, double mCuadrados, double precioMCuadrado) {
		super();
		this.ubicacion = ubicacion;
		this.mCuadrados = mCuadrados;
		this.precioMCuadrado = precioMCuadrado;
	}

	public String getUbicacion() {
		
		return ubicacion;
	}
	
	public double getmCuadrados() {
		
		
		return mCuadrados;
	}
	
	public abstract double getPrecio(double precioMCuadrado, double mCuadrados);
}
