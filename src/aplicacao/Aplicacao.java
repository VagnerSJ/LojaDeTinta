package aplicacao;

import java.sql.Connection;
import java.sql.SQLException;

import persistencia.PigmentoDAOJDBC;
import persistencia.PigmentoFactory;

public class Aplicacao {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection c = PigmentoDAOJDBC.getConnection();
		//PigmentoDAOJDBC pigmentoDAO = new PigmentoDAOJDBC();
	
		
		if(c==null) {
			System.out.println("nao conectou");
		}
		else {
			System.out.println("conectou ");
		}		
	}
	
}
