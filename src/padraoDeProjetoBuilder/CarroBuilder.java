package padraoDeProjetoBuilder;

import java.util.ArrayList;
import java.util.List;

public class CarroBuilder {
	
	private String comprador;
    private String modelo;
    private String cor;
    private List<String> acessorios = new ArrayList<String>();
    
    public Carro build() {
        return new Carro(comprador, modelo, cor, acessorios);
    }

    public CarroBuilder setComprador(String brand) {
        this.comprador = brand;
        return this;
    }

    public CarroBuilder setModel(String model) {
        this.modelo = model;
        return this;
    }

    public CarroBuilder addAcessorios(String acessorio) {
        this.acessorios.add(acessorio);
        return this;
    }

    public CarroBuilder setColor(String color) {
        this.cor = color;
        return this;
    }
}
