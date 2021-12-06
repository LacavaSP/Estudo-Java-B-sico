package CLASSES;

import java.util.Scanner;

public class teste_conversorhorario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção de conversão:");
		System.out.println("1 --- minutos para segs");
		System.out.println("2 --- horas quad para mins");
		System.out.println("3 --- dias para horas");
		System.out.println("4 --- meses  para dias");
		System.out.println("5 --- anos para dias");
		System.out.println("6 --- semanas para dias");
	int resp = entrada.nextInt();
	
	switch (resp) {
	case 1:
		System.out.print("Informe a qtd de minutos:");
		System.out.println(conversorhorario.converterminutosegundo(entrada.nextDouble()));
		System.out.println(" ");
		break;
case 2:
	System.out.print("Informe a qtd de horas:");
	System.out.println(conversorhorario.converterhoraminuto(entrada.nextDouble()));
	System.out.println(" ");
		break;
case 3:
	System.out.print("Informe a qtd de dias:");
	System.out.println(conversorhorario.converterdiahoras(entrada.nextDouble()));
	System.out.println(" ");
	break;
	
case 4:
	System.out.print("Informe a qtd de meses:");
	System.out.println(conversorhorario.convertermesdias(entrada.nextDouble()));
	System.out.println(" ");
	break;
case 5:
	System.out.print("Informe a qtd de anos:");
	System.out.println(conversorhorario.converteranodias(entrada.nextDouble()));
	System.out.println(" ");
	break;
case 6:
	System.out.print("Informe a qtd de semanas:");
	System.out.println(conversorhorario.convertersemanadias(entrada.nextDouble()));
	System.out.println(" ");
	break;

	default:
		break;
	}
	}

}
