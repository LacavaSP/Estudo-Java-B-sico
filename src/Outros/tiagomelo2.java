package vetores;

//import java.util.Random;
import java.util.Scanner;

public class tiagomelo2 {
	public static int resp;	
	//public static int [] vetor = new int[50];
	
	
	
	public static void main(String[] args) {
		
		gerador geradore = new gerador();
		Scanner entrada = new Scanner(System.in);
			
/*Random aleat = new Random();
	for (int i=0;i<50;i++){
		vetor[i] = aleat.nextInt(2300);
		for(int p=1; p<50;p+=2){
			vetor[p] = aleat.nextInt(2300)*-1;
		}
	
		}*/
	resp = entrada.nextInt();
	if(resp == 1){
		System.out.println("a");
	geradore.aleat(new int[50], 50, "n");
	}


	}

}
