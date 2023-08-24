package Ex_basicos;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de termos: ");
            int n1 = 0, n2 = 1;
            for (int qtd = x.nextInt(); qtd > 0; qtd--) {
                System.out.print(n1 + " ");
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }
    }
}
