package abaixo_da_media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Pegando a quantidade
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double [] vetor = new double[n];
		
		// Pegando os valores
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		// Calculando a Média 
		double media = 0;
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			media = soma / vetor.length;
		}
		
		// Exibindo a Média e os Valores menores que a média
		System.out.printf("MEDIA DO VETOR: %.3f",media);
		
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");

	    for (int i=0; i<n; i++) {
	        if (vetor[i] < media) {
	        	System.out.printf("%.1f\n", vetor[i]);
	        }
	    }
		sc.close();
	}

}
