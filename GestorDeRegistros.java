public class GestorDeRegistros{
	
	private RegistroJuegos registro;

	/**
	* Constructor que crea un gestor de registros con un Registro de juegos pasado como parametro
	* @param registro -- Registro de Juegos
	*/
	public GestorDeRegistros(RegistroJuegos registro){
		this.registro = registro;
	}

	/**
	* Metodo que guarda un Registro de juego en un archivo
	* @see RegistroGanador
	*/
	public void guardarRegistroJuego(){
		ObjectOutputStream escritor = null;
		try{
			escritor = new ObjectOutputStream(new FileOutputStream("registroJuego.dat"));
			escritor.writeObject(new RegistroJuegos(this.obtenerArregloRegistroGanador(),this.obtenerNumeroRegistros(),100));
		}catch(NotSerializableException e){
			System.out.println((char)27 + "[31mError en la grabacion. Objeto no serializable");
		}catch(IOException e){
			System.out.println((char)27 + "[31mError en la grabacion: " + e);
		}finally{
			if(escritor!=null){
				try{
					escritor.close();
				}catch(IOException e){
					System.out.println((char)27 + "[31mHubo un error al cerrar el archivo");
				}
			}else{
				System.out.println((char)27 + "[31mNo hay ningún archivo abierto");
			}
		}
	}


}