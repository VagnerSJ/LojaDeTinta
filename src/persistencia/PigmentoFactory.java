package persistencia;

import java.sql.SQLException;

public class PigmentoFactory {
	public static PigmentoDAOIF createPigmentoDAO() throws ClassNotFoundException, SQLException {
		return (PigmentoDAOIF) new PigmentoDAOJDBC();
	}
}
