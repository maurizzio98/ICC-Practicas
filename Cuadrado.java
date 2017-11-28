/**
 * Clase que trabaja cuadrados,trabajandolos como polígonos regulares
 * @author Mauricio Chávez Olea
 * @version 28112017
 */

public class Cuadrado extends PoligonoRegular{
	
	//Constructor

	/**
	*Constructor que crea un cuadrado con la longitud de lados especificada
	*@param longitudLados Número real mayor a cero y en centímetros, en caso de ser menor o igual a 0, se le asignará 1
	**/

	public Cuadrado(double longitudLados){
		super(4,longitudLados);
	}

	//Metodos de clase

	/**
	*Metodo que regresa información del cuadrado en una cadena de texto
	*@return String Información de la figura
	**/

	public String toString(){
		return "Los lados del cuadrado miden " + super.obtenerLongitudLados() + " cm";
	}

	/**
	*Metodo que regresa el area del cuadrado en centímetros
	*@return double Area del cuadrado
	**/

	public double area(){
		return super.obtenerLongitudLados()*super.obtenerLongitudLados();
	}	
}