package Threads.Exemplo5;

public class Teste {
    public static void main(String[] args) {
        
        Contagem con1 = new Contagem("1");
        Contagem con2 = new Contagem("2");

        Thread thread1 = new Thread(con1);
        Thread thread2 = new Thread(con2);

        thread1.start();
        thread2.start();

        System.out.println("Já iniciou as Threads");

        System.exit(0);
    }

}
