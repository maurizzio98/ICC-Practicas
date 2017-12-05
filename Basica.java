/**
*Clase que maneja cuentas bancarias básicas, extiende a la clase Cuenta
*Objetivo: Poner​ ​en​ ​práctica​ conocimientos​ acerca​ de​ ​la​ ​creación​ y uso de clases​ ​abstractas.
*@author Mauricio Chávez Olea
*@version 05122017
**/

public class Basica extends Cuenta{
	
	//CONSTRUCTOR

	/**
	*Constructor que crea una cuenta básica en ceros
	**/
	public Basica(){
		super();
	}

	//MÉTODOS

	/**
	*Método que permite depositar a una cuenta Basica, y lanza una excepcion si se alcanzo la cantidad máxima de la cuenta
	*@param monto -- Monto a depositar
	*@throws CantidadMaximaExcepcion si se alcanzo la cantidad máxima de la cuenta
	**/
	public void depositar(double monto) throws CantidadMaximaExcepcion{
		if(monto+saldo>7000)
			throw new CantidadMaximaExcepcion("Solo puedes depositar " + (7000-saldo) + " pesos");
		saldo += monto;
	}

	/**
	*Método que permita comprar y lance una excepcion si​ no​ hay​ saldo​ suficiente
	*@param costo -- Costo del producto
	*@throws SaldoInsuficienteExcepcion si no hay saldo suficiente
	**/
	public void comprar(double costo) throws SaldoInsuficienteExcepcion{
		if(costo>saldo)
			throw new SaldoInsuficienteExcepcion("No hay saldo suficiente en la cuenta, tu saldo actual es: " + saldo +  " pesos");
		saldo -= costo*(1-0.05);
	}
}