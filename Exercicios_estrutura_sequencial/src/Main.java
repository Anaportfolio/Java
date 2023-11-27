import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int n1 = valor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int n2 = valor.nextInt();
		
		int r = n1 + n2;
		
		System.out.print("SOMA = " + r);
		
		valor.close();

	}

}
