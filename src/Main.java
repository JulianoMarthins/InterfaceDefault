import entities.TaxaImpostosBrasil;
import entities.TaxaImpostosUsa;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidPropertiesFormatException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.print("Quantidade de messes: ");
        int mes = sc.nextInt();

        TaxaImpostosBrasil taxaBr = new TaxaImpostosBrasil(2.0);

        System.out.println();
        System.out.println("Financiamento no Brasil: ");
        System.out.println();

        System.out.println("Pagamento em " + mes + " parcelas: ");
        System.out.printf("Valor mensal R$ %.2f\n", taxaBr.pagamento(valor, mes) / mes);
        System.out.printf("R$ %.2f", taxaBr.pagamento(valor, mes));

        TaxaImpostosUsa taxaUsa = new TaxaImpostosUsa(1.0);

        System.out.println();
        System.out.println("\nFinanciamento no USA: ");
        System.out.println();

        try {
            System.out.println("Pagamento em " + mes + " parcelas: ");
            System.out.printf("Valor mensal R$ %.2f\n", taxaUsa.pagamento(valor, mes) / mes);
            System.out.printf("$ %.2f ", taxaUsa.pagamento(valor, mes));
        } catch (InvalidPropertiesFormatException e){
            System.out.println("Error => " + e.getMessage());
        }


        sc.close();
    }
}