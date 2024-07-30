package br.ifpe.tap.venda.logic;

public class Frete {
    public Frete(){}
    public double para(String cidade) {
        if ("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
