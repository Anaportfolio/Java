package Aluno;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JDBC {
	
	
	public Connection connetion = null;
	public Statement smt;
	
	
//	Fazendo conexão com o banco 
	public JDBC() {
		String driver ="com.mysql.cj.jdbc.Driver"; 
	 	String url = "jdbc:mysql://localhost:3306/bd_aluno"; 
	 	String user = " "; 
		String password = " "; 
		
		try {
			Class.forName(driver);
			
			connetion = DriverManager.getConnection(url,user,password);
			smt = connetion.createStatement();
			System.out.println("Conexão com sucesso!");
		} catch (SQLException|ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
// Salvando Aluno
	public void SalvarAluno(Aluno a) {
		try {
			smt.executeUpdate("insert into aluno (nome,ano,periodo) values ('"+ a.nome + "','" + a.ano + "','" + a.periodo + "')");
			System.out.println("Aluno inserido!");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
//	Excluindo Aluno
	public void ExcluirAluno(Aluno a) {
		try {
			smt.executeUpdate("delete from aluno where nome = '"+ a.nome +"'");
			System.out.println("Aluno excluido!");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	
//  Listando os Alunos 
	public List<Aluno> ListarAlunos(){
		List<Aluno> resultado = new ArrayList<Aluno>();
		
		try {
			ResultSet resulSet = smt.executeQuery("select * from aluno");
			
			while(resulSet.next()) {
				Aluno a = new Aluno();
				a.nome = resulSet.getString("NOME");
				a.ano = resulSet.getInt("ANO");
				a.periodo = resulSet.getString("PERIODO");
				
				resultado.add(a);
			}
			return resultado;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
}
