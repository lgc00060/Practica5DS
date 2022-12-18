import java.lang.reflect.Array;
import java.util.Date;

public class ReservarLibro {

	//Atributos
	private String titulo;
	private String ISBN;
	private String autor;
	private Date fechaReserva;
	private Date fechaDevolucion;

	//Constructor
	public ReservarLibro(String titulo, int ISBN, String autor) {
		this.titulo = titulo;
		this.ISBN = String.valueOf(ISBN);
		this.autor = autor;
	}
	//Funcion que reserva un libro y devuelve si se ha reservado
	public boolean reservarLibro(String titulo) {
		if (titulo.equals(titulo)) {
			return true;
		}
		else {
			return false;
		}
	}


}