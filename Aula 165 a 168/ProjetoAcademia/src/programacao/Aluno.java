package programacao;

public class Aluno extends Pessoa{
	private String plano;

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		if (plano != null && !plano.isBlank()) {
			this.plano = plano;
		}
	}
	
	public void exibirDados() {
		System.out.println("nome: " + getNome());
		System.out.println("idade: " + getIdade());
		System.out.println("plano: " + getPlano());
	}

	
		
	}
