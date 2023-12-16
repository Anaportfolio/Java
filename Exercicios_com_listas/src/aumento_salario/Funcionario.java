package aumento_salario;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	// Construtor
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	// Getters e Setters 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	// Calculando o aumento
	public void aumentoSalario( double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}

	@Override
	public String toString() {
		return "id: " + id + ", nome: " + nome + ", salario: " + String.format("%.2f", salario) + "\n";
	}
	
	
}
