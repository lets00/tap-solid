package br.tap.ifpe.NotaFiscal.main;

import br.tap.ifpe.NotaFiscal.Fatura;
import br.tap.ifpe.NotaFiscal.GeradorDeNotaFiscal;
import br.tap.ifpe.NotaFiscal.NotaFiscal;
import br.tap.ifpe.NotaFiscal.externo.EnviadorDeEmail;
import br.tap.ifpe.NotaFiscal.externo.NotaFiscalDAO;

public class NF {
    public static void main(String[] args) {
        EnviadorDeEmail gmail = new EnviadorDeEmail();
        NotaFiscalDAO postgres = new NotaFiscalDAO();

        Fatura f = new Fatura(1000);

        GeradorDeNotaFiscal gnf = new GeradorDeNotaFiscal(gmail, postgres);
        NotaFiscal nf = gnf.gera(f);
    }
}
