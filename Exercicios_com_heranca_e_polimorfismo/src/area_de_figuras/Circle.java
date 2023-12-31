package area_de_figuras;

public class Circle extends Shape {

	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	// Calculando area do circulo 
	@Override
	public double area(){
		return Math.PI * radius * radius;
	}
}
