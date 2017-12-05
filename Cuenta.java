/**
*Clase que maneja cuentas bancarias
*Objetivo: Poner​ ​en​ ​práctica​ conocimientos​ acerca​ de​ ​la​ ​creación​ y uso de clases​ ​abstractas.
*@author Mauricio Chávez Olea
*@version 05122017
**/

public abstract class Cuenta{

	protected double saldo; //saldo en la cuenta

	//CONSTRUCTOR

	/**
	*Constructor que crea una cuenta en ceros
	**/
	public Cuenta(){
		saldo = 0 ;
	}

	//MÉTODOS

	/**
	*Método que permite hacer un retiro, y lanza una excepcion si no se tiene saldo suficiente
	*@param monto -- Monto a retirar
	*@throws SaldoInsuficienteExcepcion si la cantidad a retirar es mayor al saldo disponible
	**/
	public void retirar(double monto) throws SaldoInsuficienteExcepcion{
		if(monto>saldo)
			throw new SaldoInsuficienteExcepcion("No hay saldo suficiente en la cuenta, tu saldo actual es: " + saldo +  " pesos");
		saldo -= monto;	
	}

	/**
	*Método que devuelve el saldo actual de la cuenta
	*@return double saldo de la cuenta;
	**/
	public double obtenerSaldo(){
		return saldo;
	}

	/**
	*Método abstracto que permite depositar a una cuenta, y lanza una excepcion si se alcanzo la cantidad máxima de la cuenta
	*@param monto -- Monto a depositar
	*@throws CantidadMaximaExcepcion si se alcanzo la cantidad máxima de la cuenta
	**/
	public abstract void depositar(double monto) throws CantidadMaximaExcepcion;

	/**
	*Método abstracto que permita comprar y lance una excepcion si​ no​ hay​ saldo​ suficiente
	*@param costo -- Costo del producto
	*@throws SaldoInsuficienteExcepcion si no hay saldo suficiente
	**/
	public abstract void comprar(double costo) throws SaldoInsuficienteExcepcion;
}

