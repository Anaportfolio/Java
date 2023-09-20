package Revisao2.Vetor_e_Matriz;

public class Vetor {
    public static void main(String[] args) {
        
        // Criando o vetor de números inteiros 
        int[] vetor1 = new int [4];
        vetor1[0] = 1;
        vetor1[1] = 2;
        vetor1[2] = 3;
        vetor1[3] = 4;

        // Criando o vetor de números reais 
        float[] vetor2 = new float[4];
        vetor2[0] = 1.1f;
        vetor2[1] = 2.1f;
        vetor2[2] = 3.0f;
        vetor2[3] = 4.7f;

        // Criando o vetor de texto
        String[] vetor3 = new String[4];
        vetor3[0] = "abc";
        vetor3[1] = "def";
        vetor3[2] = "ghi";
        vetor3[3] = "jkl";

        // Exibindo os primeiros elementos de cada vetor 
        System.out.print(vetor1[0] + "\n");
        System.out.print(vetor2[0] + "\n");
        System.out.print(vetor3[0]);
    }

}
