/**
 * Clase para probar el programa pruebaPelicula.class
 * Objetivo: Ejercitar​ ​ la​ ​ teoría​ ​ obtenida​ ​ acerca​ ​ de​ ​ la​ ​ construcción​ ​ de​ ​ clases.
 * @author Mauricio Chávez Olea
 * @version 19092017
 */
public class Pelicula{

private String director ;
private String titulo ;
private int anio ;

public Pelicula(){
  director = "" ;
  titulo = "" ;
  anio = 0 ;
}

public Pelicula(String d, String t, int a){
  director = d ;
  titulo = t ;
  anio = a ;

}

public void asignarAnio(int a){
  anio = a ;
}

public void asignarDirector(String d){
  director = d ;
}

public void asignarTitulo(String t){
  titulo = t ;
}

public boolean equals(Pelicula p){
  return p.obtenerAnio() == anio && p.obtenerDirector().equals(director) && p.obtenerTitulo().equals(titulo) ;
  }

public int obtenerAnio(){
  return anio ;
}

public String obtenerDirector(){
  return director;
}

public String obtenerTitulo(){
  return titulo;
}

public String toString(){
  return "Titulo:​ " + titulo + "​(" + anio + ")\nDirector:​ " + director ;
}

}
