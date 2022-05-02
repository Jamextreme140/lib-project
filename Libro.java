package lib_project;

public class Libro extends Acervo implements Prestable {
	
	private boolean prestado;
	
	public Libro(String codigo, String titulo, int an_p) {
		super(codigo, titulo, an_p);
		this.prestado = false;
	}

	@Override
	public boolean Prestado() {
		return prestado;
	}

	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public String toString() {
		return "Libro [" + super.toString() + ", prestado=" + prestado + "]";
	}
	
	

}
