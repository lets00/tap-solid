package br.ifpe.tap.venda;


import br.ifpe.tap.venda.interfaces.Frete;
import br.ifpe.tap.venda.interfaces.TabelaDePreco;
import br.ifpe.tap.venda.model.Compra;

public class CalculadoraDePrecos {
    private TabelaDePreco tabela;
    private Frete frete;

    public CalculadoraDePrecos(TabelaDePreco tabela, Frete frete){
        this.tabela = tabela;
        this.frete = frete;
    }

    public double calcula(Compra produto) {
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = this.frete.calcula(produto.getCidade());

        return produto.getValor() * (1- desconto) + frete;
    }
}
