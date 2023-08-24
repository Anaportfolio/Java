package Heranca.Aividade1;

public class principal {
public static void main(String[] args) {

    Ponto2D ponto2 = new Ponto2D();
    ponto2.x = 10;
    ponto2.y = 15;

    Ponto3D ponto3 = new Ponto3D();
    ponto3.x = 50;
    ponto3.y = 30;
    ponto3.z = 40;


    // Exibindo os valores do Arquivo 2D
    System.out.print("Os valores do ponto 2D são: "+ ponto2.toString() + "\n");

    System.out.print("Os valores do ponto 3D: " + ponto3.toString());
}
}
