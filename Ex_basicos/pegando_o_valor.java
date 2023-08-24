package Ex_basicos;
import java.util.Scanner;
public class pegando_o_valor {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int idade;
            System.out.print("Digite a sua idade: ");
            idade = entrada.nextInt();

            System.out.print("Sua idade é: "+ idade);
        }
        }
}
