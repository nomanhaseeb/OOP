package EJ2;

public class Persona {
	// atributos o propiedades de la clase
	private String nombre;
	private String apellido;
	private int edad;
	
	
	// constructor de esas propiedades
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	// creamos metedos getter solo porque en herencia no hace falta crear metedos setter

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}


	public int getEdad() {
		return edad;
	}
	
	
	
	
	
}
