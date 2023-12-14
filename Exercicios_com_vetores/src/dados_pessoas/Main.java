package dados_pessoas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, qtdhomens, qtdmulheres;
		double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

		// Pequando a quantidade de elementos 
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		// Criando os vetores
		double[] alturas = new double[n];
		char[] generos = new char[n];

		// Pegando os dados	
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
		}

		menoraltura = alturas[0];
		maioraltura = alturas[0];

		// Verificando Maior altura e Menor altura
		for (int i = 1; i < n; i++) {
			if (alturas[i] > maioraltura) {
				maioraltura = alturas[i];
			}
			if (alturas[i] < menoraltura) {
				menoraltura = alturas[i];
			}
		}

		qtdhomens = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'M') {
				qtdhomens++; // Quantidade de hoemens
			} else {
				qtdmulheres++;
				alturafemtotal = alturafemtotal + alturas[i]; // Somando a altura de todas as mulheres
			}
		}

		alturafemMedia = alturafemtotal / qtdmulheres; // Calculando a Média

		// Exibindo o resultado
		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
		System.out.printf("Numero de homens = %d\n", qtdhomens);

		sc.close();

	}

}
