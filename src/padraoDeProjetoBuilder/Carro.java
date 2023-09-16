package padraoDeProjetoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	private String comprador;
    private String modelo;
    private String cor;
    private List<String> acessorios = new ArrayList<String>();

    public Carro(String comprador, String modelo, String cor, List<String> acessorios) {
		super();
		this.comprador = comprador;
		this.modelo = modelo;
		this.cor = cor;
		this.acessorios = acessorios;
	}

	@Override
	public String toString() {
		return String.format ("\n\tComprador: %s"
							+ "\n\tModelo: %s"
							+ "\n\tCor: %s"
							+ "\n\tAcessórios: %s"
							, comprador, modelo,cor, getAcessoriios());
		
	}

	private Object getAcessoriios() {
		String s = "";
		if (acessorios.size() > 0)
			for (String lista : acessorios) {
				s += lista + "\n\t\t    ";
			} else s = "Vazio\n";
		return s;
	}
}
