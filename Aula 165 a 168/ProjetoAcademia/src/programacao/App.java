package programacao;

public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Filipe");
		aluno.setIdade(16);
		aluno.setPlano("Mensal");
		
		aluno.exibirDados();
		
		Instrutor instrutor = new Instrutor();
		
		instrutor.setNome("Vitor");
		instrutor.setIdade(27);
		instrutor.setEspecialidade("Tec.desenvolvimento de sistemas");
		
		instrutor.exibirInstrutor();
	}

}
