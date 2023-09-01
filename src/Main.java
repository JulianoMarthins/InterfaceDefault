import entities.TaxaImpostosBrasil;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.print("Quantidade de messes: ");
        int mes = sc.nextInt();

        TaxaImpostosBrasil taxaBr = new TaxaImpostosBrasil(2.0);

        try {
            System.out.println("Pagamento em " + mes + " parcelas: ");
            System.out.printf("Valor mensal R$ %.2f\n", taxaBr.pagamento(valor, mes) / mes);
            System.out.printf("%.2f", taxaBr.pagamento(valor, mes));
        } catch (InvalidPropertiesFormatException e){
            System.out.println("Error => " + e.getMessage());
        }
        sc.close();
    }
}