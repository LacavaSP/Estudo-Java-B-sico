package HERAN�A;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

System.out.println("Quer abrir uma nova conta banc�ria? S para sim e N para n�o");
String resp = entrada.next();
if(resp.equals("S") || resp.equals("s") ) {
	Contabancaria contabanco = new Contabancaria();
	ContaPoupanca poupanca = new ContaPoupanca();
	ContaEspecial especial = new ContaEspecial();	
	
	System.out.println("Insira o nome do Titular:");
	contabanco.setNomeCliente(entrada.next());
	System.out.println("Insira o n�mero da conta:");
	contabanco.setNumeroConta(entrada.nextLong());
	System.out.println("Insira o valor que queira depositar:");
	contabanco.depositarSaldo(entrada.nextLong());
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 	
	
	System.out.println("Deseja sacar da sua conta banc�ria? 1 para sim e 2 para n�o");
	int resp2 = entrada.nextInt();
	if(resp2 == 1) {
		System.out.println("Digite o valor a ser sacado:");
		contabanco.sacarSaldo(entrada.nextDouble());
	}
	

poupanca.setContabancaria(contabanco);
especial.setContabancaria(contabanco);
poupanca.calcularNovoSaldo();

System.out.println("Aten��o! Seu rendimento na poupan�a fora somado ao saldo, exibindo dados atualizados da conta:");
System.out.println(contabanco);
	}
	}
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 