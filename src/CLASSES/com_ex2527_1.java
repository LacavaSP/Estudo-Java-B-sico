//------------------------------------------------------------------------------------------------------
package CLASSES;

public class com_ex2527_1 {

	
private static boolean estado = false;
private String E27;
private String especial;
private String marca;
private String tipo;
private String tipoluz;
private double tensao;
private double potencia;
private double preço;


//------------------------------------------------------------------------------------------------------ 
public com_ex2527_1() {}

public com_ex2527_1(String e27, String especial, String marca, String tipo,
		String tipoluz, double tensao, double potencia, double preço) {
	this.E27 = e27;
	this.especial = especial;
	this.marca = marca;
	this.tipo = tipo;
	this.tipoluz = tipoluz;
	this.tensao = tensao;
	this.potencia = potencia;
	this.preço = preço;
	System.out.println("Método com todos parâmetros");
	
}

public com_ex2527_1(double potencia, double preço) {
	this.potencia = potencia;
	this.preço = preço;
	System.out.println("Método de 2 parâmetros chamado");
}

public com_ex2527_1(double potencia, double preço, double tensao) {
	this.potencia = potencia;
	this.preço = preço;
	this.tensao = tensao;
	System.out.println("Método de 3 parâmetros chamado");
}
//------------------------------------------------------------------------------------------------------ 
public void ligalâmpada(){
	estado = true;
	System.out.println("Lâmpada ligada!");
}
public void desligalâmpada(){
	if(estado = false){
		System.out.println("Lâmpada já está desligada!");
	}else{
		System.out.println("Lâmpada está desligada!");
	}	
}
//------------------------------------------------------------------------------------------------------
public static boolean isEstado() {
	return estado;
}
public static void setEstado(boolean estado) {
	com_ex2527_1.estado = estado;
}
public String getE27() {
	return E27;
}
public void setE27(String e27) {
	E27 = e27;
}
public String getEspecial() {
	return especial;
}
public void setEspecial(String especial) {
	this.especial = especial;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getTipoluz() {
	return tipoluz;
}
public void setTipoluz(String tipoluz) {
	this.tipoluz = tipoluz;
}
public double getTensao() {
	return tensao;
}
public void setTensao(double tensao) {
	this.tensao = tensao;
}
public double getPotencia() {
	return potencia;
}
public void setPotencia(double potencia) {
	this.potencia = potencia;
}
public double getPreço() {
	return preço;
}
public void setPreço(double preço) {
	this.preço = preço;
}
}
//------------------------------------------------------------------------------------------------------