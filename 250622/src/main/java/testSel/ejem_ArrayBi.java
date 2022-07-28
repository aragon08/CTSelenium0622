package testSel;

public class ejem_ArrayBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2,7,9},{3,6,1},{7,6,2}};
		
		//System.out.println(arr[2][1]);
		
		//Imprimir array 2D
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
