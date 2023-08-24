package Revisao2.Arrays;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList <Aluno> aluno = new ArrayList<>();

        Aluno a1 = new Aluno();
        a1.setName("João");
        a1.setRa("pq123");
        a1.curso.setName("Ciência da computação");
        a1.curso.setSemestre(4);

        Aluno a2 = new Aluno();
        a2.setName("Ana");
        a2.setRa("cf433");
        a2.curso.setName("Adiministração");
        a2.curso.setSemestre(2);

        for (int i = 0; i < aluno.size(); i++){

            Aluno encontrado = aluno.get(i);
            
            System.out.println(encontrado.getName());
            System.out.println(encontrado.getRa());
        }
    }
}
