import java.util.Scanner;
public class cpf {
    public static void main(String[] args) {
        float cpf;
        try (Scanner valor = new Scanner(System.in)) {
            System.out.print("Digite o seu CPF: ");
            cpf = valor.nextInt();
        }
        System.out.print("O seu CPF é: " + cpf);
    }
}
