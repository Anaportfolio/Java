package TESTE;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // PARTE 1 -- ELETRODOMESTICOS: COLETANDO INFORMAÇÕES
      // Recebendo a quantidade de eletrodomésticos
      Scanner s = new Scanner (System.in);
      System.out.print("Digite o número de eletrodomésicos que possui: ");
      int numEletrodomesticos = s.nextInt();

      // Criando uma lista para receber os varios eletrodomesticos
      List <Eletrodomesticos> l = new ArrayList<Eletrodomesticos>();

      //Recebendo os valores dos eletrodomesticos e os colocando na lista (Nome, Potencia em W, Uso diario em horas)
      for(int i = 1; i<=numEletrodomesticos; i++){
        Energia energia = new Energia();
        System.out.println(i+"º"+ " eletrodomésico");
        s.nextLine();
        System.out.print("Digite o nome do eletrodoméstico: ");
        String eletrodomestico = s.nextLine();
        System.out.print("Digite a potência deste em watts: ");
        double potencia = s.nextDouble();
        //float potencia = s.nextFloat();
        System.out.print("Digite o tempo de uso do eletrodoméstico em horas: ");
        double tempo = s.nextDouble();

        Eletrodomesticos e = new Eletrodomesticos();
        
        e.setNomeEletrodomestico(eletrodomestico);
        e.setPotenciaEletrodomestico(potencia);
        e.setHorasDiarias(tempo);
        
      //energia.setConsumoWh_Diario();


        System.out.println("--------------------------------------------------------------------------------------------------------");
        // Não está fazendo o calculo
        System.out.println("RESULTADO");
        System.out.println("Consumo diario: "+ (energia.getConsumoWh_Diario())+" KW ");
        System.out.printf("Custo diario %.2f reais\n", (energia.getCustoDiario()));

        l.add(e);
      }
      s.close();

      //Outputs de todas essas infos por CMD
      System.out.println("--------------------------------------------------------------------------------------------------------");
      System.out.println("LISTA DOS ELETRODOMÉSTICOS"); //Todos esses são apenas outputs, se quiser pode deletar
      for (Eletrodomesticos e : l) {
        System.out.println(e.getNomeEletrodomestico());
        System.out.println("Potencia: "+ e.getPotenciaEletrodomestico());
        System.out.println("Horas de uso diarias: "+e.getHorasDiarias());
      }
    }
}
