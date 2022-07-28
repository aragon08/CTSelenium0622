package testSel;



public class Ejem_CO_DemoVehiculo {

	public static void main(String[] args) {
		
		Ejem_CO_Vehiculo minivan = new Ejem_CO_Vehiculo();
		
		int rango;
		
		//Asignar valores a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango asumiendo tanque lleno de gasolina
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de "+rango+" km");
		
		Ejem_CO_Vehiculo carro = new Ejem_CO_Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero en pasajero de carro es: "+ carro.pasajeros);

	}

}
