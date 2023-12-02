package calculando_retangulo;

public class Retangulo {

	// Atributos
	public double width;
	public double height;

	// Método para calcular a Area 
	public double retanguloArea() {
		return width * height;
	}
	
	// Método para calcular o Perímetro
	public double retanguloPerimeter(){
		return 2 * (width + height);
	}
	
	// Método para calcular a Diagonal
	public double retanguloDiagonal() {
		return Math.sqrt(width + height * width + height);
	}
}
