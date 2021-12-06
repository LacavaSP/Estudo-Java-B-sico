package vetores;
import java.util.Scanner;

public class Exercicio6 {
	public static int[] A = new int [10], B = new int[10], C = new int[10];
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 10 números int pos para um vetor 1: ");
		for (int i = 0; i<10; i++){
			A[i] = entrada.nextInt();
			}
		System.out.println("Digite 10 números int pos para um vetor 2: ");
		for (int P = 0; P<10; P++){
			B[P] = entrada.nextInt();
			C[P] = A[P]+B[P];
			System.out.println(C[P]);
			}
	}

}
