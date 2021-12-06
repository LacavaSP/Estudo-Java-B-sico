package CLASSES;

public class com_ex2527_2 {

	private long saldo;
	private long numero;
	private boolean chequeespecial;
	private boolean pessoaespecial;
	private long limite;
	

	
 
public com_ex2527_2() {}


public com_ex2527_2(long saldo, long numero, boolean chequeespecial,
		boolean pessoaespecial, long limite) {
	this.saldo = saldo;
	this.numero = numero;
	this.chequeespecial = chequeespecial;
	this.pessoaespecial = pessoaespecial;
	this.limite = limite;
	System.out.println("Método com todos parâmetros");
}

public com_ex2527_2(long saldo, long numero) {
	this.saldo = saldo;
	this.numero = numero;
	System.out.println("Método de 2 parâmetros");
}
public void testarinfo(){
	
	if(chequeespecial){
		System.out.println("Cheque especial presente");
	}else{
		System.out.println("Cheque especial ausente");
	}
	if(pessoaespecial){
		System.out.println("É um portador de necessidades especiais");
	}else{
		System.out.println("Não é um portador de necessidades especiais");
	}
}
public long realizarsaque (long saque){
		
		long subt = saldo - saque;
		
		if(saque < saldo){
			saldo = subt;
			System.out.println("Saque realizado com sucesso");
		}
		
		if(saque > saldo){
			System.out.println("Saque não pode ser realizado");
		}
		
		return subt;
	} 
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------












//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public long getSaldo() {
	return saldo;
}
public void setSaldo(long saldo) {
	this.saldo = saldo;
}
public long getNumero() {
	return numero;
}
public void setNumero(long numero) {
	this.numero = numero;
}
public boolean isChequeespecial() {
	return chequeespecial;
}
public void setChequeespecial(boolean chequeespecial) {
	this.chequeespecial = chequeespecial;
}
public boolean isPessoaespecial() {
	return pessoaespecial;
}
public void setPessoaespecial(boolean pessoaespecial) {
	this.pessoaespecial = pessoaespecial;
}
public long getLimite() {
	return limite;
}
public void setLimite(long limite) {
	this.limite = limite;
}


}
