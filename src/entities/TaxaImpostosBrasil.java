package entities;

import utilitarios.ServicoImposto;

import java.util.InvalidPropertiesFormatException;

public class TaxaImpostosBrasil implements ServicoImposto {
    private Double taxa;

    public TaxaImpostosBrasil(double taxa) {
        this.taxa = taxa;
    }


    @Override
    public double getTaxa() {
        return this.taxa;
    }


}
