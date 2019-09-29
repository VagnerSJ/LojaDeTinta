
public class Pigmento {
	
	private String ID;
	private String nome;
	private int estoqueLitros;
	private double preco;
	private RGB representacaoRGB;
	private CMYK representacaoCMYK;
	
	
	public Pigmento(String ID, String nome, int estoqueLitros, double preco, int r, int g, int b) {
		setID(ID);
		setNome(nome);
		setLitros(estoqueLitros);
		setPreco(preco);
		this.representacaoRGB = new RGB(r, g, b);
	}
	
	public Pigmento(String ID, String nome, int estoqueLitros, double preco, int c, int m, int y, int k) {
		setID(ID);
		setNome(nome);
		setLitros(estoqueLitros);
		setPreco(preco);
		this.representacaoCMYK = new CMYK(c, m, y, k);
	}
	
	private void setID(String ID) {
		this.ID = ID;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setLitros(int estoqueLitros) {
		this.estoqueLitros = estoqueLitros;
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
		return this.estoqueLitros;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
}
