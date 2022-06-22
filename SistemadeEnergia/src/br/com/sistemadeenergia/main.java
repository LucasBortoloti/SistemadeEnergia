package br.com.sistemadeenergia;

public class main {

	public static void main(String[] args) {
		Tarifa t = new Tarifa();
		
		
		System.out.println("1 - CADASTRAR CLIENTE");
		
		System.out.println("2 - CADASTRAR UNIDADES CONSUMIDORAS");
		
		System.out.println("3 - FAZER LEITURA");
		
		System.out.println("3.1 - Informar a leitura atual");
		
		System.out.println("4 - FATURAR CONSUMO");

		System.out.println("5 - EXIBIR RELATÓRIOS");

		System.out.println("5.1 - Todos os clientes");
		
		System.out.println("5.2 - Faturar pendentes");
		      
		System.out.println("5.3 - Faturas de um cliente específico (cpf/cnpj)");
		   
		System.out.println("5.4 - Todas as faturas de um mês em específico (informado pelo usuário)");
		 

		    
		
		//System.out.println("Ola mundo: "+ t.getTarResidencial1());
	}

}
