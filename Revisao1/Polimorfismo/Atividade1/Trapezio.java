package Revisao1.Polimorfismo.Atividade1;

public class Trapezio extends FormaGeometrica {
    
    private double base_maior, base_menor, altura;

    public Trapezio( double base_maior, double base_menor, double altura){
        this.base_maior = base_maior;
        this.base_menor = base_menor;
        this.altura = altura;
    }

    public double calcularArea(){
        return ((base_maior * base_menor) * altura) / 2;
    }
}
