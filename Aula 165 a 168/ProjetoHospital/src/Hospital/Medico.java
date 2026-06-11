package Hospital;

public class Medico extends Profissional {
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade!= null && !especialidade.isBlank()) {
			this.especialidade = especialidade;
		}
	}
	
	public void exibirDados() {
		System.out.println("nome: " + getNome());
		System.out.println("registro: " + getRegistro());
		System.out.println("turno: " + getTurno());
		System.out.println("Especialidade: " + getEspecialidade());
	}
}
