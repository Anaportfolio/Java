package positivo_e_negativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int n = valor.nextInt();

		if (n >= 0) {
			System.out.print("Positivo");
		} else {
			System.out.print("Negativo");
		}
		
		valor.close();
	}

}
