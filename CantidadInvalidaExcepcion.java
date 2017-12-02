/**
 * Clase que extiende la clase Exception y crea excepciones del tipo cantidad invalida en un arreglo
 * @author Mauricio Chávez Olea
 * @version 02122017
 */

public class CantidadInvalidaExcepcion extends Exception{
	
	/**
	* Constructor que crea una excepcion de cantidad invalida
	*/
	public CantidadInvalidaExcepcion(){
		super("La capacidad del arreglo debe ser mayor a 0");
	}
}