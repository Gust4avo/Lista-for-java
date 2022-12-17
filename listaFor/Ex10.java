package listaFor;

public class Ex10 {

	public static void main(String[] args) {
		
		float Celsius = 10;
				for (int contador = 1; contador <= 10; contador++){
				    float fare = (9 * Celsius + 160) / 5;
				    Celsius = Celsius + 10;
				    double kelv = Celsius + 273.15;
				    
				    System.out.println(Celsius + " °c " + " = " + fare + " °f " + " = "+ kelv + " °k ");
				    
				}

	}

}
