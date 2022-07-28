package testSel;

public class ejem_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int[] intArray2;
		
		//Decarar un array de strings
		String[] arr;
		
		//Asignar memoria para 5 datos
		arr = new String[5];
		
		//inicializamos el primer elemento del arreglo / los arreglos siempre empiezan en posicion 0
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//System.out.println("Elemento en la posicion 1 es:" + arr[1]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en la posicion "+ i +": " + arr[i]);
		}
		
		
		//ejemplo de arreglo en una linea
		int[] intArrayLinea = new int[] {1,2,3,4,5};

	}

}
