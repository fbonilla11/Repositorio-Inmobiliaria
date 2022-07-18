
public class Solares extends Superficies implements Inmuebles{

	private String zona;
	
	public Solares(String ubicacion, double mCuadrados, double precioMCuadrado, String zona) {
		super(ubicacion, mCuadrados, precioMCuadrado);
		
		this.zona = zona;
		
	}

	public String getUbicacion() {
		
		return ubicacion;
	}
	
	public double getmCuadrados() {
		
		return mCuadrados;
	}
	
	public double getPrecio(double precioMCuadrado, double mCuadrados) {
		
		return precioMCuadrado * mCuadrados;
	}
	
	public String getZona(String zona) {
		
		this.zona = zona;
		
		if(zona.equals(Zona.RUSTICA)) {
			
			return "Rustica";
		}else {
		
		return "Urbana";
		}
	}

	@Override
	public String toString() {
		return "Solar ubicado en " + getUbicacion() + ", con " + getmCuadrados() + " m2, y en zona " + getZona(zona) + ", con un precio de: " + getPrecio(precioMCuadrado, mCuadrados) + "€";
	}

	
	
	

}
