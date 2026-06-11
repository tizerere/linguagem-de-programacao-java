package Hospital;

public class Profissional {
	private String nome, registro, turno;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;			
		}
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		if (registro!= null && !registro.isBlank()) {
			this.registro = registro;
		}
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		if (turno!= null && !turno.isBlank()) {
			this.turno = turno;
		}
	}
	
	public void exibirDados() {
		System.out.println("nome: " + getNome());
		System.out.println("registro: " + getRegistro());
		System.out.println("turno: " + getTurno());
	}
}
