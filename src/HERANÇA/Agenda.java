
package HERANÇA;



public class Agenda {
	private contato[] contatos;
	private String nome;
	
	 
	
	public Agenda (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public contato[] getContatos() {
		return contatos;
	}
	public void setContatos(contato[] contatos) {
		this.contatos = contatos;
	}
	public void exibirinfodoscontatos() { 
		
		/*for (int i = 0; i<contatos.length;i++) {
			System.out.println(contatos[i].getEmail());
			System.out.println(contatos[i].getNomecontato());
			System.out.println(contatos[i].getNumero());
			*/
		
		for (contato item : contatos) {
			System.out.println(item.getNomecontato());
			System.out.println(item.getEmail());
			System.out.println(item.getNumero());
		}
		
			
		}
		}
	
	
