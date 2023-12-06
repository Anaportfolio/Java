package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		Banco conta;
		
		// Pegando os dados
		System.out.print("Digite o número da conta: ");
		int numero = dado.nextInt();
		System.out.print("Digite o nome do titular: ");
		dado.nextLine();
		String titular = dado.nextLine();
		
		// Verificando o Depósito
		System.out.print("Existe um valor de depósito inicial [S/N]: ");
		char resposta = dado.next().charAt(0);
		if (resposta == 'S') {
			System.out.print("Digitar o valor do depósito: ");
			double incialDeposito = dado.nextDouble();
			conta = new Banco(numero, titular, incialDeposito);
		}
		else {
			conta = new Banco(numero, titular);
		}
		
		// Exibindo os dados 
		System.out.println();
		System.out.println("BANCO:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digitar o valor do depósito: ");
		double depositValue = dado.nextDouble();
		conta.deposito(depositValue);
		System.out.println("Atualização da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor a ser retirado: ");
		double withdrawValue = dado.nextDouble();
		conta.retirar(withdrawValue);
		System.out.println("Atualização da conta:");
		System.out.println(conta);
		
		dado.close();

	}

}
