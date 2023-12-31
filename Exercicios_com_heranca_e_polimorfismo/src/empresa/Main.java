package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pegando o número de funcionários 
		System.out.print("Insira o número de funcionários: ");
		int n = sc.nextInt();

		// Criando uma lista 
		ArrayList<Employee> lista = new ArrayList<>();

		// Pegando os dados dos funcionários 
		for (int i = 0; i < n; i++) {
			System.out.println("Empregado #" + i);
			System.out.print("Terceirizado (s/n): ");
			char r = sc.next().charAt(0);
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digita horas trabalhadas: ");
			int hours = sc.nextInt();
			System.out.print("Digite o valor por horas: ");
			double valuePerHour = sc.nextDouble();

			// Verificando se vai ter cobrança adicional 
			if (r == 's') {
				System.out.print("Cobrança adicional: ");
				double addiadditionalCharge = sc.nextDouble();
				lista.add(new OutsourceEmployee(name, hours, valuePerHour, addiadditionalCharge));
			} else {
				lista.add(new Employee(name, hours, valuePerHour));
			}
		}

		// Exibindo o resultado 
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Employee emp : lista) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
