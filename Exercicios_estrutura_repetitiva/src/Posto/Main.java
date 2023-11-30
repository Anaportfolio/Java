package Posto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Digite o código: ");
		int cod = dado.nextInt();
		
		int alcool = 0, gasolina = 0, diesel = 0;
		while (cod != 4) {
			if (cod == 1) {
				alcool = alcool + 1;
			}
			else if (cod == 2) {
				gasolina = gasolina + 1;
			}
			else if (cod == 3) {
				diesel = diesel + 1;
			}
			
			System.out.print("Digite o código: ");
			cod = dado.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.print("Alcool: " + alcool + "\n");
		System.out.print("Gasolina: " + gasolina + "\n");
		System.out.print("Diesel: " + diesel);
		dado.close();

	}

}
