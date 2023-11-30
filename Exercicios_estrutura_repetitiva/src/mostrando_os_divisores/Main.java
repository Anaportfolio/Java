package mostrando_os_divisores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		System.out.print("Digite o número: ");
		int n = valor.nextInt();

		System.out.println("Os divisores de " + n + " são:");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print( i + "\n");
			}
		}
		
		valor.close();

	}

}
