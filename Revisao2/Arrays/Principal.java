package Revisao2.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  
    public static void main(String[] args) {
        
        try (// Pegando a quantidade de Itens da lista 
        Scanner valor = new Scanner(System.in)) {
            System.out.print("Digite o número de intes da lista: ");
            int numItem = valor.nextInt();
            // System.out.print("A quantidade de intes é: " + numItem);

            // Criando a Lista Alunos
            ArrayList <Aluno> aluno = new ArrayList<Aluno>();

            // Pegando informações dos Alunos 
            for(int i = 1; i<=numItem; i++){
                System.out.println(i + "°" + "Aluno");
                valor.nextLine();
                System.out.print("Digite o nome do aluno: ");
                String nameAluno = valor.nextLine();
                System.out.print("Digite o RA do aluno: ");
                String raAluno = valor.nextLine();

                Aluno alunos = new Aluno();

                alunos.setName(nameAluno);
                alunos.setRa(raAluno);
                aluno.add(alunos);

            }

            System.out.println("------------------------------------------------------------------");
            
            // Exibindo a Lista de Alunos
            System.out.println("LISTA DE ALUNOS");
            for( Aluno alunos : aluno){
                System.out.print( "Nome: "+ alunos.getName() + " RA: " + alunos.getRa() + "\n");
            }
        }
    }
}
