import java.util.Date;

public class BoletosTerceraEdad extends Boletos{

	public BoletosTerceraEdad(Boletos boleto, boolean inapam){
		super(boleto.precio,boleto.espectaculo,boleto.fechaEvento.getDate(),boleto.fechaEvento.getMonth(),boleto.fechaEvento.getYear());

		if(inapam)
			super.asignarPrecio(10);

		if(claveNum3 > 999) super.reiniciarClaveNum3();

		if(claveNum3 < 10){
			super.asignarClave("B3-00" + claveNum3);
			claveNum3++;
		}
		else if(claveNum3 >= 10 && claveNum3 < 100){
			super.asignarClave("B3-0" + claveNum3);
			claveNum3++;
		}
		else{
			super.asignarClave("B3-" + claveNum3);
			claveNum3++;
		}
	}
}