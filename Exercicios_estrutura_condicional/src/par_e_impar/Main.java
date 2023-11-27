package par_e_impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = valor.nextInt();
		
		if (n % 2 == 0) {
			System.out.print("Par");
		} else {
			System.out.print("Ímpar");
		}
		
		valor.close();
	}

}
