/**
*Clase que crea cartas
*Objetivo: Ejercitarse en​​ el​​ almacenamiento​ y​ recuperación​ de​ objetos persistentes​ mediante​​ el​​ uso​​ del​​ concepto​ de​ ​ serialización​ a la​ vez​ que​ ​refuerza​ ​sus​ ​conocimientos acerca​ ​del​ ​manejo​ ​de​ ​excepciones.
*@author Mauricio Chávez Olea
*@version 08122017
**/

import java.io.Serializable;

public class Carta implements Serializable{
	
	//ATRIBUTOS DE CLASE

	private String nombreRemitente = null;
	private String nombreDestinatario = null;
	private String correoRemitente = null;
	private String correoDestinatario = null; 
	private String mensaje = null;

	//CONSTRUCTOR

	/**
	*Constructor que crea una carta
	*@param nombreRemitente -- Nombre de la persona que envia la carta
	*@param correoRemitente -- Correo electronico de la persona que envia la carta
	*@param nombreDestinatario -- Nombre de la persona que recibira la carta
	*@param correoDestinatario -- Correo electronico de la persona que recibira la carta
	*@param mensaje -- Mensaje de la carta
	**/
	public Carta(String nombreRemitente, String correoRemitente, String nombreDestinatario, String correoDestinatario, String mensaje){
		this.nombreRemitente = nombreRemitente;
		this.nombreDestinatario = nombreDestinatario;
		this.correoRemitente = correoRemitente;
		this.correoDestinatario = correoDestinatario;
		this.mensaje = mensaje;
	}

	//METODOS

	/**
	*Método que asigna una cadena de texto al nombre del remitente de la carta
	*@param nombre -- Nombre del remitente
	**/
	public void asignarNombreRemitente(String nombre){
		this.nombreRemitente = nombre;
	}

	/**
	*Método que asigna una cadena de texto al nombre del destinatario de la carta
	*@param nombre -- Nombre del destinatario
	**/
	public void asignarNombreDestinatario(String nombre){
		this.nombreDestinatario = nombre;
	}

	/**
	*Método que asigna una cadena de texto al correo del remitente de la carta
	*@param correo -- Correo del remitente
	**/
	public void asignarCorreoRemitente(String correo){
		this.correoRemitente = correo;
	}

	/**
	*Método que asigna una cadena de texto al correo del destinatario de la carta
	*@param correo -- Correo del destinatario
	**/
	public void asignarCorreoDestinatario(String correo){
		this.correoDestinatario = correo;
	}

	/**
	*Método que asigna un mensaje a la carta
	*@param mensaje -- Mensaje de la carta
	**/
	public void asignarMensaje(String mensaje){
		this.mensaje = mensaje;
	}	

	/**
	*Método que obtiene el nombre del remitente
	*@return nombreRemitente -- Nombre del remitente de la carta
	**/
	public String obtenerNombreRemitente(){
		return nombreRemitente;
	}

	/**
	*Método que obtiene el nombre del destinatario
	*@return nombreDestinatario -- Nombre del destinatario de la carta
	**/
	public String obtenerNombreDestinatario(){
		return nombreDestinatario;
	}

	/**
	*Método que obtiene el correo del remitente
	*@return correoRemitente -- Correo del remitente
	**/
	public String obtenerCorreoRemitente(){
		return correoRemitente;
	}

	/**
	*Método que obtiene el correo del destinatario
	*@return correoDestinatario -- Correo del destinatario
	**/
	public String obtenerCorreoDestinatario(){
		return correoDestinatario;
	}

	/**
	*Método que obtiene el mensaje de la carta
	*@return mensaje -- Mensaje de la carta
	**/
	public String obtenerMensaje(){
		return mensaje;
	}

	/**
	*Método que compara dos cartas, regresa true si son iguales o false si son diferentes
	*@param carta - Objeto de tipo carta a comparar
	*@return boolean -- True si las cartas son iguales, false en caso contrario
	**/
	public boolean equals(Carta carta){
		return this.nombreRemitente == carta.obtenerNombreRemitente() &&
			   this.nombreDestinatario == carta.obtenerNombreDestinatario() &&
			   this.correoRemitente == carta.obtenerCorreoRemitente() &&
			   this.correoDestinatario == carta.obtenerCorreoDestinatario() &&
			   this.mensaje == carta.obtenerMensaje();
	}

	/**
	*Método que regresa la Carta como una cadena de texto
	*@return String -- Carta como cadena de texto
	**/
	public String toString(){
		return "Nombre del remitente: " + this.obtenerNombreRemitente()
			 + "\nCorreo del remitente: " + this.obtenerCorreoRemitente() 
			 + "\nNombre del destinatario: " + this.obtenerNombreDestinatario() 
			 + "\nCorreo del destinatario: " + this.obtenerCorreoDestinatario() 
			 + "\n\n" + this.obtenerMensaje();

	}
}