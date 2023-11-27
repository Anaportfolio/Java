package equacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int A = valor.nextInt();
		
		System.out.print("Digite o valor B: ");
		int B = valor.nextInt();
		
		System.out.print("Digite o valor C: ");
		int C = valor.nextInt();
		
		System.out.print("Digite o valor D: ");
		int D = valor.nextInt();
		
		int diferenca = A * B - C * D;
		
		System.out.print("A diferença é: " + diferenca);
		
		
		valor.close();

	}

}
