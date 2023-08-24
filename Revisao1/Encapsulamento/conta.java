package Revisao1.Encapsulamento;

public class conta {
    public String nome;
    public String cpf;
    private Double saldo;
    
    public conta() {
        saldo = 0.0;
    }

    public conta(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public Double getSaldo(){
        return saldo;
    }

    /**public void setSaldo(double saldo){
       this.saldo = saldo;
    }**/

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        if (saldo > valor){
            saldo = saldo - valor;
        }
    }
}
