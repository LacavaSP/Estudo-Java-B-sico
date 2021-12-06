package vetores;

import java.util.Random;

public class tiagomelo1 {

	public static int [] vetor = new int[20];
	public static int soma;
	public static void main(String[] args) {
		
	Random aleat = new Random();
	for (int i=0;i<20;i++){
		vetor[i] = aleat.nextInt(2300);
			soma += vetor[i];
		}
		System.out.println(soma);
	}

}
