package raio_do_circulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
	
		System.out.print("Digite o raio: ");
		float raio = dado.nextFloat();
		
		float pi = (float) 3.14159; 
		
		float area = pi * raio *raio;
		
		System.out.print("A área é: " + area);
		
		dado.close();
		

	}

}
