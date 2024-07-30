package br.ifpe.tap.venda.logic;

import br.ifpe.tap.venda.IFrete;

public class MercadoPago implements IFrete {
    @Override
    public double para(String cidade) {
        if ("GARANHUNS".equals(cidade.toUpperCase())) {
            return 10;
        } else {
            return 100;
        }
    }
}
