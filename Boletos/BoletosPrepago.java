import java.util.Date;

public class BoletosPrepago extends Boletos{

	public BoletosPrepago(Boletos boleto,int diaCompra,int mesCompra, int anioCompra){

		super(boleto.precio,boleto.espectaculo,boleto.fechaEvento.getDate(),boleto.fechaEvento.getMonth(),boleto.fechaEvento.getYear());

		Date fechaCompra = new Date(anioCompra,mesCompra,diaCompra);
		long diferenciaEnMS = boleto.fechaEvento.getTime() - fechaCompra.getTime();
		int diasDiferencia = (int) diferenciaEnMS/(1000*60*60*24);

		if(diasDiferencia>=10) super.asignarPrecio(boleto.precio*0.2);
		else if(diasDiferencia<10&&diasDiferencia>3) super.asignarPrecio(boleto.precio*0.1);

		if(claveNumPrep > 999) super.reiniciarClaveNumPrep();

		if(claveNumPrep < 10){
			super.asignarClave("BP-00" + claveNumPrep);
			claveNumPrep++;
		}
		else if(claveNumPrep >= 10 && claveNumPrep < 100){
			super.asignarClave("BP-0" + claveNumPrep);
			claveNumPrep++;
		}
		else{
			super.asignarClave("BP-" + claveNumPrep);
			claveNumPrep++;
		}
		
	}
}