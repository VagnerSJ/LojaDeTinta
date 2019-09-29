import java.lang.Math;

public class Calculadora {
	
	public RGB converterEntrada(String corHTML) {
		String string = corHTML;
		String[] parts = {(String) string.substring(0, 2), 
						  (String) string.subSequence(2, 4), 
						  (String) string.subSequence(4, 6)};
		RGB corConvertida = new RGB(Integer.parseInt(parts[0], 16), 
						  Integer.parseInt(parts[1], 16), 
						  Integer.parseInt(parts[2], 16));
		
		//System.out.println(corConvertida.getRed());
		//System.out.println(corConvertida.getGreen());
		//System.out.println(corConvertida.getBlue());
		
		return corConvertida;
	}
	
	public RGB converterCMYKParaRGB(CMYK corCMYK) {
		RGB corConvertidaParaRGB = new RGB((int)(255 * ((1 - corCMYK.getCyan()) / 100) * ((1 - corCMYK.getBlack()) / 100)), 
										   (int)(55 * ((1 - corCMYK.getMagenta()) / 100) * ((1 - corCMYK.getBlack()) / 100)), 
										   (int)(255 * ((1 - corCMYK.getYellow()) / 100) * ((1 - corCMYK.getBlack()) / 100)));
		
		return corConvertidaParaRGB;
	}
	
	private double distanciaSQRT(RGB corDeEntrada, RGB corNoEstoqueEmRGB) {
		double distancia = Math.sqrt(Math.pow(((double)Math.abs(corDeEntrada.getRed() - corNoEstoqueEmRGB.getRed())), 2.0) + 
									 Math.pow(((double)Math.abs(corDeEntrada.getGreen() - corNoEstoqueEmRGB.getGreen())), 2.0) + 
									 Math.pow(((double)Math.abs(corDeEntrada.getBlue() - corNoEstoqueEmRGB.getBlue())), 2.0));
		
		//System.out.println(distancia);
		
		return distancia;
	}
	
	public double distanciaRGB(RGB corDeEntrada, RGB corNoEstoqueEmRGB) {
		return distanciaSQRT(corDeEntrada, corNoEstoqueEmRGB);
	}
	
	public double distanciaCMYK(RGB corDeEntrada, CMYK corCMYK) {
		RGB corNoEstoqueEmRGB = converterCMYKParaRGB(corCMYK);
		
		return distanciaSQRT(corDeEntrada, corNoEstoqueEmRGB);
	}
	
}
