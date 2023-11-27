package intervalo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		float n = valor.nextFloat();
		
		if (n >= 0 && n < 24) {
			System.out.print("Intervalo [0,25]");
		}
		else if (n >= 25 && n < 49) {
			System.out.print("Intervalo [25,50]");
		}
		else if (n >= 50 && n < 74) {
			System.out.print("Intervalo [50,75]");
		}
		else if (n >=75 && n <= 100) {
			System.out.print("Intervalo [75,100]");
		}
		else {
			System.out.print("Fora de intervalo");
		}
		
		valor.close();

	}

}
