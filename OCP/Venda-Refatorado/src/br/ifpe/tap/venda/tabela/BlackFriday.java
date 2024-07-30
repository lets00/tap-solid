package br.ifpe.tap.venda.tabela;

import br.ifpe.tap.venda.interfaces.TabelaDePreco;

public class BlackFriday implements TabelaDePreco {
    @Override
    public double descontoPara(double valor) {
        return 0.5;
    }
}
