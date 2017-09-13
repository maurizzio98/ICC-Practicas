import java.util.Scanner ;

/**
 * Programa que extraiga la dirección electrónica del dominio ciencias de un texto.
 * @author Mauricio Chávez Olea
 */

public class Email {
    public static void main(String[] pps) {

      Scanner in = new Scanner (System.in) ;
      String texto, email, textominus, textoespaciofinal,textoespaciadoinicio ;
      String inicioespaciado = " " ;
      int posicionciencias, posicionarroba, pos1, pos2;

      System.out.println("Dame un texto:") ;
      texto = in.nextLine() ;

      textominus = texto.toLowerCase() ;
      posicionarroba= textominus.indexOf("@") ;

      if(posicionarroba==-1){ 

      System.out.println("No hay direccion electronica");

    }

      else {

        posicionciencias= textominus.indexOf("@ciencias.unam.mx") ;

//NO ES UN CORREO DE CIENCIAS
        if(posicionciencias==-1){

          textoespaciadoinicio = inicioespaciado.concat(textominus);
          textoespaciofinal = textoespaciadoinicio.concat(" ");
          pos1 = textoespaciofinal.lastIndexOf(" ",posicionarroba) ;
          pos2 = textoespaciofinal.indexOf(" ",posicionarroba) ;
          email = textoespaciofinal.substring(pos1,pos2) ;

            if (pos1==posicionarroba){
            System.out.println("Esto es una dirección de correo inválida: Falta algo antes de la arroba (@)");
            }

            else {
              System.out.println("La direccion es" + email + " pero no está en el dominio de ciencias.");

            }

}

//CORREO DE CIENCIAS
        else {

          textoespaciadoinicio = inicioespaciado.concat(textominus);
          textoespaciofinal = textoespaciadoinicio.concat(" ");
          pos1 = textoespaciofinal.lastIndexOf(" ",posicionarroba) ;
          pos2 = textoespaciofinal.indexOf(" ",posicionarroba) ;
          email = textoespaciofinal.substring(pos1,pos2) ;

//CORREO DE CIENCAS INVÁLIDO
            if (pos1==posicionarroba){
            System.out.println("Esto es una dirección de CORREO CIENCIAS inválida: Falta algo antes de la arroba (@)");
            }
//CORREO DE CIENCAS VÁLIDO
            else {
              System.out.println("La direccion es" + email + " y sí está en el dominio ciencias");

            }

        }

      }


    }
}
