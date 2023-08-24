package Heranca.Atividade3;

public class principal {
    public static void main(String[] args) {
        
        Data d = new Data(0, 0, 0);
        d.dia = 25;
        d.mes = 4;
        d.ano = 2023;

        DataHora dh = new DataHora(0, 0, 0);
        dh.dia = 25;
        dh.mes = 4;
        dh.ano = 2023;
        dh.hora = 5;
        dh.min = 30;

        // Problemas na exibição
         System.out.print("Os valores da Classe Data: "+ d.toString() + "\n");
         System.out.print("Os valores da Classe DataHora: " + dh.toString());
    }
}
