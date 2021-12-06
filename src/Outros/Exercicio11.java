package vetores;
import java.util.Scanner;

public class Exercicio11 {
	public static double[] A = new double [10];
	public static int B = 0;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 10 números int pos para um vetor 1: ");
		for (int i = 0; i<10; i++){
			A[i] = entrada.nextDouble();
			if(A[i]%2==0){
				B++;
				
			}
			}
		System.out.print("Existem " + B + " números pares no vetor 1");
		 
	}

}
