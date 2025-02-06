package lacosRepeticaoFor;

import java.util.Scanner;

public class atividadeDoWhile {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;
        int somaMultiplo = 0;
        int quantMultiplos3 = 0;

        System.out.println("Digite os números inteiros:");

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero % 3 == 0 && numero != 0) { 
                somaMultiplo += numero;
                quantMultiplos3++;
            }
        } while (numero != 0);

        if (quantMultiplos3 == 0) {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        } else {
            double media = (double) somaMultiplo / quantMultiplos3;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        }

        leia.close();
	}

}
