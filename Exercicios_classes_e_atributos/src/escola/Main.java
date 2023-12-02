package escola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		// Pegando os dados do Aluno
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = dado.next();
		System.out.print("Digite a primeira nota do aluno: ");
		aluno.nota1 = dado.nextDouble();
		System.out.print("Digite a segunda nota do aluno: ");
		aluno.nota2 = dado.nextDouble();
		System.out.print("Digite a terceira nota do aluno: ");
		aluno.nota3 = dado.nextDouble();
		
		System.out.printf("Nota Final: %.2f", aluno.notaFinal());
		
		// Verificando se o Aluno foi aprovado ou não
		if (aluno.notaFinal() < 60.0) {
			System.out.print(" Não foi aprovado!");
			System.out.printf(" Pontuação: %.2f", aluno.verificandoOsPontos());
		}
		else {
			System.out.print(" Foi aprovado!");
		}
		
		dado.close();

	}

}
