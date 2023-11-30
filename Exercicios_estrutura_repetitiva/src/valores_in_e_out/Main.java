package valores_in_e_out;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite o valor X: ");
		int x = valor.nextInt();
		
		for (int i = 0; i < x; i++) {
			if (i > 10 && i < 20) {
				System.out.print( i + " In" + "\n");
			}
			else {
				System.out.print(i + " Out" + "\n");
			}
		}
		valor.close();
	}

}
