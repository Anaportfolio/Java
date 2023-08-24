package TESTE;

public class Eletrodomesticos {
     //Variaveis dos aparelhos domesticos eletronicos do usuario
    private String nomeEletrodomestico; // Nome do eletrodomestico 
    private double potenciaEletrodomestico; // Potencia em watts dos eletrodomésticos. 
    private double horasDiarias; // Tempo de uso em horas por dia


    // Métodos 
    public String getNomeEletrodomestico() {
        return nomeEletrodomestico;
    }
    public double getPotenciaEletrodomestico(){
        return potenciaEletrodomestico;
    }
    public double getHorasDiarias(){
        return horasDiarias;
    }

    public void setNomeEletrodomestico(String nomeEletrodomestico) {
        this.nomeEletrodomestico = nomeEletrodomestico;
    }
    public void setPotenciaEletrodomestico(double potencia) {
        this.potenciaEletrodomestico = potencia;
    }
    public void setHorasDiarias(double horasDiarias){
        this.horasDiarias = horasDiarias;
    }
    
    
}
