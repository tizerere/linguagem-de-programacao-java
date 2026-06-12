package Hospital;

public class Profissional {
	private String nome, registro, turno;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isBlank()) {
			this.nome = nome;
		} else {
			System.out.println("nome invalido");
		}
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		if (registro != null && !registro.isBlank()) {
			this.registro = registro;
		} else {
			System.out.println("Registro invalido");
		}
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		if (turno != null && !turno.isBlank()) {
			this.turno = turno;
		} else {
			System.out.println("turno inavlido");
		}
	}

	public void exibirDados() {
		System.out.println("nome: " + getNome());
		System.out.println("registro: " + getRegistro());
		System.out.println("turno: " + getTurno());
	}
}
