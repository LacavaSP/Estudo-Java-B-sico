package vetores;
import java.util.Scanner;

public class Exercício4 {
public static double[] A = new double [15], B = new double[15];

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 15 números int pos para um vetor: ");
		for (int i = 0; i<14; i++){
			A [i] = entrada.nextDouble();
			B[i] = Math.sqrt(A[i]);
			System.out.println(B[i]);
			}	
	}
}
