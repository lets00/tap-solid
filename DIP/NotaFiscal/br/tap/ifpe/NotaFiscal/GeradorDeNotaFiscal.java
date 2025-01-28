package br.tap.ifpe.NotaFiscal;

import br.tap.ifpe.NotaFiscal.externo.EnviadorDeEmail;
import br.tap.ifpe.NotaFiscal.externo.NotaFiscalDAO;

public class GeradorDeNotaFiscal {
    private final EnviadorDeEmail email;
    private final NotaFiscalDAO dao;

    public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDAO dao) {
        this.email = email;
        this.dao = dao;
    }

    public NotaFiscal gera(Fatura f) {
        double valor = f.geraValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, imposto(valor));
        email.enviaEmail(nf);
        dao.persiste(nf);
        return nf;
    }

    private double imposto(double valor) {
        return valor * 0.06;
    }
}
