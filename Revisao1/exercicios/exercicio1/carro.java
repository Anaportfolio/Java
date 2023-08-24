package Revisao1.exercicios.exercicio1;

public class carro {

    private String modelo;
    private String maraca;
    private int velocidademax;
    private boolean possuiTetoSolar;
    private String cor;
    private String chassi;
    private int velocidadeAtual;
    private int NumeroMarchas;
    private int ano;
    private String proprietario;
    private int NumeroPortas;
    private boolean PossuiCambioAutomatico;
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMaraca() {
        return maraca;
    }
    public void setMaraca(String maraca) {
        this.maraca = maraca;
    }
    public int getVelocidademax() {
        return velocidademax;
    }
    public void setVelocidademax(int velocidademax) {
        this.velocidademax = velocidademax;
    }
    public boolean getPossuiTetoSolar() {
        return possuiTetoSolar;
    }
    public void setPossuiTetoSolar(Boolean possuiTetoSolar) {
        this.possuiTetoSolar = possuiTetoSolar;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public int getNumeroMarchas() {
        return NumeroMarchas;
    }
    public void setNumeroMarchas(int numeroMarchas) {
        NumeroMarchas = numeroMarchas;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public int getNumeroPortas() {
        return NumeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        NumeroPortas = numeroPortas;
    }
    public boolean getPossuiCambioAutomatico() {
        return PossuiCambioAutomatico;
    }
    public void setPossuiCambioAutomatico(Boolean possuiCambioAutomatico) {
        PossuiCambioAutomatico = possuiCambioAutomatico;
    }
}
