import java.lang.Math;

public class Compra {
	
	private String entrada;
	private int quantidade;
	
	/////////////
	int r = 255, g = 0, b = 0;
	/////////////
	
		public Compra(String entrada, int quantidade) {
			qualCor(entrada);
			qualQuantidade(quantidade);
			distanciaRGB();
			
		}
		
		private void setEntrada(String entrada) {
			this.entrada = entrada;
		}
		
		private void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		
		private void qualCor(String entrada) {
			System.out.print("Digite o codigo da cor desejada: ");
			setEntrada(entrada);
		}
		
		private void qualQuantidade(int quantidade) {
			System.out.print("Digite a quantidade (em litros) desejada: ");
			setQuantidade(quantidade);
		}
		
		private RGB converterEntradaParaRGB() {
			String string = this.entrada;
			String[] parts = {(String) string.substring(0, 2), 
							  (String) string.subSequence(2, 4), 
							  (String) string.subSequence(4, 6)};
			RGB cor = new RGB(Integer.parseInt(parts[0], 16), 
							  Integer.parseInt(parts[1], 16), 
							  Integer.parseInt(parts[2], 16));
			
			System.out.println(cor.getRed());
			System.out.println(cor.getGreen());
			System.out.println(cor.getBlue());
			
			return cor;
		}
		
		private void distanciaRGB() {
			RGB cor = converterEntradaParaRGB();
			double distancia = Math.sqrt(Math.pow((Math.abs(cor.getRed() - r)), 2));
					 //+ (Math.abs(g - cor.getGreen()) ^ 2) + (Math.abs(b - cor.getBlue()) ^ 2)));
			
			System.out.println(distancia);
		}
}
