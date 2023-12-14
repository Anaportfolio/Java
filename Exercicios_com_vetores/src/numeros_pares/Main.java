package numeros_pares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		// Pegando a quantidade
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = valor.nextInt();

		int[] vetor = new int[n];

		// Pegando os valores
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = valor.nextInt();
		}

		// Verificando os números pares
		System.out.println("\nNUMEROS PARES:");
		int quantidade = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				quantidade ++;
			}
		}
		
		// Exibindo a quantidade de números pares
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantidade);

		valor.close();
	}

}
