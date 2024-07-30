package br.ifpe.tap.venda.logic;

import br.ifpe.tap.venda.TabelaDePrecos;

public class BlackFriday implements TabelaDePrecos {
    @Override
    public double desconto(double valor) {
        return 0.5;
    }
}
