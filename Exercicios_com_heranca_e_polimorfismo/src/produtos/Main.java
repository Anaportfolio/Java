package produtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Criando a lista
		ArrayList<Product> lista = new ArrayList<>();
		
		// Pegando o número de produtos
		System.out.print("Insira o número de produtos: ");
		int n = sc.nextInt();
		
		// Pegando os dados do produto
		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i) : ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			
			// Verificando se o produto é comum, usado e importado
			if (type == 'c') {
				lista.add(new Product(name, price));
			}
			else if (type == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				lista.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Taxa de importação: ");
				double customsFee = sc.nextDouble();
				lista.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		// Exibindo a lista de produtos e seus preços 
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO: ");
		for (Product product : lista) {
			System.out.println(product.priceTag() + "\n");
		}
		
		sc.close();
	}
}
