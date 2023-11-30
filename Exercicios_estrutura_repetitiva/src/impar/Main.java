package impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = valor.nextInt();
		
		for (int i = 1; i < x; i++) {
			if (i % 2 != 0) {
				System.out.print(i + "\n");
			}
		}

		valor.close();
	}

}
