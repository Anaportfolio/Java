package funcionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Digite o número do Funcionario: ");
		int numero = dado.nextInt();
		
		System.out.print("Digite horas trabalhadas do Funcionario: ");
		int horas = dado.nextInt();
		
		System.out.print("Digite o valor recebido por hora: ");
		float valor = dado.nextFloat();
		
		float salario = valor * horas;
		
		System.out.print("Número do Funcionario: " + numero);
		System.out.printf("Salário: R$ %.2f",salario);
		
		dado.close();

	}

}
