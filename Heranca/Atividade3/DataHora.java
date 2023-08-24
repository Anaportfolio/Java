package Heranca.Atividade3;

public class DataHora extends Data {

    int hora,min;

    public DataHora(int ano, int mes, int dia) {
        super(ano, mes, dia);
    }

    @Override
    public String toString(){
        return super.toString() +" " + "horas: "+ hora + ": " + min;
    }
}
