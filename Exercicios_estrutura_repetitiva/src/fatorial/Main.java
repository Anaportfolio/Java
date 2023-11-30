package fatorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = valor.nextInt();
		
		int fat = 1;
		for (int i = 1; i <= n; i++) {
			
			fat = fat * i;
		}
		
		System.out.print("O fatorial de " + n + " é: " + fat);
		
		valor.close();

	}

}
