import java.util.Random;

/**
 * Clase que simula una baraja
 * @author Mauricio Chávez Olea
 * @version 07112017
 */

public class Baraja{

	String[] PALOS = {"Picas", "Corazon", "Diamante", "Trebol"};
	static String[] VALOR = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	Carta[] baraja ;


    /**
     * Constructor por omisión que crea una baraja con 52 cartas
     */

	public Baraja(){

		baraja = new Carta[52];

		int i=0;

		for(int j=0;j<PALOS.length;j++){
			for(int k=0;k<VALOR.length;k++){
				baraja[i] = new Carta(PALOS[j],VALOR[k]);
				i++;
			}
		}

	}

	    /**
     * Constructor que crea una baraja con el número de cartas indicadas en el parámetro
     * @param cantidad Cantidad de cartas en la baraja
     */

	public Baraja(int cantidad){

		baraja = new Carta[cantidad];
		Baraja barajaCompleta = new Baraja();
		int j=0,k=0;
		Carta[] completa = barajaCompleta.baraja;

		for(int i=0;i<baraja.length;i++)
			baraja[i] = completa[i];
	}

	/**
     * Método que devuelve el contenido de la baraja como una cadena de caracteres 
     * @return String representación en cadena de caracteres de la baraja
     */

	public String toString(){
		String cadena = "";

		for(int i=0;i<baraja.length-1;i++)
			cadena += baraja[i].toString() + " - ";

		cadena += baraja[baraja.length-1].toString();

		return cadena.trim();
	}


	/**
     * Método que revuelve las cartas de la baraja
     */

	public void barajear(){

		Random rdm = new Random();
		boolean[] numeros = new boolean[baraja.length];
		Carta[] barajaAux = baraja;
		int random;

		for(int i=0;i<baraja.length;i++){

			do{
			random = rdm.nextInt(baraja.length);

			if(numeros[random]==false)
				numeros[random] = true;
			
			}while(numeros[random] == false);

			baraja[i] = barajaAux[random];

		}

	}


	/**
     * Método que determine​ ​ si​ ​ una​ ​ carta​ ​ se​ ​ encuentra​ ​ en​ ​ la​ ​ baraja.
     * @param c Carta a buscar en la baraja
     * @return boolean True si sí está, y False en caso contrario
     */

	public boolean buscar(Carta c){

		boolean found = false;
		for(int i=0;i<baraja.length;i++)
			if(baraja[i].equals(c))
				found = true;
		return found;
	}


	/**
     * Método que quite​ ​ la​ ​ primer​ ​ carta​ ​ de​ ​ la​ ​ baraja​ ​ y ​ ​ la​ ​ devuelva
     * @return Carta Primer carta de la baraja
     */
	public Carta cabeza(){
		Carta[] barajaNueva = new Carta[baraja.length-1];
		Carta c=baraja[0];

		for (int i=0;i<barajaNueva.length;i++)
			barajaNueva[i] = baraja[i+1] ;
		
			baraja = barajaNueva;

		return c;
	}

	/**
     * Método el​ ​ cual​ ​ dada​ ​ una​ ​ carta,​ ​ decidirá​ ​ si​ ​ no​ ​ existe​ ​ alguna​ ​ carta​ ​ en​ ​ la​ ​ baraja con​ ​ mayor​ ​ valor​ ​ (aunque​ ​ sean​ ​ de​ ​ palos​ ​ distintos).
     * @param c Carta que se comparará con las demás en la baraja
     * @return boolean True si sí existe una carta mayor, False en caso contrario
     */

	public boolean juego(Carta c){

		boolean existeCartaMayor = false;

		for(int i=0;i<baraja.length;i++){
			if(Baraja.indiceCarta(baraja[i]) < Baraja.indiceCarta(c) )
				existeCartaMayor = true;
		}

		return existeCartaMayor ;
		
	}

	/**
     * Método auxiliar para el método juego, el cual convierte el valor de la carta a un enterp
     * @param c Carta de la cuál será extraído el valor
     * @return int Entero equivalente al valor de la carta
     */

	public static int indiceCarta(Carta c){
		
		int index = -1;

		for(int i=0;i<VALOR.length;i++){
			if(VALOR[i].equals(c)){
				index = i;
			}
		}

		return index;

	}


}