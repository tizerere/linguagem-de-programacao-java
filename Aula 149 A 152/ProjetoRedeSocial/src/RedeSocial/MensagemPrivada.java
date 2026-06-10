package RedeSocial;

public class MensagemPrivada {
	String remetente,destinatario,conteudo;
	
	void mostrarMensagem() {
		System.out.println("\"--- Nova MensagemPrivada ---");
		System.out.println("remetente: " + remetente);
		System.out.println("destinatario: " + destinatario);
		System.out.println("Mensagem:  " + conteudo);
	}
}

