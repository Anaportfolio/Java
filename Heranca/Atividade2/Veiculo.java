package Heranca.Atividade2;

public class Veiculo {
    private boolean ligado;

    // Setters
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void Ligar(){
        ligado = true;
    }

    public void Desligar(){
        ligado = false;
    }

    // Getter
    public boolean isLigado() {
        return ligado;
    }
}
