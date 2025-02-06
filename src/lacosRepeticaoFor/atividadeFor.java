package lacosRepeticaoFor;

import java.util.Scanner;

public class atividadeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
        Scanner leia = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite o " + i + "º número: ");
            numero = leia.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        leia.close();
    }
}

