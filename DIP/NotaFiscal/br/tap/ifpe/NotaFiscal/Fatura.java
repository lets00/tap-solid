package br.tap.ifpe.NotaFiscal;

public class Fatura {
    private double valorMensal;

    public Fatura (double valorMensal) {
        this.valorMensal = valorMensal;
    }
    public double geraValorMensal(){
        return valorMensal;
    }
}
