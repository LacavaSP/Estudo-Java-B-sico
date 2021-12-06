package HERANÇA;

import java.util.Scanner;

public class teste_agenda {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Insira o nome da agenda: ");
    Agenda agenda = new Agenda(entrada.next());
    System.out.print(" ");
   
  contato[] contatos = new contato[3];
  
  
  for(int i=0;i<3;i++) {
    	contato c = new contato();
    	System.out.println("Insira o nome do contato: ");
    	String nome = entrada.next();
    	c.setNomecontato(nome);
    	
    	System.out.println("Insira o email do contato: ");
    	String email = entrada.next(); 
    	c.setEmail(email);
    	
    	 System.out.println("Insira o numero do contato: ");
    	 String numero = entrada.next();
    	 c.setNumero(numero);
    	 contatos[i] = c;
    }
    agenda.setContatos(contatos);
   agenda.exibirinfodoscontatos();
	}
}