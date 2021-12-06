package exceções;

public class Contato extends Agenda {

private String nome;
private String telefone;
private int identificador = 1;
 

 public Contato() {}
 
public Contato(int identificador) {
 
}

public void setNome(String nome) {
	this.nome = nome;
}
  
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
 
public void setIdentificador(int identificador) {
	this.identificador = identificador;
}

@Override
public String toString() {
	return "Contato\n"+ " Nome=" + nome + ", telefone=" + telefone + ", identificador=" + identificador;
}

 
//----------------------------------------------------------------------------------------------------------------

}
