package TESTE;

public class Energia extends Eletrodomesticos {
    /*
    Transferir da parte dois pra essa classe:
        o calculo a energia consumida diariamente
        da energia consuimida mensalmente;
        e do custo mensal
    Problemas: não conseguimos acessar a lista daqui.
    */
    private double consumoWh_Diario = 0; // Consumo diario da residência
    private double custoDiario; // Custo diario da residência

    private double firsCount;


    public void setFirsCount(double firsCount) {
        this.firsCount =  getPotenciaEletrodomestico() * getHorasDiarias();
    }
    
    public double getFirsCount() {
        return firsCount;
    }
    public double taxaKWH = 0.7049916667; //Tarifa de São José de reais por KWH
    public int dia = 30;

    public double getConsumoWh_Diario() {
        return consumoWh_Diario;
    }
    public double getCustoDiario() {
        return custoDiario;
    }

    // Métodos 
    // Calculo do consumo diario de energia
    // Consumo Diario = potencia(W) de todos os aparelhos x tempo(h) de todos os aparelhos/1000 para converter de Wh; 
    
    public void setConsumoWh_Diario() { 
        consumoWh_Diario = getFirsCount(); 
    } 
    // Calculo do Custo em reais da residência 
    // Custo Diario = ConsumoDiario * Tafida da região
    public void setCustoDiario() { 
        this.custoDiario = ((consumoWh_Diario/1000) * taxaKWH);
    }

}
