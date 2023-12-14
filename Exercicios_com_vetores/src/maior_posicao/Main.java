package maior_posicao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		int n, posicao;
		double maior;

		// Pegando a quantidade
		System.out.print("Quantos numeros voce vai digitar? ");
		n = valor.nextInt();

		double[] vetor = new double[n];

		// Pegando os valores
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = valor.nextDouble();
		}

		// Encontrando o maior valor 
		maior = vetor[0];
		posicao = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}

		// Exibindo
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

		valor.close();

	}

}
