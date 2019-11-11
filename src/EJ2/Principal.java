package EJ2;

public class Principal {

	public static void main(String[] args) {
		// creamos objetos en este caso estudiantes
		Estudiante estudiante1 = new Estudiante("noman", "haseeb", 15, 001, 5);
		Estudiante estudiante2 = new Estudiante("muneeb", "mazhar", 16, 001, 10);
		//aqui los estamos haciendo es mostrar los datos de los estudiantes
		estudiante1.mostrardatos();
		System.out.println("\n");
		estudiante2.mostrardatos();
		System.out.println("A ver quien tiene la mejor nota segun el programma " + "\n");
		if(estudiante1.getNota()>estudiante2.getNota()) {
			System.out.println(estudiante1.getNombre() + " Tiene " + estudiante1.getNota() + " que es la mejor nota");
		}
		else {
			System.out.println(estudiante2.getNombre() + " Tiene " + estudiante2.getNota() + " que es la mejor nota" );
		}

	}

}
