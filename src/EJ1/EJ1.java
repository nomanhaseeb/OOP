package EJ1;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hemos creado un objeto desde donde estamos llamando a los atributos del libro y almacenamos alli nuestro
		//1 libro
		libro Libro1 = new libro(111111110, "Hacking ", "noman ", 30);
		libro Libro2 = new libro(111111112, "Math ", "Muneeb " , 70);
		// imprimos los dos libro creados
		System.out.println(Libro1.mostrar());
		System.out.println(Libro2.mostrar());
		
		// si queremos imprimir solo aquel libro que tiene mas que 40 paginas
		System.out.println("\n");
		System.out.println("Comparamos que libro tiene mas paginas y mostramos el titulo de ese libro");
		
		if(Libro1.getNumpaginas()> Libro2.getNumpaginas()) {
			System.out.println(Libro1.getTitulo() + "Tiene mas paginas");
		}
		else {
			System.out.println(Libro2.getTitulo() + "Tiene mas paginas");
		}
	}

}
