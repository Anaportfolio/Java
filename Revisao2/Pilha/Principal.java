package Revisao2.Pilha;

import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        
        // Criando a Pilha
        Stack<Tarefa> pilha = new Stack<>();

        // Dados das Tarefas
        Tarefa t1 = new Tarefa();
        t1.desc = "Pesquisa";
        t1.resp = "Joao";
        t1.prazo = 2;

        Tarefa t2 = new Tarefa();
        t2.desc = "Doumento";
        t2.resp = "Davi";
        t2.prazo = 4;

        Tarefa t3 = new Tarefa();
        t3.desc = "Desenvolvimento";
        t3.resp = "Maria";
        t3.prazo = 6;

        pilha.push(t1);
        pilha.push(t2);
        pilha.push(t3);


        // Exibindo os dados
        for(Tarefa t : pilha){
            System.out.print(t.desc + "\n" + t.resp +"\n" + t.prazo + "\n" + "\n");
        }
    }
}
