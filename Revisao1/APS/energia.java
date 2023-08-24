package Revisao1.APS;

public class energia {
    private String eletrodomestico;
    private float potencia;
    private int tempo;
    private float consumo = 0;
    private float gasto;

    // Eletrodoméstico 
    public String getEletrodomestico() {
        return eletrodomestico;
    }
    public void setEletrodomestico(String eletrodomestico) {
        this.eletrodomestico = eletrodomestico;
    }
    // Potência
    public float getPotencia(){
        return potencia;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    // Tempo
    public int getTempo(){
        return tempo;
    }
    public void setTempo(int tempo){
        this.tempo = tempo;
    }

    // Consumo
    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    } 
    // Gasto
    public float getGasto() {
        return gasto;
    }
    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    // Cálculo do Consumo 
    public float total() {
        return consumo = consumo +( potencia * tempo) / 1000;
    } 

    // Cálculo o Gasto
    public float gasto(){
        return gasto = (float) (consumo * 0.7049916667);
    }
}
