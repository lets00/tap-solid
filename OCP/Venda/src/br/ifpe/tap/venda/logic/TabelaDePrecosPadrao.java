package br.ifpe.tap.venda.logic;

import br.ifpe.tap.venda.TabelaDePrecos;

public class TabelaDePrecosPadrao implements TabelaDePrecos {
    public double desconto(double valor) {
        if (valor > 5000) return 0.03;
        if (valor > 1000) return 0.05;
        return 0;
    }
}
