import java.lang.reflect.Array;

public class BuscarLibro {
	private String título;
	private String autores;
	private int anio;
	private int ISBN;
	private int páginas;
	private int numEjemplares;

	// Constructor
	public BuscarLibro(String título, String ISBN , String autores) {
		this.título = título;
		this.autores = autores;
		this.ISBN = Integer.parseInt(ISBN);

	}

	//Funcion busca un libro por el título y devuelva si está encontrado
	public boolean buscarLibro(String titulo) {
		if (titulo.equals(título)) {
			return true;
		}
		else {
			return false;
		}
	}
	//getters y setters
	public String getTitulo() {
		return título;
	}
	public void setTitulo(String título) {
		this.título = título;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(Array autores) {
		this.autores = autores.toString();
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public int getPáginas() {
		return páginas;
	}
	public void setPáginas(int páginas) {
		this.páginas = páginas;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}



}