/**
 * Clase que extiende la clase Exception y crea excepciones del tipo division entre cero
 * @author Mauricio Chávez Olea
 * @version 02122017
 */

public class DivisionEntreCeroExcepcion extends Exception{
	
	/**
	* Constructor que crea una excepcion de division entre cero
	*/
	public DivisionEntreCeroExcepcion(){
		super("No​ se​ permite​ dividir​ entre​ cero");
	}
}