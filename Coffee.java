import java.util.Scanner ;

  public class Coffee {
    public static void main (String [] pps) {

      int seleccion, cm, ca, capmax, cant;
      Scanner in = new Scanner (System.in) ;

      System.out.println("Crearé una cafetera llena\nDame una capacidad maxima");
      capmax = in.nextInt();

      System.out.println("Cantidad actual:");
      cant = in.nextInt();

      Cafetera laCafetera = new Cafetera(capmax,cant);

      System.out.println("Obtener 1 asignar 2");
      seleccion = in.nextInt();

      if(seleccion==1){
      cm = laCafetera.obtenerCapacidadMaxima();
      ca = laCafetera.obtenerCantidadActual();

      System.out.println("Capacidad máxima: " + cm);
      System.out.println("Cantidad actual: " + ca);
    }

      else if (seleccion==2){
        int nuevacm, nuevaca;

        System.out.println("Dame capacidad máxima");
        nuevacm = in.nextInt();

        System.out.println("Dame cantidad actual");
        nuevaca = in.nextInt();

        laCafetera.asignarCapacidadMaxima(nuevacm);
        laCafetera.asignarCantidadActual(nuevaca);

        cm = laCafetera.obtenerCapacidadMaxima();
        ca = laCafetera.obtenerCantidadActual();

        System.out.println("Capacidad máxima: " + cm);
        System.out.println("Cantidad actual: " + ca);

      }
    }

  }
