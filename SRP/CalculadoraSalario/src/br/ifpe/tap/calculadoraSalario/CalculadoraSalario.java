package br.ifpe.tap.calculadoraSalario;

import br.ifpe.tap.calculadoraSalario.model.Cargo;
import br.ifpe.tap.calculadoraSalario.model.Funcionario;

public class CalculadoraSalario {

    public CalculadoraSalario() {
    }

    public double calcula(Funcionario funcionario) {
        return funcionario.getCargo().getRegra().calcula(funcionario.getSalarioBase());
    }
}
