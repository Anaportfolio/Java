package Verificacao_de_senha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = valor.nextInt();
		
		
		while (senha != 2549) {
			System.out.print("Senha Invalida \n");
			System.out.print("Digite a senha: ");
			senha = valor.nextInt();
			
		}
		
		System.out.print("Acesso Permitido");
		
		valor.close();
		

	}

}
