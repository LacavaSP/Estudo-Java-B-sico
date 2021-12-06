package vetores;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Exercicio13 {
	public static double[] A = new double [10];
	public static int B = 0;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 10 números int pos para um vetor 1: ");
		for (int i = 0; i<10; i++){
			A[i] = entrada.nextDouble();
			if(A[i]%5==0){
				B++;
				
			}
			}
		System.out.print("Existem " + B + " números divisíveis por 5 no vetor 1");
		 
	}

}
