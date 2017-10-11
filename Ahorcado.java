/**
 * Clase a usarse en PruebaAhorcado.class
 * Objetivo: Ejercitar la teoría acerca de​ ​ arreglos​ ​ con datos​ ​ primitivos.
 * @author Mauricio Chávez Olea
 * @version 10102017
 */

 public class Ahorcado{

   private boolean[] abecedario;
   private char[] palabraAAdivinar;
   private String abecedario2 = "abcdefghijklmnopqrstuvwxyz" ;
   private String palabraJuego ;


   /**
    * Constructor que crea dos arreglos,
    * uno con las letras de la palabra pasada como parámetro y otro con booleanos representando cada letra del abecedario.
    * @param palabra palabra con la que el usuario jugará el juego de ahorcado
    */

   public Ahorcado(String palabra){

     palabraJuego = palabra ;
     
     abecedario = new boolean[26];

     for (int i=0;i<abecedario.length;i++){
       abecedario[i] = false ;
     }

     palabraAAdivinar = new char[palabra.length()] ;

     palabraAAdivinar[0] = palabra.charAt(0) ;
     abecedario[abecedario2.indexOf(palabra.toLowerCase().charAt(0))] = true ;

     for(int i=1;i<palabraAAdivinar.length;i++){
       palabraAAdivinar[i] = '_' ;
     }

   }


   /**
    * Método que marca la letra pasada como parámetro como true en el arreglo booleano
    * @param letra letra que será marcada como true en el arreglo booleano
    */

   public void marcarLetra(char letra){

     abecedario[abecedario2.indexOf(Character.toLowerCase(letra))] = true;

     for(int i=0;i<palabraAAdivinar.length;i++){

       char lowerCase = Character.toLowerCase(letra) ;

       if (lowerCase == palabraJuego.charAt(i) && abecedario2.indexOf(letra) != -1){
         palabraAAdivinar[i] = letra ;
       }

       else if (lowerCase == palabraJuego.charAt(i) && abecedario2.indexOf(letra) == -1){
          palabraAAdivinar[i] = Character.toLowerCase(letra);
       }
     }

   }

   /**
    * Método que determina​ ​ si​ ​ la​ ​ letra​ ​ pasada​ ​ como​ ​ parámetro​ ​ ya​ ​ se​ ​ ha​ ​ mencionado en​ ​ el​ ​ juego.
    * @param letra Letra que buscará el método para verificar si ya ha sido mencionada
    * @return bool True en caso de que haya sido mencionada o false en caso contrario
    */

   public boolean letraMarcada(char letra){

     return abecedario[abecedario2.indexOf(Character.toLowerCase(letra))] ;

   }

   /**
    * Método que simula la acción de escribir la letra pasada como parámetro en la palabra si es que se encuentra en nuestra palabra. Devuelve el número de veces que aparece la letra en nuestra palabra
    * @param letra Letra que será escrita en nuestra palabra y que será contada para regresar el número de veces que esta aparece
    * @return int Número de veces que aparece la letra pasada como parámetro
    */

   public int escribirLetra(char letra){

     int contador = 0 ;

     for(int i=0; i<palabraAAdivinar.length;i++){
        if (Character.toLowerCase(letra)==Character.toLowerCase(palabraAAdivinar[i])){
          contador++ ;
        }
     }

     /* Las siguientes líneas las comento ya que la práctica dice que, en caso de que la letra pasada
        como parámetro no esté en la palabra, devolver -1 pero, si hacemos eso, por alguna razón el
        programa se cicla. De cualquier manera, dejo debajo el código correspondiente.

        if (contador==0){
          return -1 ;
        }

        else {
          return contador ;
        } */

     return contador ;

   }


   /**
    * Método que devuelve​ ​ el​ ​ arreglo​ ​ de​ ​ tipo​ ​ char​ ​ como​ ​ un​ ​ String.
    * @return String Devuelve la palabra a adivinar con los espacios correspondientes en las letras que no han sido adivinadas.
    */

   public String toString(){

     return String.valueOf(palabraAAdivinar) ;

   }


 }
