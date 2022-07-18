
public class Garajes extends Superficies implements Inmuebles{

	private String tipoGaraje1;
	
	public Garajes(String ubicacion, double mCuadrados, double precioMCuadrado, String tipoGaraje1) {
		super(ubicacion, mCuadrados, precioMCuadrado);
		
		this.tipoGaraje1 = tipoGaraje1;
		
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
	
	public String getTipoGaraje(String tipoGaraje1) {
		
		this.tipoGaraje1 = tipoGaraje1;
		
		if(tipoGaraje1.equals(tipoGaraje.PRIVADO)) {
			
			return "garaje privado";
		}else {
		
		return "garaje publico";
		}
	}

	@Override
	public String toString() {
		return "Plaza de garaje ubicada en: " + getUbicacion() + ", con " + getmCuadrados() + " m2, y en un " + getTipoGaraje(tipoGaraje1) + ", con un precio de: " + getPrecio(precioMCuadrado, mCuadrados) + "€";
	}

	
	
	

}

