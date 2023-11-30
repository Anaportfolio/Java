package cordenadas_quadrante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = valor.nextInt();
		System.out.print("Digite o valor de Y: ");
		int y = valor.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.print("Primeiro Quadrante \n");
			}
			else if (x < 0 && y > 0) {
				System.out.print("Segundo Quadrante \n");
			}
			else if (x < 0 && y < 0) {
				System.out.print("Terceiro Quadrante \n");
			}
			else {
				System.out.print("Quarto Quadrante \n");
			}
			
			System.out.print("Digite o valor de X: ");
			x = valor.nextInt();
			System.out.print("Digite o valor de Y: ");
			y = valor.nextInt();
		}
		
		System.out.print("Programa Encerrado");
		valor.close();

	}

}
