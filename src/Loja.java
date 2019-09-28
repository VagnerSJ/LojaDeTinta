import java.util.ArrayList;
import java.util.List;

import entidades.Pigmentos;

public class Loja {
	
	private List<Pigmentos> estoque;
	
	public Loja() {
		this.estoque = new ArrayList<>();
	}
	
	public void addEstoque(Pigmentos estoque) {
		this.estoque.add(estoque);
	}
	
	public List<Pigmentos> getEstoque(){
		return this.estoque;
	}
}
