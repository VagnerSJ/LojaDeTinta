package entidades;

public abstract class Pigmentos {
	private int estoque;
	private double preco;
	private String id;
	private String nomeFantasia;
	
	public Pigmentos(){
	}
	
	public Pigmentos(int estoque, double preco, String id, String nomeFantasia) {
		this.setEstoque(estoque);
		this.setPreco(preco);
		this.setId(id);
		this.setNomeFantasia(nomeFantasia);
	}

	public int getEstoque() {
		return estoque;
	}

	public double getPreco() {
		return preco;
	}

	public String getId() {
		return id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	private void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	private void setPreco(double preco) {
		this.preco = preco;
	}

	private void setId(String id) {
		this.id = id;
	}

	private void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
}
