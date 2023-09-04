package Revisao2.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Principal {
    public static void main(String[] args) {

        // Criando uma Queue
        Queue<Pessoa> fila = new LinkedList<Pessoa>();

        // Adionando os dados das Pessoas 
        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setTel("552478765");
        p1.setEmail("maria@gmail.com");

        Pessoa p2 = new Pessoa();
        p2.setNome("Joao");
        p2.setTel("552485646");
        p2.setEmail("joao@gmail.com");

        Pessoa p3 = new Pessoa();
        p3.setNome("Pedro");
        p3.setTel("6698722");
        p3.setEmail("pedro@gmail.com");

        fila.add(p1);
        fila.add(p2);
        fila.add(p3);

        //  Exibindo os dados das Pessoas 
        for(Pessoa i : fila){
            System.out.println("Nome: " + i.getNome() + "\n" + "Telefone: " + i.getTel() + "\n" + "Email: " + i.getEmail() + "\n");
        }

        // Removendo a primeira Pessoa 
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("REMOVENDO A PRIMEIRA PESSOA");
        fila.remove(p1);
        for(Pessoa i : fila){
            System.out.println("Nome: " + i.getNome() + "\n" + "Telefone: " + i.getTel() + "\n" + "Email: " + i.getEmail() + "\n");
        }

        // Adicionado uma nova Pessoa 
        System.out.println("-----------------------------------------------------------------------");
        
        Pessoa p4 = new Pessoa();
        p4.setNome("Sarah");
        p4.setTel("998745226");
        p4.setEmail("sarah@gmail.com");

        fila.add(p4);

        System.out.println("ADICIONANDO UMA NOVA PESSOA");
        for(Pessoa i : fila){
            System.out.println("Nome: " + i.getNome() + "\n" + "Telefone: " + i.getTel() + "\n" + "Email: " + i.getEmail() + "\n");
        }
    }

}
