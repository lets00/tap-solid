package br.ifpe.tap.venda.main;

import br.ifpe.tap.venda.CalculadoraDePrecos;
import br.ifpe.tap.venda.frete.Correios;
import br.ifpe.tap.venda.frete.Loggi;
import br.ifpe.tap.venda.interfaces.Frete;
import br.ifpe.tap.venda.interfaces.TabelaDePreco;
import br.ifpe.tap.venda.model.Compra;
import br.ifpe.tap.venda.tabela.BlackFriday;
import br.ifpe.tap.venda.tabela.TabelaDePrecoPadrao;

public class Venda {
    public static void main(String[] args) {

        Compra fenderStrato = new Compra(3000, "Garanhuns");
        Frete correios = new Loggi();
        TabelaDePreco tabela = new BlackFriday();

        CalculadoraDePrecos cdp = new CalculadoraDePrecos(tabela, correios);

        double precoFinal = cdp.calcula(fenderStrato);

        System.out.println("Preço do produto: " + fenderStrato.getValor());
        System.out.println("Preço Final: " + precoFinal);
    }
}
