package exce��es;

import java.util.Scanner;


import HERAN�A.contato;

public class Testeagenda {
 static int quantidadeDeContatos; 
	public static void main(String[] args) throws Exce��esTesteAgenda{
		 	
		Contato[] novoContato = new Contato[50];
		Agenda agenda = new Agenda();
		Scanner entrada = new Scanner(System.in);
	
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		for(int i=1;i<51;i++) {
		String resp = null;
		System.out.println("Digite 1 para consultar sua agenda;\n" + "Digite 2 para adicionar um contato;");
		resp = entrada.next(); 
		try {
				if(resp.equals("1")) {
					System.out.println("Insira o index o contato");	
					int z = entrada.nextInt();
					agenda.exibirContato(z);
			 		
			 		if (novoContato[z]==null) {
			 			throw new Exce��onull();
			 		}
				}else if(resp.equals("2")) {
					Contato c = new Contato(i);
					quantidadeDeContatos++;
					System.out.println("Digite o nome do contato: ");	
					c.setNome(entrada.next());
					System.out.println("Digite o telefone do contato: ");
					c.setTelefone(entrada.next());
					novoContato[i] = c;	
					agenda.adicionarContato(novoContato);
				}else { throw new Exce��esTesteAgenda();}
			}catch (Exce��onull e) {
			System.out.println("Contato selecionado n�o existe, selecione uma op��o novamente"); 
		}catch (NullPointerException e) {
			System.out.println("Agenda vazia, crie um novo contato!"); 
		}catch(Exce��esTesteAgenda e) {
			System.out.println("CARACTERE INVALIDO"); 
		}
	if(i!=quantidadeDeContatos) {
		i=quantidadeDeContatos;
		 
	}
		
	
	
} 
	}
	}


