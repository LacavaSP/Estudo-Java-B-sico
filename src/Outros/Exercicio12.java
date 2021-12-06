package vetores;
import java.util.Scanner;

public class Exercicio12 {
	public static int[] A = new int[10];
	public static double soma;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 10 números int pos para um vetor 1: ");
		
		for (int i = 0; i<10; i++){
			A[i] = entrada.nextInt();
			soma +=A[i];
			}
		System.out.println(soma);
		 
			}
		
		 
	}

