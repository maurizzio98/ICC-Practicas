import java.util.Random;

public class Baraja{

	String[] PALOS = {"Picas", "Corazon", "Diamante", "Trebol"};
	static String[] VALOR = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	Carta[] baraja ;

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

	public Baraja(int cantidad){

		baraja = new Carta[cantidad];
		Baraja barajaCompleta = new Baraja();
		int j=0,k=0;
		Carta[] completa = barajaCompleta.obtenerArregloCartas();

		for(int i=0;i<baraja.length;i++){
			baraja[i] = completa[i];
		}

	}

	public Carta[] obtenerArregloCartas(){
		return baraja;
	}


	public String toString(){
		String cadena = "";

		for(int i=0;i<baraja.length-1;i++)
			cadena += baraja[i].toString() + " - ";

		cadena += baraja[baraja.length-1].toString();

		return cadena.trim();
	}

	public void barajear(){

		Random rdm = new Random();
		boolean[] numeros = new boolean[baraja.length];
		Carta[] barajaAux = baraja;
		boolean differentRandom;
		int random;

		for(int i=0;i<baraja.length;i++){

			do{

			random = rdm.nextInt(baraja.length);

			if(numeros[random]==false){
				differentRandom = true;
				numeros[random] = true;
			}

			}while(differentRandom == false);

			baraja[i] = barajaAux[random];

		}

	

	}

	public boolean buscar(Carta c){

		boolean found = false;
		for(int i=0;i<baraja.length;i++)
			if(baraja[i].equals(c))
				found = true;
		return found;
	}

	public Carta cabeza(){
		return baraja[0];
	}

	public boolean juego(Carta c){

		boolean existeCartaMayor = false;

		for(int i=0;i<baraja.length;i++){
			if(Baraja.indiceEnArrayValor(baraja[i]) > Baraja.indiceEnArrayValor(c))
				existeCartaMayor = true;
		}

		return existeCartaMayor ;
		
	}

	public static int indiceEnArrayValor(Carta c){
		
		int index = -1;

		for(int i=0;i<VALOR.length;i++){
			if(c.valor.equals(VALOR[i]))
				index = i;
		}

		return index;
	}


}