package Aluno;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.nome = "Davi";
		a1.ano = 7;
		a1.periodo = "Manhã";
		
		
		Aluno a2 = new Aluno();
		a2.nome = "Maria";
		a2.ano = 9;
		a2.periodo = "Tarde";
		
//	Instanciando	
		JDBC jdbc = new JDBC();
		
		jdbc.SalvarAluno(a1);
		jdbc.ExcluirAluno(a2);
		

//	Exibindo os alunos inseridos e excluidos
		List<Aluno> alunos = jdbc.ListarAlunos();
		
		for (int i = 0; i <= alunos.size()-1; i++) {
			
			System.out.println(alunos.get(i).nome);
			System.out.println(alunos.get(i).ano);
			System.out.println(alunos.get(i).periodo);
		}
	}
}
