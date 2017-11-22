import java.util.Date;

public class BoletosEstudiantes extends Boletos{

	public BoletosEstudiantes(Boletos boleto, String school){
		super(boleto.precio,boleto.espectaculo,boleto.fechaEvento.getDate(),boleto.fechaEvento.getMonth(),boleto.fechaEvento.getYear());

		if((school.trim().toLowerCase()).equals("unam") || (school.trim().toLowerCase()).equals("uam") || (school.trim().toLowerCase()).equals("politecnico"))
			super.asignarPrecio(boleto.precio*0.5);

		if(claveNumEst > 999) super.reiniciarClaveNumEst();

		if(claveNumEst < 10){
			super.asignarClave("BE-00" + claveNumEst);
			claveNumEst++;
		}
		else if(claveNumEst >= 10 && claveNumEst < 100){
			super.asignarClave("BE-0" + claveNumEst);
			claveNumEst++;
		}
		else{
			super.asignarClave("BE-" + claveNumEst);
			claveNumEst++;
		}
	}
}