package Revisao2.Vetor_e_Matriz;

public class Matriz {
    public static void main(String[] args) {
        
        // Criando uma matriz de números inteiros 
        int[][] vetor1 = new int [4] [4];
        vetor1[0] [0] = 1;
        vetor1[0] [1] = 2;
        vetor1[0] [2]= 3;
        vetor1[0] [3] = 4;

        // Criando uma matriz de números reais 
        float[][] vetor2 = new float [4] [4];
        vetor2[0] [0] = 1.1f;
        vetor2[0] [1]= 2.1f;
        vetor2[0] [2]= 3.0f;
        vetor2[0] [3]= 4.7f;

        // Criando uma matriz de textos
        String[][] vetor3 = new String[4] [4];
        vetor3[0] [0] = "abc";
        vetor3[0] [1] = "def";
        vetor3[0] [2] = "ghi";
        vetor3[0] [3] = "jkl";

        // Exibindo os primieros elementos das Matrizes
        System.out.print(vetor1 [0] [0] + "\n");
        System.out.print(vetor2 [0] [0] + "\n");
        System.out.print(vetor3 [0] [0]);
    }
}
