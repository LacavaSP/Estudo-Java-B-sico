package CLASSES;

import java.util.Scanner;

public class teste_conversorarea {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma op��o de convers�o:");
		System.out.println("1 --- M� para p�s�");
		System.out.println("2 --- P�s� quad para cm�");
		System.out.println("3 --- Milhas� para acres");
		System.out.println("4 --- Acres para p�s�");
		int resp = entrada.nextInt();
		
		switch (resp) {
		case 1:
			System.out.print("Informe a qtd de M�:");
			System.out.println(conversorarea.convertermetroquadpe(entrada.nextDouble()));
			System.out.println(" ");
			break;
	case 2:
		System.out.print("Informe a qtd de p�s:");
		System.out.println(conversorarea.converterpequadcentimetro(entrada.nextDouble()));
		System.out.println(" ");
			break;
	case 3:
		System.out.print("Informe a qtd de milhas�:");
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
