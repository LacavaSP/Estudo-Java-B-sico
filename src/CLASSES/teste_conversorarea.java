package CLASSES;

import java.util.Scanner;

public class teste_conversorarea {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção de conversão:");
		System.out.println("1 --- M² para pés²");
		System.out.println("2 --- Pés² quad para cm²");
		System.out.println("3 --- Milhas² para acres");
		System.out.println("4 --- Acres para pés²");
		int resp = entrada.nextInt();
		
		switch (resp) {
		case 1:
			System.out.print("Informe a qtd de M²:");
			System.out.println(conversorarea.convertermetroquadpe(entrada.nextDouble()));
			System.out.println(" ");
			break;
	case 2:
		System.out.print("Informe a qtd de pés:");
		System.out.println(conversorarea.converterpequadcentimetro(entrada.nextDouble()));
		System.out.println(" ");
			break;
	case 3:
		System.out.print("Informe a qtd de milhas²:");
		System.out.println(conversorarea.convertermilhaquadacre(entrada.nextDouble()));
		System.out.println(" ");
		break;
		
	case 4:
		System.out.print("Informe a qtd de acres:");
		System.out.println(conversorarea.converteracrepequad(entrada.nextDouble()));
		System.out.println(" ");
		break;

		default:
			break;
		}
	}

}
