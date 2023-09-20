package Revisao2.Tipos_de_variaveis;

public class Locais {
    static String variavelLocal = "Local";

    public static void main(String[] args) {
        
        System.out.print(variavelLocal + "\n");
        SubAlgoritmo1();
        System.out.print(variavelLocal);
    }

    static public void SubAlgoritmo1(){
        String variavelLocal = "Valor alterado";
    }
}
