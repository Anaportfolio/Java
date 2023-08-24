package Polimorfismo.Atividade1;

public class Circunferencia extends FormaGeometrica {
    
    private double r ;

    double pi = 3.14;

    public Circunferencia(double r){
        this.r = r;
    }

    public double calcularArea(){
        return pi*r*r;
    }
}
