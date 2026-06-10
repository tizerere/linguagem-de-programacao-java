package RedeSocial;

public class App {
	public static void main(String[] args) {
		 Usuario usuario1 = new Usuario();
	        	       
	        usuario1.nome = "Ana";
	        usuario1.idade = 17;
	        usuario1.cidade = "Valença";
	        	        
	        usuario1.mostrarPerfil();
	        
	        Postagem post1 = new Postagem();
	        
	        post1.curtidas = 15;
	        post1.Autor = "ana";
	        
	        post1.mostrarPostagem();
	        
	        Comentarios comentario1 = new Comentarios();
	        
	        comentario1.Autor = "Bruno";
	        comentario1.curtidas = 4;
	        
	        comentario1.mostrarComentarios();
	        
	        MensagemPrivada mensagem1 = new MensagemPrivada();
	        
	        mensagem1.remetente = "Ana";
	        mensagem1.destinatario = "carlos";
	        mensagem1.conteudo = "Oi Tudo Bem?";
	        
	        mensagem1.mostrarMensagem();
	        
	        Grupo grupo1 = new Grupo();
	        
	        grupo1.nomeGrupo = "Amigos do java";
	        grupo1.tema = "programaçao";
	        grupo1.quantidadeMembros = 28;
	        
	        grupo1.mostrarGrupo();
	        
	        
	}
}
