package Multiplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		int A,B;
		
		System.out.print("Digite o valor A: ");
		A = valor.nextInt();
		System.out.print("Digite o valor B: ");
		B = valor.nextInt();
		
		if(A % B == 0 || B % A ==0) {
			System.out.print("São Multiplos");
		} else {
			System.out.print("Não são multiplos");
		}

		valor.close();
	}

}
