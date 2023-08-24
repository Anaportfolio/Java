package exercicios.exercicio1;
import java.util.Date;

public class proprietario {
     public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}


public int getCpf() {
return cpf;
}


public void setCpf(int cpf) {
this.cpf = cpf;
}


public int getRg() {
return rg;
}


public void setRg(int rg) {
this.rg = rg;
}


public Date getDt_nasc() {
return dt_nasc;
}


public void setDt_nasc(Date dt_nasc) {
this.dt_nasc = dt_nasc;
}


private String nome;
private int cpf;
private int rg;
private Date dt_nasc;
}
