package banco;

public class Banco {
	
	// Atributos
	public int numero;
	public String titular;
	public double saldo;
	
	// Construtor
	public Banco(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	
	}
	public Banco(int numero, String titular, double incialDeposito) {
		super();
		this.numero = numero;
		this.titular = titular;
		deposito(incialDeposito);
	}
	
	// Getters e Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	// Método para acrescentar
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	// Método para decrementar
	public void retirar(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	
	public String toString() {
		return "Conta: "
				+ numero
				+ ", Titular: "
				+ titular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
	
}
