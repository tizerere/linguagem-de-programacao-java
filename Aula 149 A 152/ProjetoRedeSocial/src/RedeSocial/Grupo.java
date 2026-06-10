package RedeSocial;

public class Grupo {
	String nomeGrupo,tema;
	int quantidadeMembros;
	
	void mostrarGrupo() {
		System.out.println("\"--- Novo Grupo ---");
		System.out.println("Nome do grupo: " + nomeGrupo);
		System.out.println("tema: " + tema);
		System.out.println("Quantidade de membros: " + quantidadeMembros);
	}	
	
}
