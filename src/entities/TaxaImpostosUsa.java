package entities;

import utilitarios.ServicoImposto;

import java.util.InvalidPropertiesFormatException;

public class TaxaImpostosUsa implements ServicoImposto {
    private Double taxa;


    public TaxaImpostosUsa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getTaxa() {
        return this.taxa;
    }


}



