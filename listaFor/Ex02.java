package listaFor;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();

		for (int contadora = 1; contadora <= 10; contadora++) {
			System.out.println(numero + " X "+ contadora + " = " + contadora * numero);
		};
		
		sc.close();
		
	}

}
