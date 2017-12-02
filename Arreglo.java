/**
 * Clase que crea arreglos
 * @author Mauricio Chávez Olea
 * @version 02122017
 */

public class Arreglo{
	
	int[] arr;

	/**
	* Crea un arreglo con espacio para n numeros enteros
	* @param n Entero mayor a 0
	* @throws CantidadInvalidaExcepcion Si n es menor a 1
	*/
	public Arreglo(int n) throws CantidadInvalidaExcepcion{
		if(n<1){
			throw new CantidadInvalidaExcepcion();
		}
		arr = new int[n];
	}

	/**
	* Ingresa un numero en la posicion indicada
	* @param n Numero a insertar dentro del arreglo
	* @param i Posicion en la que se insertara el entero
	* @throws PosicionInvalidaExcepcion Si i no esta dentro del rango permitido
	*/
	public void insertar(int n, int i) throws PosicionInvalidaExcepcion{
		if(i>=arr.length || i<0){
			throw new PosicionInvalidaExcepcion(arr.length);
		}
		arr[i]=n;
	}


	/**
	* Devuelve el numero que se encuentra en una posicion dada
	* @param i Posicion de la que se quiere obtener un numero
	* @return n Numero almacenado en la posicion i
	* @throws PosicionInvalidaExcepcion Si i no esta dentro del rango permitido
	*/
	public int obtener(int i) throws PosicionInvalidaExcepcion{
		if(i>=arr.length || i<0){
			throw new PosicionInvalidaExcepcion(arr.length);
		}
		return arr[i];
	}

	/**
	* Dadas dos posiciones del arreglo devuelve la division de ambos
	* @param i1 Posicion del dividendo
	* @param i2 Posicion del divisor
	* @return El resultado de la operacion i1/i2
	* @throws DivisionEntreCeroExcepcion Si i2 es igual a cero
	*/
	public int dividir(int i1, int i2) throws DivisionEntreCeroExcepcion{
		if(arr[i2]==0){
			throw new DivisionEntreCeroExcepcion();
		}
		return arr[i1]/arr[i2];
	}
}