import java.util.Random;

public class Baraja{

	String[] PALOS = {"Picas", "Corazon", "Diamante", "Trebol"};
	String[] VALOR = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
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

		for(int i=0;i<baraja.length;i++){

			do{
			boolean differentRandom=false;
			int random = rdm.nextInt(baraja.length);
			boolean sameRandom = boolean[random];
			if(sameRandom==false)
				differentRandom = true;
			}while(differentRandom);

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
		return true;
	}


}