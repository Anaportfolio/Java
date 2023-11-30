package media_ponderada;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int n = valor.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite o o valor de A: ");
			double a = valor.nextDouble();
			System.out.print("Digite o o valor de B: ");
			double b = valor.nextDouble();
			System.out.print("Digite o o valor de C: ");
			double c = valor.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		valor.close();

	}

}
