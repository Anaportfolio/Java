package Revisao1.Ex_basicos;
import java.util.Scanner;
public class real {
    public static void main(String[] args) {
        try (Scanner valor = new Scanner(System.in)) {
            float real,cr,cruzeiro;
            System.out.print("Digite o núemero em reais: ");
            real = valor.nextFloat();
            cr = real * 2750;
            cruzeiro = cr * 1000;
            System.out.print("Cruzeiro Real: " + cr);
            System.out.print("Cruzeiro: " + cruzeiro);
        }
    }
}
