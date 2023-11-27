package impostos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		double salario = sc.nextDouble();
		
		double imposto = 0;
		if(salario <= 2000.00) {
			
			imposto = 0.0;
		}
		else if (salario <= 3000.00) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.00) {
			imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.08 + 1500.0 * 0.18 + 1000.0 * 0.8;
		}
		if (imposto == 0.0) {
			System.out.print("Insento");
		}
		else {
			System.out.printf("O imposto é: R$ %.2f", imposto);
		}
		
		sc.close();
	}
}
