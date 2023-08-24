package Revisao1.exercicios.exercicio1;

public class program {
public static void main(String[] args) {
     endereco e = new endereco();

     e.setRua("Brasilino de Paula Ferreira");
     e.setBairro("Vila Paiva");
     e.setCidade("São José dos Campos");
     e.setCep(1548566);
    
     proprietario p = new proprietario();
     p.setNome("Maria");
     p.setCpf(1255422);
     p.setRg(5536977);

     System.out.println("PROPRIETARIO");
     System.out.println("Nome: " + p.getNome());
     System.out.println("CPF: " + p.getCpf());
     System.out.println("RG: " + p.getRg());

     System.out.println("__________________________________________________");

     System.out.println("ENDEREÇO");
     System.out.println("Rua: " + e.getRua());
     System.out.println("Bairro: " + e.getBairro());
     System.out.println("Cidade: " + e.getCidade());
     System.out.println("CEP: " + e.getCep());

     System.out.println("__________________________________________________");

     System.out.println("CARRO");
}

}
