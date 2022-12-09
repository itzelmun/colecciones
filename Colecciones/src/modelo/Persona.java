package modelo;

public class Persona {

	private String nombre;
	private String edad;
	private String identificacionUnica;
	
	
	public Persona(String nombre, String edad, String identificacionUnica) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.identificacionUnica = identificacionUnica;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public String getEdad() {
		return edad;
	}
	
	public String getIdentificacionUnica() {
		return identificacionUnica;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", identificacionUnica=" + identificacionUnica + "]";
	}
	
	
	
	
	
}
