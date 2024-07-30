package br.ifpe.tap.venda.frete;

import br.ifpe.tap.venda.interfaces.Frete;

public class Loggi implements Frete {

    @Override
    public double calcula(String cidade) {
        if("GARANHUNS".equals(cidade.toUpperCase())) {
            return 15;
        } else {
            return 100;
        }
    }
}
