package RedeSocial;

public class Postagem {
	int curtidas;
	String Autor;
	
	void mostrarPostagem() {
		 System.out.println("\"--- Nova Postagem ---");
		 	System.out.println("Estudando Java Hoje!");
	        System.out.println("Autor: " + Autor);
	        System.out.println("Curtidas: " + curtidas);
	    }
}
