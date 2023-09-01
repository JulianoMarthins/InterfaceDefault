package entities;

import java.util.InvalidPropertiesFormatException;

public class TaxaImpostosBrasil {
    private Double taxa;

    public TaxaImpostosBrasil(double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxa(){
        return taxa;
    }


    public double pagamento(double valor, int mes) throws InvalidPropertiesFormatException {
        if(mes < 1){
            throw new InvalidPropertiesFormatException("Valor de parcelas inválidas ");
        }

        return valor * Math.pow(1.0 + taxa / 100, mes);
    }

}
