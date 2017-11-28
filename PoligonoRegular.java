/**
 * Clase que trabaja poligonos regulares
 * @author Mauricio Chávez Olea
 * @version 28112017
 */

public class PoligonoRegular{

	//Atributos de clase

	private int lados;
	private double longitud;

	//Constructor

	/**
	*Constructor que crea un poligono regular del numero de lados y longitud especificada
	*@param numeroLados Número entero mayor a cero, en caso de ser menor o igual a 0, se le asignará 1
	*@param longitudLados Número real mayor a cero y en centímetros, en caso de ser menor o igual a 0, se le asignará 1
	**/

	public PoligonoRegular(int numeroLados, double longitudLados){
		lados = numeroLados;
		longitud = longitudLados;

		if (numeroLados<1)
			lados = 1;

		if (longitudLados<1)
			longitud = 1;
	}

	//Metodos de clase


	 /**
     * Método que obtiene el numero de lados del polígono regular
     * @return int Numero de lados del polígono
     */

	public int obtenerNumeroLados(){
		return lados;
	}

	/**
     * Método que obtiene la longitud por lado del polígono regular
     * @return double Longitud de los lados, en centímetros
     */

	public double obtenerLongitudLados(){
		return longitud;
	}

	/**
     * Método que obtiene el perimetro de tu polígono regular
     * @return double Perímetro del polígono, en centímetros
     */

	public double perimetro(){
		return longitud*lados;
	}

	/**
     * Metodo que devuelve información de la figura en una cadena de texto
     * @return String Información de la figura
     */

	public String toString(){
		return "La figura tiene " + lados + " lados con una longitud de " + longitud + " cm cada uno";
	}

}