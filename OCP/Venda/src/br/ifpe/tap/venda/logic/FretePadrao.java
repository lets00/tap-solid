package br.ifpe.tap.venda.logic;

import br.ifpe.tap.venda.IFrete;

public class FretePadrao implements IFrete {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        } else {
            return 30;
        }
    }
}
