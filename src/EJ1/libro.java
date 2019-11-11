package EJ1;

public class libro {
	
	// atributos o propiedades
	private int ISBN;
	private String titulo;
	private String autor;
	private int numpaginas;
	
	// creamos constructor para trabajar con los variables anterior
	// en el constructor hemos puesto variables locales donde almacenaremos los atributos
	public libro(int pISBN, String ptitulo, String pautor, int pnumpaginas) {
		// ahora almacenamos los atributos en las variables locales creadas recien
		ISBN = pISBN;
		titulo = ptitulo;
		autor = pautor;
		numpaginas = pnumpaginas;
	}
	// Estos son los metedos getter y setter
	public int getISBN() { //getter obtiene el atributo ISBN
		return ISBN;
	}


	public void setISBN(int iSBN) { // setter modifica el atributo ISBN
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumpaginas() {
		return numpaginas;
	}

	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}

	
	// CREAMOS UN METEDO MOSTRAR PARA LUEGO MOSTRAR
	public String mostrar() {
		return "El libro "+titulo+"con isbn " +ISBN + " creado por autor " +autor + " numeros que paginas que tiene " +numpaginas;
		
	}

}
