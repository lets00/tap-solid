package br.ifpe.tap.venda.main;

import br.ifpe.tap.venda.CalculadoraDePrecos;
import br.ifpe.tap.venda.model.Compra;

public class Venda {

    public static void main(String[] args) {
        Compra iphone = new Compra(3000, "Sao paulo");
        CalculadoraDePrecos cdp = new CalculadoraDePrecos();
        double iphoneComDesconto = cdp.calcula(iphone);

        System.out.println("Preço do produto: " + iphone.getValor());
        System.out.println("Preço Final + frete: " + iphoneComDesconto);
    }
}
