package contribuintes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<TaxPayer> lista = new ArrayList<>();

		// Pegando o número de contribuintes
		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();

		// Pegando os dados dos contribuintes
		for (int i = 1; i <= n; i++) {
			System.out.println("contribuintes #" + i + ": ");
			System.out.print("Individual ou Companhia (i/c): ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Redimento anual: ");
			double income = sc.nextDouble();
			
			// Verificando se o contribuinte é Individual ou Companhia
			if (type == 'i') {
				System.out.print("Despensas de saúde: ");
				double healthExpenditures = sc.nextDouble();
				lista.add(new Individual(name, income, healthExpenditures));
			}
			else {
				System.out.print("Número de empregados: ");
				int numberOfEmployees = sc.nextInt();
				lista.add(new Company(name, income, numberOfEmployees));
			}
		}

		// Exibindo os Impostos 
		double sum = 0.0;
		System.out.println();
		System.out.println("Impostos pagos: ");
		for (TaxPayer taxPayer : lista) {
			double tax = taxPayer.tax();
			System.out.println(taxPayer.getName() + " $" + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("Impostos totais: $" + String.format("%.2f", sum));
		
		sc.close();
	}
}
