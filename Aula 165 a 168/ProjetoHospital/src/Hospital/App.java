package Hospital;

public class App {

	public static void main(String[] args) {
		Medico medico = new Medico();
		System.out.println("=== PROFISSIONAL ===");
		medico.setNome("filipe");
		medico.setRegistro("CRM-245455");
		medico.setTurno("manhã");
		medico.setEspecialidade("Cardiologista");

		medico.exibirDados();

		Enfermeiro enfermeiro = new Enfermeiro();
		System.out.println("=== PROFISSIONAL ===");
		enfermeiro.setNome("Vitor");
		enfermeiro.setRegistro("COREN-786679");
		enfermeiro.setTurno("noite");
		enfermeiro.setSetor("UTI");

		enfermeiro.exibirDados();
	}

}
