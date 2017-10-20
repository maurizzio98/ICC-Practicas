import java.util.Arrays;

/**
* Clase para probar el paso de parametros por valor
* @author Mauricio Chávez Olea
* @version 17102017
*/
public class Cambios{

	public String toString(int [] arr){
		return Arrays.toString(arr) ;
	}

	public void intercambiar1(int x, int y){
			int temp;
			temp = x ;
			x = y ;
			y = temp ;
	}

	public void intercambiar2(int [] a, int [] b){
			int temp = a[0] ;
			a[0] = b[0] ;
			b[0] = temp ;
	}


	public static void main(String[] args) {
		Cambios test = new Cambios();
		int x = 10;
		int y = 30;
		int [] a = {-13,20,60};
		int [] b = {10, 39, -1, 8};

		System.out.println("***Valores originales***");
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("Arreglo a: " + test.toString(a));
		System.out.println("Arreglo b: " + test.toString(b));

		test.intercambiar1(x,y);
		test.intercambiar2(a,b);

		System.out.println("***Valores despues de aplicar el cambio***");
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("Arreglo a: " + test.toString(a));
		System.out.println("Arreglo b: " + test.toString(b));
	}
}
