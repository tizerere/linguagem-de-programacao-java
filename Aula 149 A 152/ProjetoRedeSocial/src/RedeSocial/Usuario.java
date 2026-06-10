package RedeSocial;

public class Usuario {
	
     String nome;
     int idade;
     String cidade;

     void mostrarPerfil() {
        System.out.println("--- Perfil do Usuário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade: " + cidade);
    }
}
