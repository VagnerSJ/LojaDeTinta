package persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Pigmento;

public interface PigmentoDAOIF {
	public void insert (Pigmento p) throws Exception;
	public ArrayList<Pigmento> getByQtd(int estoque) throws SQLException;
	public void update(Pigmento pigmento);
	public Pigmento getSimilar();
}
