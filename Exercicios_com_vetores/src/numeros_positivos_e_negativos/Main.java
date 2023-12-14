package numeros_positivos_e_negativos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		// Pegando a quantidade de números
		System.out.print("Digite a quantidade de números: ");
		int n = valor.nextInt();

		// Criando o vetor
		int[] vect = new int[n];

		// Pegando os valores 
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o valor: ");
			vect[i] = valor.nextInt();
		}

		// Verificando quais valores são negativos
		System.out.println("Os valores negativos são: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d\n", vect[i]);
			}
		}

		valor.close();

	}

}
