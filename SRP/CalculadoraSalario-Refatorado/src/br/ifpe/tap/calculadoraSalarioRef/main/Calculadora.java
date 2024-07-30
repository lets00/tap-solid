package br.ifpe.tap.calculadoraSalarioRef.main;

import br.ifpe.tap.calculadoraSalarioRef.model.Cargo;
import br.ifpe.tap.calculadoraSalarioRef.model.Funcionario;
import br.ifpe.tap.calculadoraSalarioRef.CalculadoraSalario;

public class Calculadora {
    public static void main(String[] args) {
        Funcionario dev = new Funcionario(Cargo.DESENVOLVEDOR, 3500);
        Funcionario dba = new Funcionario(Cargo.DBA, 3500);
        Funcionario tester = new Funcionario(Cargo.TESTER, 3500);

        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();

        System.out.println("Salário do dev bruto: " + dev.getSalarioBase());
        System.out.println("Salário do DBA bruto: " + dba.getSalarioBase());
        System.out.println("Salário do Tester bruto: " + tester.getSalarioBase());
        System.out.println("-------------------------------------------");

        System.out.println("Salário do dev liquido: " + calculadoraSalario.calcula(dev));
        System.out.println("Salário do DBA liquido: " + calculadoraSalario.calcula(dba));
        System.out.println("Salário do Tester liquido: " + calculadoraSalario.calcula(tester));



    }
}
