package lib_project;

public abstract class Acervo {
	private String codigo, titulo;
	private int an_p;
	
	public Acervo(String codigo, String titulo, int an_p) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.an_p = an_p;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAn_p() {
		return an_p;
	}
	public void setAn_p(int an_p) {
		this.an_p = an_p;
	}
	
	@Override
	public String toString() {
		return "[codigo=" + codigo + ", titulo=" + titulo + ", an_p=" + an_p;
	}
	
	

}
