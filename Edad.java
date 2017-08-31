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

  System.out.print("\nDame tu nombre: ");
  nombre = in.nextLine();

  System.out.println("\n" + nombre + ", dame tu fecha de nacimiento");

  System.out.print("Dia: ");
  d = in.nextInt();

  System.out.print("Mes: ");
  m = in.nextInt();

  System.out.print("Año: ");
  a = in.nextInt();

 p = a % 4 ;
 q = a % 100 ;
 r = a % 400 ;

   Fecha fechaactual = new Fecha() ;

   diaactual = fechaactual.obtenerDia();
   mesactual = fechaactual.obtenerMes();
   anioactual = fechaactual.obtenerAnio();

   System.out.println("");

  //Validar la información


  //Restricciones día

  if((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) && d > 31 ) {
    System.out.println("Día inválido");
  }

  else if((m==4 || m==6 || m==9 || m==11) && d > 30 ) {
    System.out.println("Día inválido");
  }

  //Restriciones año bisiesto

  else if( (m==2) && (p==0 && ( q!=0 || r==0 )) && (d > 29) ) {
  System.out.println("Día inválido");
  }

  //Restriciones año no bisiesto

  else if( (m==2) && (p!=0 && ( q==0 || r!=0 )) && (d >= 28) ) {
  System.out.println("Día inválido");
  }


  //Restricciones mes

  else if(m > 12 ) {
    System.out.println("Mes inválido");
  }

  //Restricciones año

  else if(a<1900) {
    System.out.println("Año inválido: debe ser mayor a 1900");
  }


  //Restricciones fecha nacimiento mayor a fecha actual
  else if(a>anioactual) {
    System.out.println("Tu fecha de nacimiento no puede ser mayor a la actual :(");
  }

  else if(a==anioactual && m>mesactual) {
    System.out.println("Tu fecha de nacimiento no puede ser mayor a la actual :(");
  }

  else if(a==anioactual && m==mesactual && d>diaactual) {
    System.out.println("Tu fecha de nacimiento no puede ser mayor a la actual :(");
  }

 //Inicia caso general

    //Calcular edad

  else {

  Fecha fechacumpleanos = new Fecha(d,m,a) ;

  dtranscurridoscumpleanos = fechacumpleanos.diasTranscurridos() ;

  dtranscurridoscumpleanos = dtranscurridoscumpleanos + 365 ;

    dtranscurridoshoy = fechaactual.diasTranscurridos() ;

  dtranscurridoscumplehoy = dtranscurridoshoy - dtranscurridoscumpleanos - 4 ;

  edad = (dtranscurridoscumplehoy/365) + 1 ;

 System.out.println(nombre + ", tienes " + edad + " años ");

  //¡Feliz cumpleaños!

    if ((diaactual==d && mesactual==m) && (a!=anioactual)) {
  System.out.println("Feliz cumpleaños, " + nombre + " :)");
}

  //Recien nacido 7u7

else if ((diaactual==d && mesactual==m) && (a==anioactual)  ) {
System.out.println("¡Naciste hoy, " + nombre + "! :)");
} else {

  //Calcular cantidad de días para el proximo cumpleaños

  dcumpleanos = 365 - (dtranscurridoscumplehoy % 365) ;
  System.out.println("Faltan " + dcumpleanos + " días para tu cumpleaños ");

}

  //Calcular en que rango de edad está

  if (edad<18){
    System.out.println("Eres menor de edad\n");
  }

  else if (edad>=18 && edad <=30){
    System.out.println("Eres un adulto joven\n");
  }

  else if (edad>30 && edad <=60){
    System.out.println("Eres un adulto\n");
  }

  else {
    System.out.println("Eres un adulto mayor\n");
  }

} //Acaba caso general

    }
}
