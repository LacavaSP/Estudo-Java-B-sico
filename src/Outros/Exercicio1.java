package vetores;

import java.util.Scanner;

public class Exercicio1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] A = new int[5], B = new int[5];
Scanner entrada = new Scanner(System.in);

System.out.println("Digite 5 números int pos para um vetor: ");
A [0] = entrada.nextInt();
A [1] = entrada.nextInt();
A [2] = entrada.nextInt();
A [3] = entrada.nextInt();
A [4] = entrada.nextInt();

for (int i = 0; i<5; i++){
	B [i] = A[i]; 
}
	}

}
