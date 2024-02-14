package estruturaWhile;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numPessoasBackend = 0;
		int numMulheresFrontend = 0;
		int numHomensMobile = 0;
		int numNaoBinariosFullStack = 0;
		int totalPessoas = 0;
		int somaIdades = 0;

		char continuar = 'S';

		while (continuar == 'S' || continuar == 's') {
			System.out.println("Digite a idade do colaborador:");
			int idade = scanner.nextInt();

			System.out.println("Identidade de Gênero:");
			System.out.println("1 – Mulher Cis");
			System.out.println("2 – Homem Cis");
			System.out.println("3 – Não Binário");
			System.out.println("4 – Mulher Trans");
			System.out.println("5 – Homem Trans");
			System.out.println("6 – Outros");
			int genero = scanner.nextInt();

			System.out.println("Pessoa Desenvolvedora:");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");
			int categoria = scanner.nextInt();

			switch (categoria) {
			case 1:
				numPessoasBackend++;
				break;
			case 2:
				if (genero == 1 || genero == 4) {
					numMulheresFrontend++;
				}
				break;
			case 3:
				if ((genero == 2 || genero == 5) && idade > 40) {
					numHomensMobile++;
				}
				break;
			case 4:
				if (genero == 3 && idade < 30) {
					numNaoBinariosFullStack++;
				}
				break;
			default:
				System.out.println("Categoria inválida!");
				break;
			}

			totalPessoas++;
			somaIdades += idade;

			System.out.println("Deseja continuar? (S/N)");
			continuar = scanner.next().charAt(0);
		}

		System.out.println("Número de pessoas desenvolvedoras Backend: " + numPessoasBackend);
		System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + numMulheresFrontend);
		System.out
				.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + numHomensMobile);
		System.out.println(
				"Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + numNaoBinariosFullStack);
		System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
		System.out.println(
				"Média de idade das pessoas que responderam à pesquisa: " + (somaIdades / (double) totalPessoas));

		scanner.close();
	}

}
