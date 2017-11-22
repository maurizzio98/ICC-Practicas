import java.util.Date;

public class Boletos{
	double precio;
	private static byte claveNum = 0;
	static byte claveNumPrep = 1;
	static byte claveNumEst = 1;
	static byte claveNum3 = 1;
	String espectaculo;
	Date fechaEvento;
	String clave;

	public Boletos(double precio,String espectaculo,int diaEvento, int mesEvento, int anioEvento){
		this.precio = precio;
		this.espectaculo = espectaculo;
		fechaEvento = new Date(anioEvento,mesEvento,diaEvento);
		
		if(claveNum > 999) claveNum = 0;

		if(claveNum < 10){
			clave = "BN-00" + claveNum;
			claveNum++;
		}
		else if(claveNum >= 10 && claveNum < 100){
			clave = "BN-0" + claveNum;
			claveNum++;
		}
		else{
			clave = "BN-" + claveNum ;
			claveNum++;
		}
	}

	public void asignarPrecio(double price){
		precio = price;
	}

	public void asignarClave(String code){
		clave = code ;
	}

	public void reiniciarClaveNumPrep(){
		claveNumPrep = 1 ;
	}

	public void reiniciarClaveNumEst(){
		claveNumEst = 1 ;
	}
	
	public void reiniciarClaveNum3(){
		claveNum3 = 1 ;
	}
}
