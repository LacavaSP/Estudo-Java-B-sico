package vetores;
import java.util.Scanner;

public class Exercicio2 {

	public static int [] A = new int [8], B = new int [8];
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 8 números int pos para um vetor: ");
		A [0] = entrada.nextInt();
		A [1] = entrada.nextInt();
		A [2] = entrada.nextInt();
		A [3] = entrada.nextInt();
		A [4] = entrada.nextInt();
		A [5] = entrada.nextInt();
		A [6] = entrada.nextInt();
		A [7] = entrada.nextInt();
		for (int i = 0; i<8; i++){
			B [i] = A[i]*2; 
			System.out.println(B[i]);
	}
	}
}

