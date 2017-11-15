import java.util.Scanner;
public class TestJuegos{
	/**
	* Simula el juego de adivinar, pide que el usuario
	* ingrese un numero tantas veces hasta que adivine el numero
	* o bien hasta que se terminen sus vidas
	* @param juego Juego con el que se interactua
	*/
	public static void juego(JuegoAdivinaNumero juego){
		Scanner in = new Scanner(System.in);
		System.out.println("Hola adivina el numero en el que estoy pensando");
		int temp = 0;
		while(juego.devuelveVidas() > 0){
			System.out.print("Ingresa un numero: ");
			temp = in.nextInt();
			if(juego.validaNumero(temp)){
				if(temp == juego.devuelveNumero()){
					System.out.println("Ganaste!");
					break;
				}else{
					juego.quitarVida();
					System.out.println("Te quedan " + juego.devuelveVidas() + " vidas");
					if(juego.devuelveVidas()==0)
						System.out.println("Perdiste :( ");
					else
						System.out.println("Intenta de nuevo");	
				}
			}else{
				System.out.println("El numero no es valido, intenta de nuevo");
			}
		}
	}

	public static void main(String[] args){

		JuegoAdivinaImpar juegoNuevo = new JuegoAdivinaImpar(3,11);
		JuegoAdivinaPar juegoNuevo2 = new JuegoAdivinaPar(3,10);
		JuegoAdivinaNumero juegoNuevo3 = new JuegoAdivinaNumero(3,11);
		JuegoAdivinaImpar juegoNuevoInvalido = new JuegoAdivinaImpar(3,10);
		JuegoAdivinaPar juegoNuevoInvalido2 = new JuegoAdivinaPar(3,11);

		System.out.println("Prueba normal: \n");
		TestJuegos.juego(juegoNuevo3);
	
		System.out.println("\nPrueba impar: \n");
		TestJuegos.juego(juegoNuevo);

		System.out.println("\nPrueba par: \n");
		TestJuegos.juego(juegoNuevo2);

		System.out.println("\nPrueba impar con número inválido en el constructor: \n");
		TestJuegos.juego(juegoNuevoInvalido);
		System.out.println("El numero era: " + juegoNuevoInvalido.devuelveNumero() + " \n");

		System.out.println("\nPrueba par con número inválido en el constructor: \n");
		TestJuegos.juego(juegoNuevoInvalido2);
		System.out.println("El numero era: " + juegoNuevoInvalido2.devuelveNumero() + " \n");
	}
}