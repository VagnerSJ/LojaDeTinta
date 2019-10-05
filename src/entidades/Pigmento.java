package entidades;

public abstract class Pigmento {
	private int estoque;
	private double preco;
	private String id;
	private String nomeFantasia;
	
	public Pigmento(){
	}
	
	public Pigmento(int estoque, double preco, String id, String nomeFantasia) {
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

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Override
	public String toString() {
		return "Pigmento [estoque=" + estoque + ", preco=" + preco + ", id=" + id + ", nomeFantasia=" + nomeFantasia
				+ "]";
	}
	
	
	
}
