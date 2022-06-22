package br.com.sistemadeenergia;

public class Tarifa {
	
	private  double tarResidencial1 = 0.38790;
	
	private double tarResidencial2 = 0.40500;
	
	private double tarComercial1 = 0.42550;
	
	private double tarComercial2 = 0.45113;
	
	private double icms = 27;
	
	private double taxaIluminacaoPublica = 7.8;

	public double getTarResidencial1() {
		return tarResidencial1;
	}

	public double getTarResidencial2() {
		return tarResidencial2;
	}

	public double getTarComercial1() {
		return tarComercial1;
	}

	public double getTarComercial2() {
		return tarComercial2;
	}

	public double getIcms() {
		return icms;
	}

	public double getTaxaIluminacaoPublica() {
		return taxaIluminacaoPublica;
	}
	
	

}
