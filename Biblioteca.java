package lib_project;

public class Biblioteca {

	public static void main(String[] args) {
		Libro j2se = new Libro("AC23X", "Java 2", 2003);
		Revista AccMag = new Revista("EC67Y", "Acceleration Magazine", 2020, 140);
		
		System.out.println(j2se.toString());
		System.out.println(AccMag.toString());

	}

}
