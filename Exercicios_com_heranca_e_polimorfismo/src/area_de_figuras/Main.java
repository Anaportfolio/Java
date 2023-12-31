package area_de_figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		// Pegando o número de formas 
		System.out.print("Insira o número de formas: ");
		int n = sc.nextInt();

		// Pegando os dados das formas
		for (int i = 1; i <= n; i++) {
			System.out.println("Forma #" + i + ": ");
			System.out.print("Retângulo ou Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			// Verificando se a forma é um Retângulo ou um Circulo
			if (ch == 'r') {
				System.out.print("Largura: ");
				double width = sc.nextDouble();
				System.out.print("Altura: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		// Exibindo a area das formas 
		System.out.println();
		System.out.println("Area das Formas:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();

	}

}
