package quadrante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner valor = new Scanner(System.in);
		 
		 System.out.print("Digite o valor do X: ");
		 float x = valor.nextFloat();
		 System.out.print("Digite o valor do Y: ");
		 float y = valor.nextFloat();
		 
		 if(x > 0 && y > 0) {
			 System.out.print("Q1");
		 }
		 else if (x < 0 && y > 0) {
			 System.out.print("Q2");
		}
		 else if (x < 0 && y < 0) {
			 System.out.print("Q3");
		}
		 else if (x > 0 && y < 0) {
			 System.out.print("Q4");
		}
		 else if (x == x && y == 0) {
			 System.out.print("Eixo X");
		}
		 else if (x == 0 && y == y) {
			 System.out.print("Eixo Y");
		}
		 else {
			 System.out.print("Origem");
		}
		 
		 valor.close();
	}

}
