package soma_vetor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pegando a quantidade de elemntos do Vetor
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		// Criando um Vetor
		double[] vetor = new double[n];

		// Pegando os valores digitados
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		// Fazendo a Soma e a Média
		double soma = 0, media = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			media = soma / vetor.length;
		}
		
		
		// Exibindo o resultado
		System.out.print("VALORES: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.printf("\nSOMA: %.2f" , soma);
		System.out.printf("\nMÉDIA: %.2f" , media);
		sc.close();

	}

}
