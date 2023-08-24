package Revisao1.APS;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class programa {
    public static void main(String[] args) {

      // Criando uma lista
      List <energia> Lista = new ArrayList<energia>();

    // Inserindo a quanidade de eletrodoméstico
    try (Scanner valor = new Scanner (System.in)) {
        System.out.print("Digite o número de eletrodomésicos que possui: ");
        int numeroeletrodomestico = valor.nextInt();

      // Pegando os valores do eletroméstico (Nome, Potência e tempo)
        for(int i = 1; i<=numeroeletrodomestico;i++){
            System.out.println(i+"º"+ " eletrodomésico");
            valor.nextLine();
            System.out.print("Digite o eletrodoméstico: ");
            String eletrodomestico = valor.nextLine();
            System.out.print("Digite a potência em watts: ");
            float potencia = valor.nextFloat();
            System.out.print("Digite o tempo de uso do eletrodoméstico em horas: ");
            int tempo = valor.nextInt();

            energia e = new energia();
            e.setEletrodomestico(eletrodomestico);
            e.setPotencia(potencia);
            e.setTempo(tempo);
            Lista.add(e);
        }

        // Exibindo a lista dos Eletrodomésticos e o Gasto
        float total = 0;
        System.out.println("LISTA DOS ELETRODOMÉSTICOS");
        for (energia energia : Lista) {
          total = total + energia.total();
          System.out.print(energia.getEletrodomestico() + "\n");
          System.out.printf("O consumo é: %.2f \n",total);
          System.out.printf("O gasto é: R$%.2f",energia.gasto());

    } 
        }
    } 
  }

