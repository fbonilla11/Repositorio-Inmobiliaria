
public abstract class Construcciones implements Inmuebles{

	String ubicacion;
	double mCuadrados;
	
	

	public Construcciones(String ubicacion, double mCuadrados) {
		super();
		this.ubicacion = ubicacion;
		this.mCuadrados = mCuadrados;
	}

	public String getUbicacion() {
		
		return ubicacion;
	}
	
	public double getmCuadrados() {
		
		return mCuadrados;
	}
	
	
	public abstract String antiguedad();
	
}
