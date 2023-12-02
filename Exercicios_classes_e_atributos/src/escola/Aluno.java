package escola;

public class Aluno {
	
	// Atributos
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	// Método de somar as Notas
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	// Método para mostrar a Pontuação necessária
	public double verificandoOsPontos() {
		if(notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
	}
	
}
