package HERANÇA;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

System.out.println("Quer abrir uma nova conta bancária? S para sim e N para não");
String resp = entrada.next();
if(resp.equals("S") || resp.equals("s") ) {
	Contabancaria contabanco = new Contabancaria();
	ContaPoupanca poupanca = new ContaPoupanca();
	ContaEspecial especial = new ContaEspecial();	
	
	System.out.println("Insira o nome do Titular:");
	contabanco.setNomeCliente(entrada.next());
	System.out.println("Insira o número da conta:");
	contabanco.setNumeroConta(entrada.nextLong());
	System.out.println("Insira o valor que queira depositar:");
	contabanco.depositarSaldo(entrada.nextLong());
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 	
	
	System.out.println("Deseja sacar da sua conta bancária? 1 para sim e 2 para não");
	int resp2 = entrada.nextInt();
	if(resp2 == 1) {
		System.out.println("Digite o valor a ser sacado:");
		contabanco.sacarSaldo(entrada.nextDouble());
	}
	

poupanca.setContabancaria(contabanco);
especial.setContabancaria(contabanco);
poupanca.calcularNovoSaldo();

System.out.println("Atenção! Seu rendimento na poupança fora somado ao saldo, exibindo dados atualizados da conta:");
System.out.println(contabanco);
	}
	}
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 