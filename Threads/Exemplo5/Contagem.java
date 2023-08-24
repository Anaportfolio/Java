package Threads.Exemplo5;

public class Contagem extends Thread {
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
