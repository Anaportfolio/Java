package Revisao1.Threads.Exemplo1;

public class Contagem implements Runnable {
    
    String numero;

    public Contagem (String numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int i = 0; i<=1000; i++){
            System.out.println("Thread " + numero + " - " + String.valueOf(i));
        }
    }
    
    
}
