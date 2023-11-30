package divisao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int n = valor.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite o valor de X: ");
			int x = valor.nextInt();
			System.out.print("Digite o valor de Y: ");
			int y = valor.nextInt();
			
			if (y == 0) {
				System.out.print("Divisão Impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		valor.close();

	}

}
