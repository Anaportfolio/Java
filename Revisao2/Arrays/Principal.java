package Revisao2.Arrays;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Aluno> aluno = new ArrayList<Aluno>();

        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setRa("HE7R8A");
        a1.curso.setNome("Ciencia da Computacao");
        a1.curso.setSemestre(4);
        aluno.add(a1);

        Aluno a2 = new Aluno();
        a2.setNome("Maria");
        a2.setRa("HUE548");
        a2.curso.setNome("Engenharia");
        a2.curso.setSemestre(2);
        aluno.add(a2);

        for(int i = 0; i <= aluno.size(); i++){
            Aluno encontrado = aluno.get(i);
            System.out.println("Nome: " + encontrado.getNome() + "\n" + "RA: " + encontrado.getRa() + "\n" + "Curso: " + encontrado.curso.getNome() + "\n" + "Semestre: " + encontrado.curso.getSemestre() + "\n");
        }

        aluno.remove(a2);
        for(int i = 0; i <= aluno.size(); i++){
            Aluno encontrado = aluno.get(i);
            System.out.println("Nome: " + encontrado.getNome() + "\n" + "RA: " + encontrado.getRa() + "\n" + "Curso: " + encontrado.curso.getNome() + "\n" + "Semestre: " + encontrado.curso.getSemestre() + "\n");
        }

        Aluno a3 = new Aluno();
        a3.setNome("Davi");
        a3.setRa("UEJ96E");
        a3.curso.setNome("Engenharia");
        a3.curso.setSemestre(3);
        aluno.add(a3);

        for(int i = 0; i <= aluno.size(); i++){
            Aluno encontrado = aluno.get(i);
            System.out.println("Nome: " + encontrado.getNome() + "\n" + "RA: " + encontrado.getRa() + "\n" + "Curso: " + encontrado.curso.getNome() + "\n" + "Semestre: " + encontrado.curso.getSemestre() + "\n");
        }


        for(int i = 0; i <= aluno.size(); i++){
            Aluno encontrado = aluno.get(i);
            System.out.println("Nome: " + encontrado.getNome() + "\n" + "RA: " + encontrado.getRa() + "\n" + "Curso: " + encontrado.curso.getNome() + "\n" + "Semestre: " + encontrado.curso.getSemestre() + "\n");
            
            if("Engenharia".equals(aluno.get(i).curso.getNome())){
                System.out.println(aluno.get(i));
            }
            else{
                System.out.println(aluno.get(i));
            }
        }
    }
}
