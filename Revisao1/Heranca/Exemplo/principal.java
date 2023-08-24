package Revisao1.Heranca.Exemplo;

public class principal {
public static void main(String[] args) {
    Juridica j = new Juridica();
    j.setNome("Universidade Paulista");
    j.setCnpj("1234567/001-12");

    Fisica f = new Fisica();
    f.setNome("Larrisa Lima");
    f.setEmail("123.456.789-12");

    System.out.print("O nome da pessoa juridica é: " + j.getNome() + "\nA CNPJ é: " + j.getCnpj() + "\nO nome da pessoa Física é: " + f.getNome() + "\nO email é: " + f.getEmail());
}

}
