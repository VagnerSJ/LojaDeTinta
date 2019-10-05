import java.util.ArrayList;
import java.util.List;

import entidades.Pigmento;

public class Loja {
	
	private List<Pigmento> estoque;
	
	public Loja() {
		this.estoque = new ArrayList<>();
	}
	
	public void addEstoque(Pigmento estoque) {
		this.estoque.add(estoque);
	}
	
	public List<Pigmento> getEstoque(){
		return this.estoque;
	}
	
}
