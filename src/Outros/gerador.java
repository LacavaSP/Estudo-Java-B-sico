package vetores;
import java.util.Random;
public class gerador {	
int vetor[];
int boiola;
	
public void aleat (int[] num, int limit, String res){
	
	Random aleat = new Random();
	for (int i=0;i<limit;i++){
		num[i] = aleat.nextInt(2300);
		for(int p=1; p<limit;p+=2){
			num[p] = aleat.nextInt(2300)*-1;
		}
		 
		}
	if(res == "p"){
		for(int x = 0;x<limit;x++){
			if(num[x]>0){
				System.out.println(num[x]);
			}
			
			if(res == "n"){
				for(int h = 0;h<limit;h++){
					if(num[h]<0){
						System.out.println(num[h]);
			}
		}
} 	
}
}
}
}
