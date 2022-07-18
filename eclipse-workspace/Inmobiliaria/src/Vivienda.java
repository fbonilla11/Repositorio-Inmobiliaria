
public class Vivienda extends Construcciones implements Inmuebles{

	private double precio;
	private int numHabitaciones;
	private int piso;
	private String antiguedad;
	

	public Vivienda(String ubicacion, double mCuadrados, double precio, int numHabitaciones, int piso, String antiguedad) {
		super(ubicacion, mCuadrados);
		this.precio = precio;
		this.numHabitaciones = numHabitaciones;
		this.piso = piso;
		this.antiguedad = antiguedad;
	}
	
	
	public String getUbicacion() {
		
		return ubicacion;
		
	}
	
	public double getmCuadrados() {
		
		return mCuadrados;
	}
	
	public String antiguedad() {
		
		if(antiguedad.equals(edadConstrucciones.NUEVA)) {
			
			return "nueva";
			
		}else {
		
		return "segunda mano";
		
		}
	}


	@Override
	public String toString() {
		return "Vivienda [precio=" + precio + ", numHabitaciones=" + numHabitaciones + ", piso=" + piso
				+ ", getUbicacion()=" + getUbicacion() + ", getmCuadrados()=" + getmCuadrados() + ", antiguedad()="
				+ antiguedad() + "]";
	}



	
	
	
	
}
