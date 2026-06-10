package programacao;

public class App {
	public static void main(String[] args) {
		Garrafa g1 = new Garrafa();
    
    	g1.marca = "TermicaX";
    	g1.capacidade = 500;
    	g1.material = "Plastico";
    
    	g1.abrir();
    	g1.mostrarEstado();
	}
}
