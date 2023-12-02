package funcionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		// Pegando dados do Funcionario
		System.out.print("Digite o nome do funcionario: ");
		funcionario.nome = dado.next();
		System.out.print("Digite o salário bruto do funcionario: ");
		funcionario.salarioBruto = dado.nextDouble();
		System.out.print("Digite a taxa do funcionario: ");
		funcionario.imposto = dado.nextDouble();

		System.out.println("Empregado: " + funcionario);
		
		// Incrementando a porcentagem 
		System.out.print("Qual é porcentagem para incrementar no salário: ");
		double incremento = dado.nextDouble();
		funcionario.incrementorSalario(incremento);
		
		System.out.print("Atualização: " + funcionario);
		
		dado.close();
		
	}

}
