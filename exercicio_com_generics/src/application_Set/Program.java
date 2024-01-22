package application_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Criando listas que evitam repetição
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		// Pegando dados do curso A
		System.out.print("Quantos estudantes cursam A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number); // Adicionando na lista A
		}
		
		// Pegando os dados do curso B
		System.out.print("Quantos estudantes cursam B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			b.add(number); // Adicionando na lista B 
		}
		
		// Pegando os dados do curso C
		System.out.print("Quantos estudantes cursam C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			c.add(number); // Adicionando na lista C 
		}
		
		// Unindo a lista A,B e C na lsita Total 
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b); // união
		total.addAll(c); // união 
		
		// Exibindo o resultado 
		System.out.println("Total de estudantes: " + total.size());
		
		sc.close();
	}

}
