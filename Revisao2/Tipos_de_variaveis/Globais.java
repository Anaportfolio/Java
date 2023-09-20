package Revisao2.Tipos_de_variaveis;

public class Globais {
    
    static String variavelGlobal = "Global";

    public static void main(String[] args) {
        
        System.out.print(variavelGlobal + "\n");
        SubAlgoritmo1();
        System.out.print(variavelGlobal);
    }

    static public void SubAlgoritmo1(){
        variavelGlobal = "Valor alterado";
    }
}
