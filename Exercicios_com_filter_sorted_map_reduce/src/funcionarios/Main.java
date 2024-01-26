package funcionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>(); // Criando a lista 
			
			// Lendo o arquivo 
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1],Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			// Inserindo o salário 
			System.out.print("Entre com o salario: ");
			double salary = sc.nextDouble();
			
			// Colocando o email em ordem alfabética
			List<String> email = list.stream().filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email de pessoas cujo salário é superior a " + String.format("%.2f", salary) + ":");
			email.forEach(System.out::println);
			
			// Somando os salários com funcionarios que começam com M
			double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Soma dos salários das pessoas cujo nome começa com 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
