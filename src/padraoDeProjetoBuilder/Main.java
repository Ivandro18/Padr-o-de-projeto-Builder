package padraoDeProjetoBuilder;

public class Main {
	public static void main(String[] args) {
		
		// Usando o Builder para criar um objeto Car
	    Carro carro1 = new CarroBuilder()
	        .setComprador("Ivandro")
	        .setColor("Preto")
	        .setModel("Siena")
	        .build();
	    
	    System.out.print("carro 1");
	    System.out.println(carro1);
	
	    // Criando outro objeto Car com configurações diferentes
	    Carro carro2 = new CarroBuilder()
	            .setComprador("Pedro")
	            .setModel("Honda Civic")
	            .addAcessorios("Teto solar")
	            .addAcessorios("Banco de couro")
	            .addAcessorios("Rodas aro 17")
	            .build();
	    
	    System.out.print("carro 2");
	    System.out.println(carro2);
	}
}
