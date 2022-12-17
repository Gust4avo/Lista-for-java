package listaFor;

public class Ex07 {

	public static void main(String[] args) {

		int resultado = 0;
				for (var contador = 0; contador <= 15; contador++){
				   resultado = resultado * 3;
				    if(resultado == 0 ){
				         resultado = resultado + 1; 
				    };
				    
				    System.out.println("3 ^ " + contador +  " = " + resultado);
				}

	}

}
