package CLASSES;

import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
//------------------------------------------------------------------------------------------------------ 



public class com_ex2527_3 {
	

	public com_ex2527_3 (){}
	static Scanner entrada = new Scanner(System.in);
	private static String curso;
	private static String nome;
	public static String[] linha = new String[3];
	private static double soma_M,soma_P,soma_G;
	static double[] vetor = {soma_M,soma_P,soma_G};
//------------------------------------------------------------------------------------------------------ 
 static double[][] nota = new double[3][4];
 static int a;
//------------------------------------------------------------------------------------------------------ 	
	static void exibirnotas(){
		
		Random notas = new Random();
		for(int i=0;i<4;i++){
		double aleatorio1 = notas.nextInt(10);
			for(int j=0;j<3;j++){
				System.out.println(linha[j]);
				nota[j][i] = aleatorio1;
				System.out.println(nota[j][i]);
			}	
}
}	
	//------------------------------------------------------------------------------------------------------ 
	public void registramateria(){
		
		for(int i=0;i<linha.length;i++){
			System.out.println("Digite o nome da matéria " + (i+1));
			linha[i] = entrada.next();
		}
		exibirmaterias();
		
	}
	public void exibirmaterias(){	 
		while( a < 3){
			System.out.println("Matéria " + a + ":");
			System.out.println(linha[a]);
			a++;
		}
		exibirnotas();
	}

//------------------------------------------------------------------------------------------------------ 		
	public void exibirsitgeral(){
		
		soma_M = nota[0][0]+nota[0][1]+nota[0][2]+nota[0][3];
		soma_P = nota[1][0]+nota[1][1]+nota[1][2]+nota[1][3];
		soma_G = nota[2][0]+nota[2][1]+nota[2][2]+nota[2][3];
	
	 
		if(soma_M/4 >= 7){
			System.out.println("APROVADO EM " + linha[0]);
		} else {
			System.out.println("REPROVADO EM " + linha[0]);
		}
		if(soma_P/4 >= 7){
			System.out.println("APROVADO EM " + linha[1]);
		} else {
			System.out.println("REPROVADO EM " + linha[1]);
		}
		if(soma_G/4 >= 7){
			System.out.println("APROVADO EM " + linha[2]);
		} else {
			System.out.println("REPROVADO EM " + linha[2]);
		}
}
	public void exibirsit(int i){

		soma_M = nota[0][0]+nota[0][1]+nota[0][2]+nota[0][3];
		soma_P = nota[1][0]+nota[1][1]+nota[1][2]+nota[1][3];
		soma_G = nota[2][0]+nota[2][1]+nota[2][2]+nota[2][3];

		switch (i) {

		case 0:
	if(soma_M/4 >= 7){
		System.out.println("APROVADO EM " + linha[0]);
	} else {
		System.out.println("REPROVADO EM " + linha[0]);
	}
			break;
			
case 1:
	if(soma_P/4 >= 7){
		System.out.println("APROVADO EM " + linha[1]);
	} else {
		System.out.println("REPROVADO EM " + linha[1]);
	}
			break;
case 2:	
	
	if(soma_G/4 >= 7){
	System.out.println("APROVADO EM " + linha[2]);
} else {
	System.out.println("REPROVADO EM " + linha[2]);
}
	break;
		default:
			break;
		}
	}
	

//------------------------------------------------------------------------------------------------------ 		

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getLinha() {
		return linha;
	}
	public void setLinha(String[] linha) {
		this.linha = linha;
	}
	 
	public static double[][] getNota() {
		return nota;
	}
	public static void setNota(double[][] nota) {
		com_ex2527_3.nota = nota;
	}
		
}

//------------------------------------------------------------------------------------------------------ 		

 