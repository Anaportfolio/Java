package Revisao1.Polimorfismo.Atividade1;

public class Triangulo extends FormaGeometrica {
    
    private double base, altura;

    public Triangulo( double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
}
