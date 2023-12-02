package funcionario;

public class Funcionario {
	
	// Atributos 
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	// Método Salário Líquido
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	// Método incrementando a porcentagem no salário
	public void incrementorSalario(double incremento) {
		salarioBruto += salarioBruto * incremento / 100.0;
	}
	

	public String toString() {
		return nome + " ,$" + String.format("%.2f",salarioLiquido());
	}
	

}
