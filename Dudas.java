import java.util.Random;

/**
* Programa para determinar el jugador que gana un disparejo
*@author Mauricio Chávez Olea
*
**/

public class Dudas {

public static void main (String[] pps){

int num1, num2;

//Crea un objeto de la clase Random

  Random random = new Random();

  System.out.println("");
  System.out.println("Programa para determinar el jugador que gana un disparejo");
  System.out.println("");

  num1 = random.nextInt(15);
  num2 = random.nextInt(15);

  System.out.println("Los enteros creados son: " + num1 + " y " + num2);


 if (num1 > num2){
   System.out.println("El mayor es: " + num1);

 }

 else if (num1 < num2){
   System.out.println("El mayor es: " + num2);

 }

 else {

   System.out.println("Ambos números son iguales");
 }

 System.out.println("");
}

}
