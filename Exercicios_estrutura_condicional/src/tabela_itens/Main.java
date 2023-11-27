package tabela_itens;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dado = new Scanner(System.in);

		int cod, qtd;
		float valor = 0,total;
		String item;

		System.out.print("Digite o código do item: ");
		cod = dado.nextInt();
		System.out.print("Digite a quantidade: ");
		qtd = dado.nextInt();

		switch (cod) {
		case 1:
			item = "Cachorro Quente";
			valor = (float) 4.00;
			break;
		case 2:
			item = "X-Salada";
			valor = (float) 4.50;
			break;
		case 3:
			item = "X-Bacon";
			valor = (float) 5.00;
			break;
		case 4:
			item = "Torrada Simples";
			valor = (float) 2.00;
			break;
		case 5:
			item = "Refrigerante";
			valor = (float) 1.50;
			break;

		default:
			item = "Não foi encontrado";
			break;
		}
		
		total = valor * qtd;
		
		System.out.print("Item escolhido: " + item + "\n");
		System.out.printf("Total: R$ %.2f", total);
		
		dado.close();
	}

}
