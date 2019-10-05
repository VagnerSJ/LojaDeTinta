package persistencia;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Pigmento;
import entidades.RGB;
import excecao.DbException;

public class PigmentoDAOJDBC implements PigmentoDAOIF{
	private static final String driverClasse = "org.hsqldb.jdbcDriver";
	private static final String usuario = "SA";
	private static final String senha = "";
	private static final String url = "jdbc:hsqldb:hsql://localhost/lojadetinta";
	private static final String salvar = "INSERT INTO lojadetinta(estoque, preco, id, nomefantasia) VALUES(?, ?, ?, ?)";
	private static Connection conn = null;
	
	public PigmentoDAOJDBC() throws SQLException, ClassNotFoundException {
		conn = PigmentoDAOJDBC.getConnection();
		Class.forName(driverClasse);
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(PigmentoDAOJDBC.url, PigmentoDAOJDBC.usuario, PigmentoDAOJDBC.senha);
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	@Override
	public void insert(Pigmento p) throws Exception {
		PreparedStatement stmt = PigmentoDAOJDBC.getConnection().prepareStatement(PigmentoDAOJDBC.salvar);
		stmt.setInt(1, p.getEstoque());
		stmt.setDouble(2,  p.getPreco());
		stmt.setString(3, p.getId());
		stmt.setString(4, p.getNomeFantasia());
		stmt.executeUpdate();
		stmt.close();
		
	}
	@Override
	public ArrayList<Pigmento> getByQtd(int estoque) throws SQLException {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = PigmentoDAOJDBC.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM pigmento "
								+ "WHERE estoque >="+ estoque);

			ArrayList<Pigmento> list = new ArrayList<Pigmento>();

			while (rs.next()) {
				Pigmento obj = new RGB(); // verificar qual objeto está sendo digitado e criar o pigmento corretoo
				obj.setEstoque(rs.getInt("estoque"));
				obj.setPreco(rs.getDouble("preco"));
				obj.setId(rs.getString("id"));
				obj.setNomeFantasia(rs.getString("nomefantasia"));
				list.add(obj);
			}
			return list;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			PigmentoDAOJDBC.closeStatement(st);
			PigmentoDAOJDBC.closeResultSet(rs);
		}
	}
	@Override
	public void update(Pigmento pigmento) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE pigmento SET estoque = ?, preco = ?, WHERE id = ?");

			st.setInt(1, pigmento.getEstoque());
			st.setDouble(2, pigmento.getPreco());
			st.setString(3, pigmento.getId());

			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		} 
		finally {
			PigmentoDAOJDBC.closeStatement(st);
		}
	}
	
	@Override
	public Pigmento getSimilar() {
		
		//pendente implementação
		return null;
	}
		
	public static void closeStatement(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}	
}
