package listaFor;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da base: ");
		float base = sc.nextFloat();
		System.out.println("Digite o valor do expoente");
		float expoente = sc.nextFloat();
		
		float resultado = 1;
		for (int contadora = 1; contadora <= expoente; contadora++){
		  resultado = resultado * base;

		   System.out.println(resultado + " ^ " + expoente + " = " + resultado);
		}
		
		sc.close();
	}
	
}
