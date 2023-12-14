package alturas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, nmenores;
		double alturatotal, alturamedia, percentualMenores;

		// Pegando a quantidade de elementos dos Vetores
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		// Criando os vetores
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		// Pegando os dados
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}

		// Verificando quem é menor de 16 anos
		nmenores = 0;
		alturatotal = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				nmenores++;
			}
			alturatotal = alturatotal + alturas[i]; // Somando todas as alturas
		}

		alturamedia = alturatotal / n; // Calculando a Média
		percentualMenores = ((double) nmenores / n) * 100.0; // Porcentagem dos menores de 16 anos

		// Exibindo o resultado 
		System.out.printf("\nAltura media = %.2f\n", alturamedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}

		sc.close();

	}

}
