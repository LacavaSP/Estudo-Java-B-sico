package CLASSES;

import java.util.Scanner;

public class teste_conversorvolume {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma op��o de convers�o:");
		System.out.println("1 --- Litros para cm�");
		System.out.println("2 --- Metros� quad para litros");
		System.out.println("3 --- Metros� para p�s�");
		System.out.println("4 --- Gal�es americanos para pol�");
		System.out.println("5 --- Gal�es americanos para litros");
	int resp = entrada.nextInt();
	
	switch (resp) {
	case 1:
		System.out.print("Informe a qtd de litros:");
		System.out.println(conversorvolume.converterlitrocmcubico(entrada.nextDouble()));
		System.out.println(" ");
		break;
case 2:
	System.out.print("Informe a qtd de Metros�:");
	System.out.println(conversorvolume.convertermetrocubicolitros(entrada.nextDouble()));
	System.out.println(" ");
		break;
case 3:
	System.out.print("Informe a qtd de Metros�:");
	System.out.println(conversorvolume.convertermetrocubicopecubico(entrada.nextDouble()));
	System.out.println(" ");
	break;
	
case 4:
	System.out.print("Informe a qtd de Gal�es:");
	System.out.println(conversorvolume.convertergalaoamericanopolegada(entrada.nextDouble()));
	System.out.println(" ");
	break;
case 5:
	System.out.print("Informe a qtd de Gal�es:");
	System.out.println(conversorvolume.convertergalaoamericanolitro(entrada.nextDouble()));
	System.out.println(" ");
	break;

	default:
		break;
	}
}
}
