package testSel;

public class Ejem_Metodos {

	public static void main(String[] args) {
		int resultado = suma(10, 20);
		System.out.println(resultado);
		
		int r2 = suma(2,2,24);
		System.out.println(r2);
		
		
		String car = carro(2);
		System.out.println(car);
		
	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String [] cars = {"Volvo", "BMW", "Ford"};
		return cars[a];
	}

}
