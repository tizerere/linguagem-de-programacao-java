package Hospital;

public class Enfermeiro extends Profissional {
	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		if (setor!= null && !setor.isBlank()) {
			this.setor = setor;
		}
	}
	
	public void exibirDados() {
		System.out.println("nome: " + getNome());
		System.out.println("registro: " + getRegistro());
		System.out.println("turno: " + getTurno());
		System.out.println("Setor: " + getSetor());
	}
	
}
