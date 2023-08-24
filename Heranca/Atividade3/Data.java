package Heranca.Atividade3;

public class Data {
    int dia,mes,ano;

    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString (){
        return dia + "/" + mes + "/" + ano;
    }
}
