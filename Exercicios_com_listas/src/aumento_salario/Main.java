package aumento_salario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		// Criando a Lista
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = dado.nextInt();
		
		// Pegando os dados
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ": ");
			
			System.out.print("Id: ");
			int id = dado.nextInt();
			while (temId(lista, id)) {
				System.out.print("Id em uso. Tente novamente: ");
			}
			
			System.out.print("Nome: ");
			dado.nextLine();
			String nome = dado.nextLine();
			System.out.print("Salario: ");
			double salario = dado.nextDouble();
			
			lista.add(new Funcionario(id, nome, salario));
			
		}
		
		
		// Pegando o valor do aumento
		System.out.println();
		System.out.print("Informe o Id do funcionário que terá aumento salarial: ");
		int id = dado.nextInt();
		Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.print("Esse Id não existe!");
		}
		else {
			System.out.print("Informe a pocentagem: ");
			double porcentagem = dado.nextDouble();
			emp.aumentoSalario(porcentagem);
		}
		
		// Exibindo a lista dos funcionários 
		System.out.println();
		System.out.println("Lista dos Funcionários: ");
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
		
		dado.close();

	}
	
	// Verificando a existência do Id
	public static boolean temId(List<Funcionario> lista, int id) {
		Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
