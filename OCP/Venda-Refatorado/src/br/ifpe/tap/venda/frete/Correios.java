package br.ifpe.tap.venda.frete;

import br.ifpe.tap.venda.interfaces.Frete;

public class Correios implements Frete {
    @Override
    public double calcula(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        } else {
            return 30;
        }
    }
}
