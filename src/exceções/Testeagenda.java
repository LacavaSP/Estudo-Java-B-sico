package exceções;

import java.util.Scanner;


import HERANÇA.contato;

public class Testeagenda {
 static int quantidadeDeContatos; 
	public static void main(String[] args) throws ExceçõesTesteAgenda{
		 	
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
			 			throw new Exceçãonull();
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
				}else { throw new ExceçõesTesteAgenda();}
			}catch (Exceçãonull e) {
			System.out.println("Contato selecionado não existe, selecione uma opção novamente"); 
		}catch (NullPointerException e) {
			System.out.println("Agenda vazia, crie um novo contato!"); 
		}catch(ExceçõesTesteAgenda e) {
			System.out.println("CARACTERE INVALIDO"); 
		}
	if(i!=quantidadeDeContatos) {
		i=quantidadeDeContatos;
		 
	}
		
	
	
} 
	}
	}


