/**
* Programa para probar el paso de parametros al metodo main
* @author Mauricio Chávez Olea
*/
public class Nombre{
	public static void main(String[] args) {
		if (args.length<3)
			System.out.println("Debes ingresar al menos tres cadenas para el nombre");
		else {
			String nombres = args[0] ;
			String apellidos = args[args.length-2].concat(" " + args[args.length-1]);
			String nombreCompleto;

			for(int i=1;i<args.length-2;i++){
				nombres = nombres.concat(" " + args[i]);
			}

			nombreCompleto = apellidos.concat(" " + nombres);

			System.out.println("El nombre completo es: " + nombreCompleto.trim());
			System.out.println("El nombre es: " + nombres.trim());
		}

	}
}
