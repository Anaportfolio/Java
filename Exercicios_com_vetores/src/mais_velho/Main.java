package mais_velho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, maioridade, posicaomaior;
		
		// Pegando a quantidade de elementos do Vetor
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();

		// Criando os Vetores nomes e  idades
		String[] nomes = new String[n];
		int[] idades = new int[n];

		// Pegando os dados
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		// Verificando quem é o mais velho
		maioridade = idades[0];
		posicaomaior = 0;

		for (int i = 1; i < n; i++) {
			if (idades[i] > maioridade) {
				maioridade = idades[i];
				posicaomaior = i;
			}
		}

		// Exibindo
		System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);

		sc.close();
	}

}
