package br.com.sistemadeenergia;

public class Fatura {
	
	private int faturaId;
	
	private int mesAno;
	
	private UC unidadeConsumidora;
	
	private int consumo;

	private boolean pago;

	public String toString() {
		return "FaturaId: " + faturaId + "MesAno: " + mesAno + "Unidadeconsumidora: " + unidadeConsumidora.toString() + "Consumo: " + consumo + "Pago: " + pago ;
	}
	
	public double calcularValorFatura() {
		
		return 0.0;
		
	}
	
}



