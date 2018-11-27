/**
 * 
 */
package br.com.javaparaweb.capitulo3.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author fnmoura
 *
 */
public class ConectaMySQL {
	public static void main(String[] args) {
		Connection conexao = null;
		try {
			//Registrando a classe JDBC e os parâmetros de conexão em tempo de execução
			//String url = "jdbc:mysql://localhost:3306/agenda";
			String url = "jdbc:mysql://localhost/agenda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String usuario = "root";
			String senha = "Rcgc,75bl3apt104";
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectou!");
			conexao.close();
		} catch(SQLException e) {
			System.out.println("Ocorreu um erro ao criar a conexão com o banco de dados. Erro: " + e.getMessage() + ".");
		}
	}
}