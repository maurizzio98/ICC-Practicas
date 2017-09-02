import java.util.Scanner ;

/**
 * Programa para simular el juego de dados Cho-Han Bakuchi
 * @author  Mauricio Chávez Olea
 * @version ...
 */
public class ChoHanBakuchi{
    public static void main (String [] pps) {
    //Declara tus variables

    int jugadores, dado1, dado2, suma, parimpar;
    String chohan, chohan2;
    boolean validochohan, validochohan2;
    Scanner in = new Scanner (System.in) ;
    Scanner str = new Scanner (System.in) ;

    //Solicita el modo de juego

    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.print("Selecciona un modo de juego (escribe 1 o 2): ");
    jugadores = in.nextInt();

    Dado d1 = new Dado();
    Dado d2 = new Dado();

    //Instrucciones para el juego con un jugador

              if (jugadores==1){

                System.out.println("\n¿Apuestas por Cho (suma par) o por Han (suma impar)?: ");
                chohan = str.nextLine();

                chohan = chohan.trim();
                chohan = chohan.toLowerCase();


                dado1 = d1.lanzar();
                dado2 = d2.lanzar();
                suma = dado1 + dado2 ;
                parimpar = suma % 2 ;

                  if (parimpar == 0) {

                          if (chohan.equals("cho")){
                            System.out.println("El dado 1 muestra " + dado1);
                            System.out.println("El dado 2 muestra " + dado2);
                            System.out.println("\nLa suma de estos es " + suma + "\n");
                            System.out.println("Ganaste :)\n");
                          }

                          else if (chohan.equals("han")){
                            System.out.println("El dado 1 muestra " + dado1);
                            System.out.println("El dado 2 muestra " + dado2);
                            System.out.println("\nLa suma de estos es " + suma + "\n");
                            System.out.println("Perdiste :(\n");
                          }

                          else {
                            System.out.println("\nNo apostaste ni por Cho ni por Han. Juego invalidado :(\n");
                          }
                        }
                  else if (parimpar != 0) {

                    if (chohan.equals("cho")){
                      System.out.println("El dado 1 muestra " + dado1);
                      System.out.println("El dado 2 muestra " + dado2);
                      System.out.println("\nLa suma de estos es " + suma + "\n");
                      System.out.println("Perdiste :(\n");
                    }

                    else if (chohan.equals("han")) {
                      System.out.println("El dado 1 muestra " + dado1);
                      System.out.println("El dado 2 muestra " + dado2);
                      System.out.println("\nLa suma de estos es " + suma + "\n");
                      System.out.println("Ganaste :)\n");
                    }

}
                    else {
                      System.out.println("\nNo apostaste ni por Cho ni por Han. Juego invalidado :(\n");
                    }




                  } //Acaba modo un jugador

    //Instrucciones para el juego con dos jugadores

    else if (jugadores==2) {

      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("Jugador 1, ¿apuestas por Cho (suma par) o por Han (suma impar)?: ");
      chohan = str.nextLine();

      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("Jugador 2, ¿apuestas por Cho (suma par) o por Han (suma impar)?: ");
      chohan2 = str.nextLine();

      System.out.print("\033[H\033[2J");
      System.out.flush();

      chohan = chohan.trim();
      chohan = chohan.toLowerCase();

      chohan2 = chohan2.trim();
      chohan2 = chohan2.toLowerCase();


      dado1 = d1.lanzar();
      dado2 = d2.lanzar();
      suma = dado1 + dado2 ;
      parimpar = suma % 2 ;
      validochohan = ((chohan.equals("cho")) || (chohan.equals("han"))) ;
      validochohan2 = ((chohan2.equals("cho")) || (chohan2.equals("han")) ) ;

        if(chohan.equals(chohan2)){

          if (validochohan==false || validochohan2==false) {
              System.out.println("Apuestas no permitidas. Juego invalidado :(\n");

          }

          else {

            System.out.println("El dado 1 muestra " + dado1);
            System.out.println("El dado 2 muestra " + dado2);
            System.out.println("\nLa suma de estos es " + suma + "\n");
            System.out.println("Es un empate :(\n");
            System.out.println("Se reinicia el juego...\n");

                        //REPETICIÓN

                        System.out.println("Jugador 1, ¿apuestas por Cho (suma par) o por Han (suma impar)?: ");
                        chohan = str.nextLine();

                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Jugador 2, ¿apuestas por Cho (suma par) o por Han (suma impar)?: ");
                        chohan2 = str.nextLine();

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        chohan = chohan.trim();
                        chohan = chohan.toLowerCase();

                        chohan2 = chohan2.trim();
                        chohan2 = chohan2.toLowerCase();


                        dado1 = d1.lanzar();
                        dado2 = d2.lanzar();
                        suma = dado1 + dado2 ;
                        parimpar = suma % 2 ;
                        validochohan = chohan.equals("cho") || chohan.equals("han") ;
                        validochohan2 = chohan2.equals("cho") || chohan2.equals("han") ;

                        if(chohan.equals(chohan2)){

                          if (validochohan==false || validochohan2==false) {
                              System.out.println("Apuestas no permitidas. Juego invalidado :(\n");

                          }

                          else {

                            System.out.println("El dado 1 muestra " + dado1);
                            System.out.println("El dado 2 muestra " + dado2);
                            System.out.println("\nLa suma de estos es " + suma + "\n");
                            System.out.println("De nuevo es un empate :(\n");
                            System.out.println("Ambos pierden :(\n");

                          }



          } //APUESTAS IGUALES REPETICION

          // INICIA ELSE APUESTAS DIFERENTES REPETICION

          else {

            if (validochohan == true && validochohan2 == true) {
                    if (parimpar == 0) {

                            if (chohan.equals("cho")){
                              System.out.println("El dado 1 muestra " + dado1);
                              System.out.println("El dado 2 muestra " + dado2);
                              System.out.println("\nLa suma de estos es " + suma + "\n");
                              System.out.println("Gana el jugador 1 :)\n");
                            }

                            else if (chohan.equals("han")){
                              System.out.println("El dado 1 muestra " + dado1);
                              System.out.println("El dado 2 muestra " + dado2);
                              System.out.println("\nLa suma de estos es " + suma + "\n");
                              System.out.println("Gana el jugador 2 :)\n");
                            }

                          } //PAR

                    else if (parimpar != 0) {

                      if (chohan.equals("cho")){
                        System.out.println("El dado 1 muestra " + dado1);
                        System.out.println("El dado 2 muestra " + dado2);
                        System.out.println("\nLa suma de estos es " + suma + "\n");
                        System.out.println("Gana el jugador 2 :)\n");
                      }

                      else if (chohan.equals("han")) {
                        System.out.println("El dado 1 muestra " + dado1);
                        System.out.println("El dado 2 muestra " + dado2);
                        System.out.println("\nLa suma de estos es " + suma + "\n");
                        System.out.println("Gana el jugador 2 :)\n");
                      }

                    } //IMPAR

            } //IF CHOHAN VALIDO

            else {
                  System.out.println("Algún jugador hizo una apuesta no permitida. Juego invalidado :(\n");
            }
          }  //ACABA APUESTAS DIFERENTES REPETICION

        } //ELSE VALIDO CHOHAN

      } //APUESTAS IGUALES

        else{

          if (validochohan == true && validochohan2 == true) {
                  if (parimpar == 0) {

                          if (chohan.equals("cho")){
                            System.out.println("El dado 1 muestra " + dado1);
                            System.out.println("El dado 2 muestra " + dado2);
                            System.out.println("\nLa suma de estos es " + suma + "\n");
                            System.out.println("Gana el jugador 1 :)\n");
                          }

                          else if (chohan.equals("han")){
                            System.out.println("El dado 1 muestra " + dado1);
                            System.out.println("El dado 2 muestra " + dado2);
                            System.out.println("\nLa suma de estos es " + suma + "\n");
                            System.out.println("Gana el jugador 2 :)\n");
                          }

                        } //PAR

                  else if (parimpar != 0) {

                    if (chohan.equals("cho")){
                      System.out.println("El dado 1 muestra " + dado1);
                      System.out.println("El dado 2 muestra " + dado2);
                      System.out.println("\nLa suma de estos es " + suma + "\n");
                      System.out.println("Gana el jugador 2 :)\n");
                    }

                    else if (chohan.equals("han")) {
                      System.out.println("El dado 1 muestra " + dado1);
                      System.out.println("El dado 2 muestra " + dado2);
                      System.out.println("\nLa suma de estos es " + suma + "\n");
                      System.out.println("Gana el jugador 2 :)\n");
                    }

                  } //IMPAR

          } //IF CHOHAN VALIDO

          else {
                System.out.println("Algún jugador hizo una apuesta no permitida. Juego invalidado :(\n");
          }
        } //ELSE APUESTAS DISTINTAS



    } //ACABA MODO DOS JUGADORES

        else {
                System.out.println("\nSolo es posible que jueguen uno o dos jugadores\n");
        }

}

}
