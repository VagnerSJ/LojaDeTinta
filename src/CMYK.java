
public class CMYK {
	
	private int c;
	private int m;
	private int y;
	private int k;
	
	public CMYK(int c, int m, int y, int k) {
		this.setCyan(c);
		this.setMagenta(m);
		this.setYellow(y);
		this.setBlack(k);
	}
	
	private void setCyan(int c) {
		this.c = c;
	}
	
	private void setMagenta(int m) {
		this.m = m;
	}
	
	private void setYellow(int y) {
		this.y = y;
	}
	
	private void setBlack(int k) {
		this.k = k;
	}
	
	public int getCyan() {
		return this.c;
	}
	
	public int getMagenta() {
		return this.m;
	}
	
	public int getYellow() {
		return this.y;
	}
	
	public int getBlack() {
		return this.k;
	}
	
	
}
