package CLASSES;

import java.util.Scanner;

public class teste_conversorvolume {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção de conversão:");
		System.out.println("1 --- Litros para cm³");
		System.out.println("2 --- Metros³ quad para litros");
		System.out.println("3 --- Metros³ para pés³");
		System.out.println("4 --- Galões americanos para pol³");
		System.out.println("5 --- Galões americanos para litros");
	int resp = entrada.nextInt();
	
	switch (resp) {
	case 1:
		System.out.print("Informe a qtd de litros:");
		System.out.println(conversorvolume.converterlitrocmcubico(entrada.nextDouble()));
		System.out.println(" ");
		break;
case 2:
	System.out.print("Informe a qtd de Metros³:");
	System.out.println(conversorvolume.convertermetrocubicolitros(entrada.nextDouble()));
	System.out.println(" ");
		break;
case 3:
	System.out.print("Informe a qtd de Metros³:");
	System.out.println(conversorvolume.convertermetrocubicopecubico(entrada.nextDouble()));
	System.out.println(" ");
	break;
	
case 4:
	System.out.print("Informe a qtd de Galões:");
	System.out.println(conversorvolume.convertergalaoamericanopolegada(entrada.nextDouble()));
	System.out.println(" ");
	break;
case 5:
	System.out.print("Informe a qtd de Galões:");
	System.out.println(conversorvolume.convertergalaoamericanolitro(entrada.nextDouble()));
	System.out.println(" ");
	break;

	default:
		break;
	}
}
}
