package programacao;

public class Instrutor extends Pessoa{
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade != null && !especialidade.isBlank()) {
			this.especialidade = especialidade;
		}
	}
	public void exibirInstrutor() {
		System.out.println("nome: " + getNome());
		System.out.println("idade: " + getIdade());
		System.out.println("Especialidade: " + getEspecialidade());
	}
	

}
