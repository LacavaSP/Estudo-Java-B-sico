package exce��es;

public class Agenda {

Contato[] contato;

public Contato[] getContato() {
	return contato;
}

public void adicionarContato(Contato[] contato) {
	this.contato = contato;
}
public void exibirContato(int i) {
	try {
	int a = 0;
a+=i;
System.out.println(contato[a]);

if(contato[a] == null) {
	throw new Exce��esTesteAgenda();

}
}catch (Exce��esTesteAgenda e) {
	System.out.println("CONTATO INEXISTENTE"); 
	}
}
}