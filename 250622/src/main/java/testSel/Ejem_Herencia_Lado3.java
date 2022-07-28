package testSel;

public class Ejem_Herencia_Lado3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejem_Herencia_Triangulo t1 = new Ejem_Herencia_Triangulo();
		//Se puede acceder a "base" desde t1 porque es una subclase de la clase dosDimensiones
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo 1";
		System.out.println("Info para mostrar");
		t1.mostrarDimension();
		t1.mostrarEstilo();
		System.out.println("Su area del triangulo es " + t1.area());
		
		
		// TODO Auto-generated method stub
				Ejem_Herencia_Triangulo t2 = new Ejem_Herencia_Triangulo();
				//Se puede acceder a "base" desde t1 porque es una subclase de la clase dosDimensiones
				t2.base = 8.0;
				t2.altura = 12.0;
				t2.estilo = "Estilo 2";
				System.out.println("Info para mostrar");
				t2.mostrarDimension();
				t2.mostrarEstilo();
				System.out.println("Su area del triangulo es " + t2.area());
				

	}

}
