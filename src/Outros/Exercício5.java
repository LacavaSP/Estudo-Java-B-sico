package vetores;
import java.util.Scanner;

public class Exercício5 {
	public static int[] A = new int [10], B = new int[10];
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 10 números int pos para um vetor: ");
		
		for (int i = 0; i<10; i++){
			A[i] = entrada.nextInt();
			B[i] = A[i]*i; 
			System.out.println(B[i]);
			}

	}

}
