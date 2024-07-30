package br.ifpe.tap.venda.main;

import br.ifpe.tap.venda.CalculadoraDePrecos;
import br.ifpe.tap.venda.IFrete;
import br.ifpe.tap.venda.TabelaDePrecos;
import br.ifpe.tap.venda.logic.BlackFriday;
import br.ifpe.tap.venda.logic.FretePadrao;
import br.ifpe.tap.venda.logic.MercadoPago;
import br.ifpe.tap.venda.logic.TabelaDePrecosPadrao;
import br.ifpe.tap.venda.model.Compra;

public class Venda {

    public static void main(String[] args) {
        Compra guitarraFenderStrato = new Compra(3000, "Garanhuns");

        // IF Data === 30/11/2023 then
        // else
        TabelaDePrecos bf = new TabelaDePrecosPadrao();

        // IF choose == 'MercadoPago'
        IFrete correios = new MercadoPago();

        CalculadoraDePrecos cdp = new CalculadoraDePrecos(bf, correios);
        double precoFinal = cdp.calcula(guitarraFenderStrato);

        System.out.println("Preço do produto: " + guitarraFenderStrato.getValor());
        System.out.println("Preço Final: " + precoFinal);
    }
}
