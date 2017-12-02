/**
 * Clase que extiende la clase Exception y crea excepciones del tipo posicion invalida en un arreglo
 * @author Mauricio Chávez Olea
 * @version 02122017
 */

public class PosicionInvalidaExcepcion extends Exception{
	
	private int length;

	/**
	* Constructor que crea una excepcion al dar una posicion invalida del arreglo
	* @param length -- Tamaño del arreglo
	*/
	public PosicionInvalidaExcepcion(int length){
		super("El numero debe ir entre 0 y " + (length-1));
		this.length = length;
	}

	/**
	* Método que regresa una cadena de texto con información de la excepcion
	* @return String -- Información de la excepcion
	*/
	public String getMessage(){
		return "El numero debe ir entre 0 y " + (length-1);
	}
}