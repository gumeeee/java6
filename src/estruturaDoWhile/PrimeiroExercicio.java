package estruturaDoWhile;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int somaMultiplosDeTres = 0;
		int countMultiplosDeTres = 0;
		int numero;

		do {
			System.out.println("Digite um número inteiro (ou 0 para sair):");
			numero = scanner.nextInt();

			if (numero != 0 && numero % 3 == 0) {
				somaMultiplosDeTres += numero;
				countMultiplosDeTres++;
			}

		} while (numero != 0);

		if (countMultiplosDeTres == 0) {
			System.out.println("Nenhum número múltiplo de 3 foi digitado.");
		} else {
			double media = somaMultiplosDeTres / (double) countMultiplosDeTres;
			System.out.println("A média dos números múltiplos de 3 digitados é: " + media);
		}

		scanner.close();
	}

}
