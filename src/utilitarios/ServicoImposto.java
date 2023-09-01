package utilitarios;

import java.util.InvalidPropertiesFormatException;

public interface ServicoImposto {

    public double getTaxa();

    default double pagamento(double valor, int mes) throws InvalidPropertiesFormatException {
        if (mes < 1) {
            throw new InvalidPropertiesFormatException("Valor de parcelas inválidas ");
        }

        return valor * Math.pow(1.0 + getTaxa() / 100, mes);
    }

}

