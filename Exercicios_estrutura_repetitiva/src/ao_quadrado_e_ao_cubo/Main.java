package ao_quadrado_e_ao_cubo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = valor.nextInt();
		
		int quadrado,cubo;
		for (int i = 1; i <= n; i++) {
			
			quadrado = i * i;
			cubo = i * i * i;
			
			System.out.printf("%d %d %dn", n, quadrado, cubo);
		}
		
		valor.close();

	}

}
