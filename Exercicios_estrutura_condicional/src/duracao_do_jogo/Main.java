package duracao_do_jogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner valor = new Scanner(System.in)) {
			int hora_inicial, hora_final, sub_horas = 0, horas_faltando;
			
			System.out.print("Digite a hora incial: ");
			hora_inicial = valor.nextInt();
			
			System.out.print("Digite a hora final: ");
			hora_final = valor.nextInt();
			
			if(hora_final > hora_inicial) {
				sub_horas = hora_final - hora_inicial;
			}
			else if (hora_inicial > hora_final) {
				sub_horas = hora_inicial - hora_final;
			} 
			
			horas_faltando = 24 - sub_horas;
			if(horas_faltando == 24) {
				horas_faltando = 0;
			}
			
			System.out.print("O jogo durou " + horas_faltando + " hora(s)");
			
			valor.close();
		}
	}

}
