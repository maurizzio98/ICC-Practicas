public class PruebaLoca{
	public static void main(String[] args){
		Baraja baraja = new Baraja();
		Carta rey = new Carta("Picas","K");

	    System.out.println(baraja.indiceCarta(rey));
	}
}