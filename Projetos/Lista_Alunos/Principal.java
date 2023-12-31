package Projetos.Lista_Alunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        // Pegando a quantidade de Alunos 
        try (Scanner valor = new Scanner(System.in)) {
            System.out.print("Digite o número de alunos: ");
            int numDeAlunos = valor.nextInt();

            // Criando o Array Alunos
            ArrayList <Aluno> aluno = new ArrayList<Aluno>();

            // Pegando informações dos Alunos 
            for(int i = 1; i<=numDeAlunos; i++){
                System.out.println(i + "°" + "Aluno"); 
                valor.nextLine();

                System.out.print("Digite o nome do aluno: ");
                String nameAluno = valor.nextLine();

                System.out.print("Digite o RA do aluno: ");
                String raAluno = valor.nextLine();

                System.out.print("Digite o curso do aluno: ");
                String cursoAluno = valor.nextLine();

                System.out.print("Digite o semestre: ");
                int semestreAluno = valor.nextInt();

                // Chamando o construtor 
                Aluno alunos = new Aluno();

                alunos.setName(nameAluno);
                alunos.setRa(raAluno);
                alunos.curso.setName(cursoAluno);
                alunos.curso.setSemestre(semestreAluno);
                aluno.add(alunos);

            }

            System.out.println("------------------------------------------------------------------");
            
            // Exibindo os dados dos Alunos
            System.out.println("LISTA DE ALUNOS");
            for( Aluno alunos : aluno){
                System.out.print( "Nome: "+ alunos.getName()+ "\n" + " seu RA é: " + alunos.getRa()+ "\n" + " o curso cursado é: " + alunos.curso.getName() + "\n" +" está no semestre: " + alunos.curso.getSemestre() +"°" +"\n" + "\n");
            }
            
        }
    }
}