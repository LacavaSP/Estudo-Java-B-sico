package vetores;
import java.util.Scanner;


public class Exercício3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] A = new int[15], B = new int[15];
Scanner entrada = new Scanner(System.in);

System.out.println("Digite 15 números int pos para um vetor: ");
for (int i = 0; i<14; i++){
	A [i] = entrada.nextInt();
	B[i] = A[i]*A[i];
	System.out.println(B[i]);
	}
	}

}
