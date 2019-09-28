
public class Estoque {
	
	private String ID;
	private String nome;
	private int litros;
	private double preco;
	
	public Estoque(String ID, String nome, int litros, double preco) {
		this.setID(ID);
		this.setNome(nome);
		this.setLitros(litros);
		this.setPreco(preco);
	}
	
	private void setID(String ID) {
		this.ID = ID;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setLitros(int litros) {
		this.litros = litros;
	}
	
	private void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getLitros() {
		return this.litros;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	
}
