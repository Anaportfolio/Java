package soma_vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Quantidade dos vetores
		System.out.print("Quanto valores vai ter cada vetor? ");
		int n = sc.nextInt();

		// Criando os vetores
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		// Valores do vetor A
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite os valores do vetor A: ");
			vetorA[i] = sc.nextInt();

		}

		// Valores do vetor B
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite os valores do vetor B: ");
			vetorB[i] = sc.nextInt();
		}

		// Somado os vetores A e B
		for (int i = 0; i < vetorC.length ; i++) {
			
			vetorC[i] = vetorA[i] + vetorB[i];
			
		}
		
		//Exibindo o Vetor C
		System.out.println("VETOR RESULTANTE:");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%d\n", vetorC[i]);
	    }

		sc.close();

	}

}
