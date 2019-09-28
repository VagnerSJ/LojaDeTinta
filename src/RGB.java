public class RGB {
	
	private int r;
	private int g;
	private int b;
	
	public RGB(int r, int g, int b) {
		this.setRed(r);
		this.setGreen(g);
		this.setBlue(b);
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
}
