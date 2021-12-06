package HERANÇA;

public class ContaEspecial extends Contabancaria {
private Contabancaria contabancaria;

	public static  long limiteConta;

	public void setLimiteConta(long limiteConta) {
		this.limiteConta = limiteConta;
	}
	
	public static void sacarSaldo(double saque) {
		if(limiteConta < saque ) {
		saldo = saldo-saque;
	}else {
		limiteConta = limiteConta;
	}
	
}
	public void setContabancaria(Contabancaria contabancaria) {
		this.contabancaria = contabancaria;
	}

}