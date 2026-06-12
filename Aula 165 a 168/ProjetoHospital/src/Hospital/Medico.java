package Hospital;

public class Medico extends Profissional {
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade!= null && !especialidade.trim().isBlank()) {
			this.especialidade = especialidade;
		}
	}
	@Override
	public void exibirDados() {
		System.out.println("nome: " + getNome());
		System.out.println("registro: " + getRegistro());
		System.out.println("turno: " + getTurno());
		System.out.println("Especialidade: " + getEspecialidade());
	}
}
