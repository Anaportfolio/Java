package peca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Digite o código da peça 1: ");
		int cod1 = dado.nextInt();
		
		System.out.print("Digite a quantidade da peça 1: ");
		int qtd1 = dado.nextInt();
		
		System.out.print("Digite o valor unitário da peça 1: ");
		double valor1 = dado.nextFloat();
		
		System.out.print("Digite o código da peça 2: ");
		int cod2 = dado.nextInt();
		
		System.out.print("Digite a quantidade da peça 2: ");
		int qtd2 = dado.nextInt();
		
		System.out.print("Digite o valor unitário da peça 2: ");
		double valor2 = dado.nextFloat();
		
		double total = qtd1 * valor1 + qtd2 * valor2;
		
		System.out.print("Código da peça 1: " + cod1 + "\n");
		System.out.print("Código da peça 2: " + cod2 + "\n");
		  System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		dado.close();
		
		
	}

}
