import java.util.Scanner;

/**
 * Clase para simular el cobro estacionamiento a autos.
 * @author Mauricio Chávez Olea
 */
public class Estacionamiento {

    public Estacionamiento() {

    }


    /**
     * Método que devuelve un boleto de estacionamiento que contenga la hora de llegada
     * @param hora Hora a asignar a la hora de llegada
     * @return BoletoEstacionamiento Boleto de estacionamiento con la hora de llegada
     */

    public BoletoEstacionamiento recibirCoche(Hora hora){

        BoletoEstacionamiento nuevoBoletoDelCliente = new BoletoEstacionamiento(hora);

        nuevoBoletoDelCliente.establecerHoraLlegada(hora);

        System.out.println("Bienvenido.");
        System.out.println("La tarifa es de $2.00 la primera hora y de $10.00 las siguientes.");
        System.out.println("Tu hora de llegada es: " + hora.toString() + "\n");

        return nuevoBoletoDelCliente ;

    }


    /**
     * Método que cobra la cantidad a cobrar según el tiempo que estuviste en el estacionamiento. Sella el boleto con la hora de pago y confirma que se ha pagado el boleto si el pago se efectuó correctamente
     * @param boletoDelCliente Boleto del cliente sellado con la hora de llegada
     * @param hora Hora a asignar a la hora de pago
     */

    public void cobrarCuota(BoletoEstacionamiento boletoDelCliente, Hora hora){

        Caja cajanueva = new Caja();
        Cajero cajeronuevo = new Cajero (cajanueva);
        Hora llegada;

        llegada = boletoDelCliente.obtenerHoraLlegada();

        if ( ( hora.restar(llegada).obtenerHora() ) <= 1){
            cajeronuevo.cobrar(2);
            System.out.println("\nHora de llegada: " + llegada.toString() );
            System.out.println("Hora de pago: " + hora.toString() );
            System.out.println("Tiempo estacionado: " + hora.restar(llegada).toString() );
            System.out.println("Total a pagar: $2");
        }

        else{

            double aCobrar ;
            Hora horauno = new Hora(1,0,0);

            aCobrar = ((hora.restar(llegada).restar(horauno).obtenerHora())*10) + 2 ;

            if ( hora.restar(llegada).obtenerMinutos() != 0 ){
              aCobrar = aCobrar + 10 ;
            }

            cajeronuevo.cobrar(aCobrar);
            System.out.println("\nHora de llegada: " + llegada.toString() );
            System.out.println("Hora de pago: " + hora.toString() );
            System.out.println("Tiempo estacionado: " + hora.restar(llegada).toString() );
            System.out.println("Total a pagar: $" + aCobrar);
        }

        boletoDelCliente.estaPagado();
        boletoDelCliente.establecerHoraDePago(hora);

    }


    /**
     * Método que verifica si el boleto del cliente ya ha sido pagado, además verifica que el cliente no haya excedido los 15 minutos desde que se efectuó el pago
     * @param boletoDelCliente Boleto del cliente sellado con la hora de llegada, con la hora de pago y , en el caso de que haya sido pagado, con el sello de pagado
     * @param hora Hora a asignar a la hora de salida
     */

    public void despacharCoche(BoletoEstacionamiento boletoDelCliente, Hora hora){

      if (boletoDelCliente.estaPagado() == true){

          if ( hora.restar(boletoDelCliente.obtenerHoraDePago()).obtenerMinutos() <= 15){

              System.out.println("Hora de pago: " + boletoDelCliente.obtenerHoraDePago().toString());
              System.out.println("Hora actual: " + hora.toString());

              System.out.println("\nGracias por visitarnos. Vuelva pronto.");
          }

          else {

            System.out.println("Hora de pago: " + boletoDelCliente.obtenerHoraDePago().toString());
            System.out.println("Hora actual: " + hora.toString());

            System.out.println("\nExcediste el tiempo de tolerancia");

          }

        }

     else {

        System.out.println("Lo sentimos, no puede salir. Primero hay que pagar\n");
     }

}

}
