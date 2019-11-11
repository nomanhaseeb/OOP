package EJ2;

public class Estudiante extends Persona {
	// atributos
	private int codigoestudiante;
	private float nota;
	
	
	
	// Constructor especial para cojer atributos de otra clase
	public Estudiante(String nombre, String apellido, int edad,int codigoestudiante,float nota) {
		// esta sentencia quiere decir que ya estan iniciada en otra clase "persona".
		super(nombre,apellido,edad);
		this.codigoestudiante = codigoestudiante;
		this.nota = nota;
	}
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	// metedo para imprimir los datos en la pantalla
	public void mostrardatos() {
		System.out.println("Nombre :" + getNombre() + 
				"\nApeliido: "  +getApellido()+
				"\nEdad: " +getEdad() + 
				"\nCodigoestudiante : " + codigoestudiante+
				"\nNota : " +nota);
	}
	

}
