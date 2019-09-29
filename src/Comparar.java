
public class Comparar {
	
	private String corHTML;
	private int quantidadeLitros;
	private Calculadora calculadora;
	
	public Comparar(String corHTML, int quantidadeLitros, RGB corEstoque) {
		setCorHTML(corHTML);
		setQuantidadeLitros(quantidadeLitros);
		calculadora = new Calculadora();
		maisProximoRGB(corEstoque);
	}
	
	private void setCorHTML(String corHTML) {
		this.corHTML = corHTML;
	}
	
	private void setQuantidadeLitros(int quantidadeLitros) {
		this.quantidadeLitros = quantidadeLitros;
	}
	
	public double maisProximoRGB(RGB corEstoque) {
		RGB convertido = calculadora.converterEntrada(this.corHTML);
		
		return calculadora.distanciaRGB(convertido, corEstoque);
	}
	
	public double maisProximoCMYK(CMYK corEstoque) {
		RGB convertido = calculadora.converterEntrada(this.corHTML);
		
		return calculadora.distanciaCMYK(convertido, corEstoque);
	}
	
		
		
}
