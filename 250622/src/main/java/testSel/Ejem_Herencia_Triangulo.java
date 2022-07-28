package testSel;

public class Ejem_Herencia_Triangulo extends Ejem_Herencia_DosDim{
	
	String estilo;
	
	double area() {
		return base * altura / 2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es "+ estilo);
	}

}
