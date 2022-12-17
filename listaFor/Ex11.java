package listaFor;

public class Ex11 {

	public static void main(String[] args) {

		int fatorial = 1;

		for (int contadora = 0; contadora <= 10; contadora++) {

			if (contadora % 2 == 1) {

				fatorial = contadora * fatorial + (contadora - 1);
				System.out.println("O fatorial dos números ímpares na faixa de 1 a 10 é : " + fatorial);

			}
		}

	}
}
