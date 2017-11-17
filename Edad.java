import java.util.Scanner ;

/**
 * Programa para calcular la edad de una persona
 * Objetivo. crear y utilizar objetos de la clase Fecha
 * @author Mauricio Chávez Olea
 * @version
 */
public class Edad {
    public static void main(String[] pps) {

	//Declarar las variables

  Scanner in = new Scanner (System.in) ;
  String nombre ;
  int d, m, a, cumpleanos, edad, dtranscurridoshoy, dtranscurridoscumplehoy, dtranscurridoscumpleanos, dcumpleanos, diaactual, mesactual, anioactual;
  float p, q, r ;

	//Recabar informacion

  System.out.println("");
  System.out.print("Dame tu nombre: ");
  nombre = in.nextLine();

  System.out.println("");
  System.out.println(nombre+ ", dame tu fecha de nacimiento");

  System.out.print("Dia: ");
  d = in.nextInt();

  System.out.print("Mes: ");
  m = in.nextInt();

  System.out.print("Año: ");
  a = in.nextInt();

 //Validar la informacion

 p = a % 4 ;
 q = a % 100 ;
 r = a % 400 ;

   anioactual = fechaactual.obtenerAnio();

   System.out.println("");

  if((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) && d > 31 ) {
    System.out.println("Día inválido");
  }

  else if((m==4 || m==6 || m==9 || m==11) && d > 30 ) {
    System.out.println("Día inválido");
  }

  //Año bisiesto
  else if( (m==2) && (p==0 && ( q!=0 || r==0 )) && (d > 29) ) {
  System.out.println("Día inválido");
  }

  //Año no bisiesto
  else if( (m==2) && (p!=0 && ( q==0 || r!=0 )) && (d >= 28) ) {
  System.out.println("Día inválido");
  }



  else if(m > 12 ) {
    System.out.println("Mes inválido");
  }

  else if(a<1900) {
    System.out.println("Año inválido: debe ser mayor a 1900");
  }

  else if(a>anioactual) {
    System.out.println("Tu fecha de nacimiento no puede ser mayor a la actual.");
  }
  	//Calcular edad

  else {

  Fecha fechacumpleanos = new Fecha(d,m,a) ;

  dtranscurridoscumpleanos = fechacumpleanos.diasTranscurridos() ;

  dtranscurridoscumpleanos = dtranscurridoscumpleanos + 365 ;

  Fecha fechaactual = new Fecha() ;

  dtranscurridoshoy = fechaactual.diasTranscurridos() ;

  dtranscurridoscumplehoy = dtranscurridoshoy - dtranscurridoscumpleanos - 4 ;

  edad = (dtranscurridoscumplehoy/365) + 1 ;

 System.out.println(nombre+", tienes " + edad + " años ");

  //Feliz cumpleaños

  diaactual = fechaactual.obtenerDia();
  mesactual = fechaactual.obtenerMes();

    if ((diaactual==d && mesactual==m) && (a!=anioactual)) {
  System.out.println("Feliz cumpleaños, " + nombre + " :)");
}

else if ((diaactual==d && mesactual==m) && (a==anioactual)  ) {
System.out.println("¡Hoy naciste, " + nombre + "! :)");
} else {

  //Calcular cantidad de dias para el proximo cumpleanos

  dcumpleanos = 365 - (dtranscurridoscumplehoy % 365) ;
  System.out.println("Faltan " + dcumpleanos + " días para tu cumpleaños ");

}

  //Calcular en que rango de edad esta

  if (edad<18){
    System.out.println("Eres menor de edad");
  }

  else if (edad>=18 && edad <=30){
    System.out.println("Eres un adulto joven");
  }

  else if (edad>30 && edad <=60){
    System.out.println("Eres un adulto");
  }

  else {
    System.out.println("Eres un adulto mayor");
  }

  }

  System.out.println("");


    }
}
