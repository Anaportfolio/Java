package Polimorfismo.Exemplo;

public class Principal {
    public static void main(String[] args) {

        FormaGeomatrica f [] = new FormaGeomatrica[2];
        f [0] = new Quadrado(10);
        f [1] = new Triangulo(10, 20);

        for (int i = 0; i < f.length; i++){
            System.out.println("Área: " + f[i].getArea());
        }
    }
}
