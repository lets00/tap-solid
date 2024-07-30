package br.ifpe.tap.calculadoraSalario.main;

import br.ifpe.tap.calculadoraSalario.CalculadoraSalario;
import br.ifpe.tap.calculadoraSalario.model.Cargo;
import br.ifpe.tap.calculadoraSalario.model.Funcionario;

public class Calculadora {
    public static void main(String[] args) {
        Funcionario funcionarioDesenvolvedor = new Funcionario(Cargo.DESENVOLVEDOR, 3500);
        Funcionario funcionarioTester = new Funcionario(Cargo.TESTER, 3500);
        Funcionario funcionarioDBA = new Funcionario(Cargo.DBA, 3500);

        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();

        System.out.println("Salario do funcionario dev: " + funcionarioDesenvolvedor.getSalarioBase());
        System.out.println("Salario do funcionario tester: " + funcionarioTester.getSalarioBase());
        System.out.println("Salario do funcionario DBA: " + funcionarioDBA.getSalarioBase());

        System.out.println("Salario do funcionario dev liquido: " + calculadoraSalario.calcula(funcionarioDesenvolvedor));
        System.out.println("Salario do funcionario tester liquido: " + calculadoraSalario.calcula(funcionarioTester));
        System.out.println("Salario do funcionario DBA liquido: " + calculadoraSalario.calcula(funcionarioDBA));




    }
}
