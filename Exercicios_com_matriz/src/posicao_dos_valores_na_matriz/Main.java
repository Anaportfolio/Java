package posicao_dos_valores_na_matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		// Pegando a quantidade de linhas e colunas
		System.out.print("Digite a quantidade de linhas: ");
		int m = valor.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int n = valor.nextInt();
		
		// Criando a matriz
		int[][] matriz = new int[m][n];

		// Pegando os valores
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite os valores: ");
				matriz[i][j] = valor.nextInt();
			}
		}

		System.out.print("Digite o valor que quer encontrar: ");
		int x = valor.nextInt();

		// Mostrando as posições
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Para cima: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Abaixo: " + matriz[i + 1][j]);
					}
				}
			}
		}

		valor.close();

	}

}
