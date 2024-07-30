package br.ifpe.tap.calculadoraSalario.regrasDeCalculo;

import br.ifpe.tap.calculadoraSalario.interfaces.RegraDeCalculo;
import br.ifpe.tap.calculadoraSalario.model.Funcionario;

public class QuinzeOuVintePorcento implements RegraDeCalculo {
    public double calcula(double salarioBase) {
        if (salarioBase > 3000.0) {
            return salarioBase * 0.85;
        }
        return salarioBase * 0.9;
    }
}
