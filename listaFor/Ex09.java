package listaFor;

public class Ex09 {

	public static void main(String[] args) {

		int resultado = 0;
		int anterior = 1;
		int primeiro = 0;

		for (int contador = 1; contador <= 15; contador++) {
			resultado = primeiro + anterior;
			System.out.println(resultado);
			primeiro = anterior;
			anterior = resultado;

		}

	}
}
