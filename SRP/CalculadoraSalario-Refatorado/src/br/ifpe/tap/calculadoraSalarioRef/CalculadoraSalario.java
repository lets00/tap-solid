package br.ifpe.tap.calculadoraSalarioRef;

import br.ifpe.tap.calculadoraSalarioRef.model.Cargo;
import br.ifpe.tap.calculadoraSalarioRef.model.Funcionario;

public class CalculadoraSalario {

    public CalculadoraSalario() {

    }

    public double calcula(Funcionario funcionario) {
        if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }
        if (Cargo.DBA.equals(funcionario.getCargo()) ||
                Cargo.TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVintePorcento(funcionario);
        }
        if (Cargo.DIRETOR.equals(funcionario.getCargo()) || Cargo.CHEFE.equals(funcionario.getCargo())) {
            return quarentaOuTrintaPorcento(f);
        }
        throw new RuntimeException("Funcionário de cargo inválido");
    }

    private double quinzeOuVintePorcento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.85;
        }
        return funcionario.getSalarioBase() * 0.8;
    }

    private double dezOuVintePorcento(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

    private  double quarentaOuTrintaPorcento(Funcionario f) {...}

    private  double cincoOuDezPorcento(Funcionario f) {...}
}
