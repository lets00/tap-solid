package br.ifpe.tap.calculadoraSalario.model;

import br.ifpe.tap.calculadoraSalario.interfaces.RegraDeCalculo;
import br.ifpe.tap.calculadoraSalario.regrasDeCalculo.DezOuVintePorcento;
import br.ifpe.tap.calculadoraSalario.regrasDeCalculo.QuinzeOuVintePorcento;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVintePorcento()),
    TESTER(new QuinzeOuVintePorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
