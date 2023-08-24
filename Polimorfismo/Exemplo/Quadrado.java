package Polimorfismo.Exemplo;

public class Quadrado extends FormaGeomatrica{
    private double lado;

    public Quadrado(double lado){
        this.lado= lado;
    }

    @Override
    public double getArea(){
        return lado * lado;
    }
}
