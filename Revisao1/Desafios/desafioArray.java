package Revisao1.Desafios;
import java.util.Scanner;


public class desafioArray {
public static void main(String[] args) {

        // Variável
        int indice;
        int i;
        // Recebendo a quantidade de indices do Array
        try (Scanner valor = new Scanner(System.in)){
            System.out.print("Digite o número de índices do Array: ");
            indice = valor.nextInt();
            System.out.print("A quantidade de índices é: " + indice + "\n");

            // Criando um Array
            int array[] = new int[indice];

            // Pegando e mostrando os elementos dentro do Array
            for (i = 1; i <= indice; i++){
                System.out .print("Digite o " + i + "º elemento do Array : ");
                int element = valor.nextInt();
                array[element] = element;
                System.out.println(array[element] );
            }
        }
    }
}



    // int n = 10;
    // int v[] = new int[n];
    // int i;

    // for (i = 0; i<n; i++){
    //     v[i] = i;
    //     System.out.println(v[i]);
    //     } 