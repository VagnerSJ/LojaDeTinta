
public class RGB /*extends Pigmento*/{
	
	private int r;
	private int g;
	private int b;
	
	public RGB(/*String ID, String nome, int estoqueLitros, double preco, */int r, int g, int b) {
		//super(ID, nome, estoqueLitros, preco);
		setRed(r);
		setGreen(g);
		setBlue(b);
	}
	
	private void setRed(int r) {
		this.r = r;
	}
	
	private void setGreen(int g) {
		this.g = g;
	}
	
	private void setBlue(int b) {
		this.b = b;
	}
	
	public int getRed() {
		return this.r;
	}
	
	public int getGreen() {
		return this.g;
	}
	
	public int getBlue() {
		return this.b;
	}
	
	/*@Override
	public void representacao() {
		
	}*/
}
