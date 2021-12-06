package vetores;
import java.util.Scanner;

public class Exercicio10 {
	public static double[] A = new double [10], B = new double[10];
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 10 números int pos para um vetor 1: ");
		for (int i = 0; i<10; i++){
			A[i] = entrada.nextInt();
			B[i]= A[i]%2;
			System.out.println(B[i]);
			}
	}

}
