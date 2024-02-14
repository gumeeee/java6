package estruturaFor;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Digite o segundo número:");
		int segundoNumero = scanner.nextInt();

		if (primeiroNumero >= segundoNumero) {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
			System.exit(0); // Sair do programa
		}

		System.out.println("Os múltiplos de 3 e 5 no intervalo [" + primeiroNumero + ", " + segundoNumero + "] são:");

		for (int i = primeiroNumero; i <= segundoNumero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}

}
