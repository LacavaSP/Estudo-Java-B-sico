package HERAN�A;

public class Contabancaria {

private static String nomeCliente;
private static long numeroConta;
protected static double saldo;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public String getNomeCliente() {
	return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}
public long getNumeroConta() {
	return numeroConta;
}
public void setNumeroConta(long numeroConta) {
	this.numeroConta = numeroConta;
}
public static double  getSaldo() {
	return saldo;
}
public static void depositarSaldo(double saldo) {
	Contabancaria.saldo = saldo;
}

public static void sacarSaldo(double saque) {
	if(saldo>saque) {
	Contabancaria.saldo = saldo-saque;
}else {
	System.out.println("Imposs�vel, saque>saldo");
	Contabancaria.saldo = saldo;
}
	
	
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
@Override
public String toString() {
	return "Conta banc�ria\n" + "Nome do Titular " + getNomeCliente() + ", NumeroConta " + getNumeroConta() +  " saldo = " + getSaldo();
}


}
