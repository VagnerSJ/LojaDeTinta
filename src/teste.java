import java.util.Scanner;

import entidades.Estoque;

public class teste {
	 
	public static void main(String args[]){  
	
	//Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	/*String string = sc.nextLine();
	String[] parts = {(String) string.substring(0, 2), (String) string.subSequence(2, 4), (String) string.subSequence(4, 6)};
	String part1 = parts[0];
	String part2 = parts[1]; 
	String part3 = parts[2];
	
	System.out.println(parts[0]);
	System.out.println(parts[1]);
	System.out.println(parts[2]);*/
		
		
		/*String entrada = sc.nextLine();
		int quantidade = sc.nextInt();
		
		Compra compra = new Compra(entrada, quantidade);*/
		Estoque e = new Estoque("CG2A", "Grey", 12, 25.66);
		
		System.out.println(e.toString());
	
	}
}
