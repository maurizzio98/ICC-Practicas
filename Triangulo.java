/**
 * Clase que trabaja triangulos,trabajandolos como polígonos regulares
 * @author Mauricio Chávez Olea
 * @version 28112017
 */

public class Triangulo extends PoligonoRegular{

	//Constructor

	/**
	*Constructor que crea un triangulo con la longitud de lados especificada
	*@param longitudLados Número real mayor a cero y en centímetros, en caso de ser menor o igual a 0, se le asignará 1
	**/

	public Triangulo(double longitudLados){
		super(3,longitudLados);
	}

	//Metodos de clase

	/**
	*Metodo que regresa información del triangulo en una cadena de texto
	*@return String Información de la figura
	**/

	public String toString(){
		return "Los lados del triangulo miden " + super.obtenerLongitudLados() + " cm";
	}

	/**
	*Metodo que regresa el area del triangulo en centímetros
	*@return double Area del triangulo
	**/

	public double area(){
		return (super.obtenerLongitudLados()*super.obtenerLongitudLados())/2;
	}	
}