package lib_project;

public class Revista extends Acervo {
	
	private int num;

	public Revista(String codigo, String titulo, int an_p, int num) {
		super(codigo, titulo, an_p);
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Revista [num=" + num + ", " + super.toString() + "]";
	}

}
