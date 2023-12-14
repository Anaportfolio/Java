package media_pares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pegando a quantidade de elementos do vetor
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		// Pegando os valores do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		// Calculando a Média dos números pares
		int soma = 0, numPares = 0;
		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				numPares++;
			}
		}
		if (numPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = (double) soma / numPares;
		}

		// Exibindo o resultado
		System.out.printf("MEDIA DOS PARES: %.1f", media);

		sc.close();
	}
}
