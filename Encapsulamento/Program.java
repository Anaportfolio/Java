package Encapsulamento;

public class Program {
  public static void main(String[] args) {
      conta c = new conta();

      c.nome = "João";
      c.cpf = "15154887486";
    //c.setSaldo(100.0);
      c.depositar(100.0);
      c.sacar(20.0);

      System.out.println("O seu nome é: " + c.nome);
      System.out.println("O seu cpf é: " + c.cpf);
      System.out.println("Você tem: " + c.getSaldo());
    
  }  
}
