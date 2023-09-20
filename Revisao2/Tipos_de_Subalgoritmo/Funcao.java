package Revisao2.Tipos_de_Subalgoritmo;

public class Funcao {
    
    static  public int Funcao1(int var1, String var2){
        var1 = var1 * var1;
        var2 = "Texto";

        System.out.println(var2);

        return var1;

    }

    static String variavelGlobal = "Global";
    public static void main(String[] args) {
        System.out.println(variavelGlobal);
        int resultado = Funcao1(1, "testes");
        System.out.println(variavelGlobal);
    }
}
