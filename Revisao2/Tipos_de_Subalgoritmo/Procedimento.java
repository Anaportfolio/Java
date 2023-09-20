package Revisao2.Tipos_de_Subalgoritmo;

public class Procedimento {

    static String variavelGlobal = "Global";

    public static void Procedimento1 (int var1, String var2){
        System.out.println(var1);
         System.out.println(var2);
    }

    public static void main(String[] args) {
        System.out.println(variavelGlobal);
        Procedimento1(1, "teste");
        System.out.println(variavelGlobal);
    }
}
