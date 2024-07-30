package br.ifpe.tap.venda;

import br.ifpe.tap.venda.logic.FretePadrao;
import br.ifpe.tap.venda.logic.TabelaDePrecosPadrao;
import br.ifpe.tap.venda.model.Compra;

public class CalculadoraDePrecos {

    private TabelaDePrecos tabela;
    private IFrete frete;

    public CalculadoraDePrecos(TabelaDePrecos tabela, IFrete frete) {
        this.tabela = tabela;
        this.frete = frete;
    }

    public double calcula(Compra produto) {
        double desconto = tabela.desconto(produto.getValor());
        double frete = this.frete.para(produto.getCidade());

        return produto.getValor() * (1- desconto) + frete;
    }
}
