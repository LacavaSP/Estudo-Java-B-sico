package CLASSES;

import java.util.Scanner;

public class TESTE {
	public static void main(String[] args) {
		com_ex2527_3 aluno = new com_ex2527_3(); 
		com_ex2527_2 aluno2 = new com_ex2527_2();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o seu nome: ");
		aluno.setNome(entrada.next());
		aluno.registramateria();
		aluno.exibirmaterias();
		
		System.out.print("Quer ver sua sit. geral ou em uma matéria em específico? 1 para geral ou 2 para específica ");
		int resp = entrada.nextInt();
		if(resp == 1){aluno.exibirsitgeral();}else if(resp == 2){
	
			System.out.println("Digite o número da matéria que queira ver se passou: ");
			System.out.println(" 1 --- " + aluno.linha[0]);
			System.out.println(" 2 --- " + aluno.linha[1]);
			System.out.println(" 3 --- " + aluno.linha[2]);
			int z = entrada.nextInt();
			aluno.exibirsit(z - 1);
			
		}
		
		
		
		
	}

}
