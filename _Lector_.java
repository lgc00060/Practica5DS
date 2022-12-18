import java.util.Vector;

public class _Lector_ extends Usuario {
	private String _dirección;
	private String _tipo;
	private boolean _estado;
	protected int _numReservas;
	protected int _limReservas;
	public Vector<Préstamo> _realiza = new Vector<Préstamo>();
	public Ficha_Usuario _posee;

	public void seleccionaLibro() {
		throw new UnsupportedOperationException();
	}

	public void solicitaPrestamo() {
		throw new UnsupportedOperationException();
	}

	public void realizaBúsqueda() {
		throw new UnsupportedOperationException();
	}
}