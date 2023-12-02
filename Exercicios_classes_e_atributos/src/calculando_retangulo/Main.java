package calculando_retangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		// Pegando a altura e a largura
		System.out.print("Digite a altura: ");
		retangulo.height = valor.nextDouble();
		System.out.print("Digite a largura: ");
		retangulo.width = valor.nextDouble();
		
		// Exibindo os resultados
		System.out.printf("Area: %.2f%n", retangulo.retanguloArea());
		System.out.printf("Perímetro: %.2f%n", retangulo.retanguloPerimeter());
		System.out.printf("Diagonal: %.2f%n", retangulo.retanguloDiagonal());
		
		valor.close();

	}

}
