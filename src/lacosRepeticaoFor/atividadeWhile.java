package lacosRepeticaoFor;

import java.util.Scanner;

public class atividadeWhile {

	public static void main(String[] args) {
		// 
        Scanner leia = new Scanner(System.in);
        
        int idade;
        int Menores21 = 0;
        int Maiores50 = 0;

        while (true) {
            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();

            if (idade < 0) {
                break; 
            }

            if (idade < 21) {
                Menores21++;
            } else if (idade > 50) {
                Maiores50++;
            }
        }

        System.out.println("\nTotal de pessoas menores de 21 anos: " + Menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + Maiores50);

        leia.close();
	}

}
