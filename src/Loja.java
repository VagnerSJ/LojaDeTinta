import java.util.Locale;
import java.util.Scanner;

public class Loja {
	
	private Pigmento[] pigmentos;
	private static String corHTML;
	private static int quantidadeLitros;
	private static RGB corEstoque = new RGB(255, 0, 0);
	
	public static void main(String args[]){  
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o codigo HTML da cor desejada: ");
		corHTML = sc.nextLine();
		
		System.out.print("Informe a quantidade (em litros) que deseja da cor: ");
		quantidadeLitros = sc.nextInt();	
		
		Comparar comparar = new Comparar(corHTML, quantidadeLitros, corEstoque);
		
		System.out.println("Distancia RGB: " + comparar.maisProximoRGB(corEstoque));
		
		
		
		sc.close();
	}
}
