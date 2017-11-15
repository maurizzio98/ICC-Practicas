import java.util.Random;

/**
 * Clase que simula un juego de adivinar un numero impar
 * @author Mauricio Chávez Olea
 * @version 14112017
 */
	
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	Random rdm = new Random();

	 /**
     * Construye un juego determinando el numero de intentos o vidas, y el numero impar a adivinar
     * @param vidas numero de vidas, debe ser mayor a 0.
     * @param numero  numero entero impar a adivinar, el rango es de 0 a 100, si el numero no es valido se asigna uno aleatorio
     */
	public JuegoAdivinaImpar(int vidas, int numero){
		super(vidas,numero);

		if(this.validaNumero(numero)==false){	
			do{
			super.asignaNumero(rdm.nextInt(101));
			}while(super.devuelveNumero()%2==0);
		}
	}

	 /**
     * Metodo que determina si el numero pasado como parametro es valido
     * @param numero Numero a validar
     * @return boolean true si el numero es mayor a 0 e impar
     */
	public boolean validaNumero(int numero){
		return numero%2!=0&&numero>0;
	}
}