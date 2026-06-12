package Hospital;

public class Medico extends Profissional {
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade != null && !especialidade.trim().isBlank()) {
			this.especialidade = especialidade;
		} else {
			System.out.println("Especialidade invalida");
		}
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Especialidade: " + getEspecialidade());
	}
}
