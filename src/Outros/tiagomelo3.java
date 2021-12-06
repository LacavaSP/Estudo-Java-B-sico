package vetores;

import java.util.Scanner;

public class tiagomelo3 {

	public static int[] array = new int [5];
	public static int resp;
	public static boolean teste;
	public static void main(String[] args) {


	Scanner entrada = new Scanner(System.in);	
	System.out.println("Digite os elementos do vetor [5]");
	for (int i=0;i<5;i++){
	array[i]=entrada.nextInt();	
	System.out.println("Contabilizado");
	}
	
	System.out.print("Digite um valor para ser verificado: ");
	resp = entrada.nextInt();
	
	for(int n=0;n<5;n++){	
	if(array[n] == resp){
		teste = true;
	}
		}
	if (teste){
		System.out.print(" O valor consta no vetor ");
	}else{
		System.out.print(" O valor não consta no vetor ");
	}
	}
}
