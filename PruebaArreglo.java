public class PruebaArreglo{
	public static void main(String[] args) {
		Arreglo a;
		
		try{
			System.out.println("Creamos arreglo con capacidad para -1 elementos");
			a = new Arreglo(-1);
		}catch(CantidadInvalidaExcepcion e){
			System.out.println(e);
		}

		try{
			System.out.println("Creamos arreglo con capacidad para 5 elementos, e insertamos el numero 13 en la posicion 5");
			a = new Arreglo(5);
			a.insertar(13,5);
		}catch(PosicionInvalidaExcepcion e){
			System.out.println(e.getMessage());
		}catch(Exception ex){
			System.out.println(ex);
		}


		try{
			System.out.println("Creamos arreglo con capacidad para 5 elementos y obtenemos el numero almacenado en la posicion -15");
			a = new Arreglo(5);
			a.obtener(-15);
		}catch(PosicionInvalidaExcepcion e){
			System.out.println(e.getMessage());
		}catch(Exception ex){
			System.out.println(ex);
		}

		try{
			System.out.println("Creamos arreglo con capacidad para 5 elementos y dividimos los numeros de la posicion 0 y 3");
			a = new Arreglo(5);
			System.out.println(a.dividir(0,3));
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(Exception ex){
			System.out.println(ex);
		}


		
		try{
			System.out.println("Creamos arreglo con capacidad para 5 elementos, lo llenamos, mostramos su informacion y dividimos los numeros de la posicion 4 y 0");
			a = new Arreglo(5);
			for (int i=0, j=10; i<5; i++, j=j-2) {
				a.insertar(j,i);
			}
			for (int i=0; i<5;i++) {
				System.out.print(a.obtener(i) + ", ");
			}
			System.out.println();
			System.out.println("Division: " + a.dividir(0,4));
		}catch(Exception ex){
			System.out.println(ex);
		}

	}
}