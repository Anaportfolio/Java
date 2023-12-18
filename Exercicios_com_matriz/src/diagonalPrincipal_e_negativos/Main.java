package diagonalPrincipal_e_negativos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		// Pequnado a quantidade
		System.out.print("Digite a quantidade? ");
		int n = valor.nextInt();

		// Criando uma Matriz
		int[][] matriz = new int[n][n];

		// Pegando os valores 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite os valores: ");
				matriz[i][j] = valor.nextInt();
			}
		}

		// Pegando a Diagonal Principal
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();

		// Pegando a quantidade de valores negativos
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Números negativos:  " + count);

		valor.close();
	}

}
