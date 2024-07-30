package br.ifpe.tap.venda;


import br.ifpe.tap.venda.logic.Frete;
import br.ifpe.tap.venda.logic.TabelaDePrecosPadrao;
import br.ifpe.tap.venda.model.Compra;

public class CalculadoraDePrecos {

    private TabelaDePrecosPadrao tabela;
    private Frete frete;

    public CalculadoraDePrecos() {}

    public double calcula(Compra produto) {
        TabelaDePrecosPadrao tabela = new TabelaDePrecosPadrao();
        Frete correios = new Frete();

        double desconto = tabela.desconto(produto.getValor());
        double frete = correios.para(produto.getCidade());

        return produto.getValor() * (1- desconto) + frete;
    }
}
