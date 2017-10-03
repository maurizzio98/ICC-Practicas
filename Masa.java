/**
 * Clase para probar el programa PruebaMasa.class
 * Objetivo: Ejercitar​ ​ la​ ​ teoría​ ​ obtenida​ ​ acerca​ ​ de​ ​ la​ ​ construcción​ ​ de​ ​ clases.
 * @author Mauricio Chávez Olea
 * @version 03102017
 */
public class Masa{

  private double amount ;
  private boolean type;

  public Masa(){
    amount = 0 ;
    type = true ;
  }

  public Masa(double cantidad, boolean tipo){
    amount = cantidad ;
    type = tipo ;
  }

  public Masa(Masa m){
    amount = m.obtenerCantidad() ;
    type = m.obtenerTipo() ;
  }

  public double obtenerCantidad(){
    return amount ;
  }

  public boolean obtenerTipo(){
    return type ;
  }

  public void asignaCantidad(double cantidad){
    amount = cantidad ;
  }

  public void asignaTipo(boolean tipo){
    type = tipo ;
  }

  public void convertirAKilogramos(){

    if (type == true){
      amount = amount ;
      type = true ;
    }

    else {
      amount = Math.round(amount * (0.45)) ;
      type = true ;
    }

  }

  public void convertirALibras(){

    if (type == false){
      amount = amount ;
      type = false;
    }

    else {
      amount = Math.round(amount * (2.2)) ;
      type = true ;
    }

  }


  public int comparar(Masa m){

    //Si la masa almacenada está en kg

    if (type == true){

      if (m.obtenerTipo() == true){

        if (m.obtenerCantidad() == amount){
          return 0 ;
        }
        else if (m.obtenerCantidad() < amount){
          return 1 ;
        }
          return -1  ;
      }

      else {

        m.convertirAKilogramos() ;

        if (m.obtenerCantidad() == amount){
          return 0 ;
        }
        else if (m.obtenerCantidad() < amount){
          return 1 ;
        }
          return -1  ;
      }
    }

    //Si la masa almacenada está en lb

    else{

      if (m.obtenerTipo() == false){

        if (m.obtenerCantidad() == amount){
          return 0 ;
        }
        else if (m.obtenerCantidad() < amount){
          return 1 ;
        }
          return -1  ;
      }

      else {
        m.convertirAKilogramos() ;

        if (m.obtenerCantidad() == amount){
          return 0 ;
        }
        else if (m.obtenerCantidad() < amount){
          return 1 ;
        }
          return -1  ;
      }
    }

  }


  public String toString(){

    if (type == true){
      return amount + " kg" ;
    }

    else {
      return amount + " lb" ;
    }

  }

}
