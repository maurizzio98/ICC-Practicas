import java.util.Scanner;
import java.util.Date;

public class MenuBoletos{

		static int opcion1,opcion2,numBoletos;
		static double costo;
		static String claves;
		static Scanner in = new Scanner(System.in);
		static Scanner str = new Scanner(System.in);
		static Boletos boleto;

	public static void menuEvento(int opcion){

		switch(opcion){
			case 1:
			boleto = new Boletos(5000,"Patriots vs Raiders Mexico",10,10,2017);
			System.out.println("\nSeleccione un tipo de boleto:");
			System.out.println("\n1. Boletos normales\n2. Boletos de prepago\n3. Boletos para estudiantes\n4. Boletos para personas de tercera edad\n\nEscriba cualquier otro numero para finalizar la compra:");
			opcion2 = in.nextInt();
			MenuBoletos.compraBoletos(opcion2);
			break;

			case 2:
			boleto = new Boletos(1000,"Corona Capital",18,11,2017);
			System.out.println("\nSeleccione un tipo de boleto:");
			System.out.println("\n1. Boletos normales\n2. Boletos de prepago\n3. Boletos para estudiantes\n4. Boletos para personas de tercera edad\n\nEscriba cualquier otro numero para finalizar la compra:");
			opcion2 = in.nextInt();
			MenuBoletos.compraBoletos(opcion2);
			break;

			case 3:
			boleto = new Boletos(2500,"Formula 1",6,8,2017);
			System.out.println("\nSeleccione un tipo de boleto:");
			System.out.println("\n1. Boletos normales\n2. Boletos de prepago\n3. Boletos para estudiantes\n4. Boletos para personas de tercera edad\n\nEscriba cualquier otro numero para finalizar la compra:");
			opcion2 = in.nextInt();
			MenuBoletos.compraBoletos(opcion2);
			break;

			case 4:
			boleto = new Boletos(500,"El Rey Leon",8,9,2017);
			System.out.println("\nSeleccione un tipo de boleto:");
			System.out.println("\n1. Boletos normales\n2. Boletos de prepago\n3. Boletos para estudiantes\n4. Boletos para personas de tercera edad\n\nEscriba cualquier otro numero para finalizar la compra:");
			opcion2 = in.nextInt();
			MenuBoletos.compraBoletos(opcion2);
			break;

			default:
			System.out.println("\nHasta luego :)");
			break;
		}
	}

	public static void compraBoletos(int opcion){
		switch(opcion){
			case 1:
			Boletos[] boletos;
			System.out.print("Introduzca el numero de boletos a comprar: ");
			numBoletos = in.nextInt();
			boletos = new Boletos[numBoletos];
			costo = 0;
			claves = "";
			for(int i=0;i<numBoletos;i++){			
				boletos[i] = new Boletos(boleto.precio,boleto.espectaculo,boleto.fechaEvento.getDate(),boleto.fechaEvento.getMonth(),boleto.fechaEvento.getYear());
				costo += boletos[i].precio;
				claves += boletos[i].clave + "\n";
			}
			System.out.println("\n" + MenuBoletos.boletoImpreso(boletos[0].espectaculo,costo,boletos[0].fechaEvento,boleto,opcion));
			System.out.println("Claves de los boletos:\n" + claves);
			break;

			case 2:
			int dia,mes,anio;
			BoletosPrepago[] boletoNuevo;
			System.out.print("Introduzca el numero de boletos a comprar: ");
			numBoletos = in.nextInt();
			System.out.print("\nIntroduzca el dia de compra: ");
			dia = in.nextInt();
			System.out.print("\nIntroduzca el mes de compra: ");
			mes = in.nextInt();
			System.out.print("\nIntroduzca el año de compra: ");
			anio = in.nextInt();

			boletoNuevo = new BoletosPrepago[numBoletos];
			costo = 0;
			claves = "";
			for(int i=0;i<numBoletos;i++){			
				boletoNuevo[i] = new BoletosPrepago(boleto,dia,mes,anio);
				costo += boletoNuevo[i].precio;
				claves += boletoNuevo[i].clave + "\n";
			}
			System.out.println("\n" + MenuBoletos.boletoImpreso(boletoNuevo[0].espectaculo,costo,boletoNuevo[0].fechaEvento,boleto,opcion));
			System.out.println("Claves de los boletos:\n" + claves);
			break;

			case 3:
			String escuela;
			BoletosEstudiantes[] boletoEstudiante;
			System.out.print("Introduzca el numero de boletos a comprar: ");
			numBoletos = in.nextInt();
			System.out.print("\nIntroduzca la escuela de donde proviene: ");
			escuela = str.nextLine();

			boletoEstudiante = new BoletosEstudiantes[numBoletos];
			costo = 0;
			claves = "";
			for(int i=0;i<numBoletos;i++){
				boletoEstudiante[i] = new BoletosEstudiantes(boleto,escuela);
				costo += boletoEstudiante[i].precio;
				claves += boletoEstudiante[i].clave + "\n";
			}
			System.out.println("\n" + MenuBoletos.boletoImpreso(boletoEstudiante[0].espectaculo,costo,boletoEstudiante[0].fechaEvento,boleto,opcion));
			System.out.println("Claves de los boletos:\n" + claves);
			break;

			case 4:
			String credencial;
			boolean inapam;
			BoletosTerceraEdad[] boleto3;

			System.out.print("Introduzca el numero de boletos a comprar: ");
			numBoletos = in.nextInt();
			System.out.print("\n¿Cuenta con credencial del INAPAM? [si/no]:\n");
			credencial = str.nextLine();
			inapam = credencial.trim().toLowerCase().equals("si");

			boleto3 = new BoletosTerceraEdad[numBoletos];
			costo = 0;
			claves = "";
			for(int i=0;i<numBoletos;i++){
				boleto3[i] = new BoletosTerceraEdad(boleto,inapam);
				costo += boleto3[i].precio;
				claves += boleto3[i].clave + "\n";
			}
			System.out.println("\n" + MenuBoletos.boletoImpreso(boleto3[0].espectaculo,costo,boleto3[0].fechaEvento,boleto,opcion));
			System.out.println("Claves de los boletos:\n" + claves);
			break;

			default:
			System.out.println("\nHasta luego :)");

		}
	}

	public static String boletoImpreso(String espectaculo,double precio,Date fechaEvento, Boletos boletoOriginal,int opcion){

		if (opcion!=1) return "Boletos para " + espectaculo + "\nPrecio por boleto: $" + boletoOriginal.precio + "\nPrecio por boleto (con descuento): $" + costo/numBoletos + "\nImporte total: $" + costo  + "\nFecha de realizacion: " + fechaEvento.getDate() + "/" + fechaEvento.getMonth() + "/" + fechaEvento.getYear();
		else return "Boletos para " + espectaculo + "\nPrecio por boleto: $" + boletoOriginal.precio  + "\nImporte total: $" + costo + "\nFecha de realizacion: " + fechaEvento.getDate() + "/" + fechaEvento.getMonth() + "/" + fechaEvento.getYear();

	}

	public static void main(String[] pps){
		boolean compraNoFinalizada;
		String compraNoFinalizadaStr;
		do{
			System.out.println("Seleccione un evento:");
			System.out.print("\n1. Patriots vs Raiders Mexico\n2. Corona Capital\n3. Formula 1\n4. El Rey Leon\n\nEscriba cualquier otro numero para finalizar: ");
			opcion1 = in.nextInt();
			MenuBoletos.menuEvento(opcion1);
			System.out.println("¿Desea seguir comprando? [si/no]");
			compraNoFinalizadaStr = str.nextLine();
			compraNoFinalizada = compraNoFinalizadaStr.trim().toLowerCase().equals("si");
		}while(compraNoFinalizada);

		System.out.println("\n\nGracias por su preferencia :)");
	}
}