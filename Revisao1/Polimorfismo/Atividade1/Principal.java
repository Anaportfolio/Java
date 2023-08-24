package Revisao1.Polimorfismo.Atividade1;

public class Principal {
    public static void main(String[] args) {
        
        FormaGeometrica f [] = new FormaGeometrica[4];
        f [0] = new Triangulo(10, 5);
        f [1] = new Quadrado(5);
        f [2] = new Circunferencia(2);
        f [3] = new Trapezio(10, 5, 3);

        for (int i = 0; i < f.length; i++){
            System.out.println("Área: " + f [i].calcularArea());
        }
    }
}
