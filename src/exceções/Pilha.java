package exceções;

 
public class  Pilha{

	private Object [] elementos;
	private Object topo;
	private int i = 0;
	
public Pilha(int a) {
	elementos = new String[a];
}

public void push(String elemento) {
 if(!isFull()){
	topo = elemento;
	elementos[i] = elemento;
	System.out.println(elementos[i]);
	i+=1;
 }else {
	 throw new RuntimeException("Stack Overflow");
 }
	 }

public void pop() {
	if(!isEmpty()) {
	 elementos[(i-1)] = null;
	 topo = elementos[(i-2)];
	 i-=1;
	}else {
		throw new RuntimeException("Empty Stack!");
	}
}

public Object  top() {
	if(!isEmpty()) {
	return topo;
	}else {
		throw new RuntimeException("Empty Stack!");
	}
}

public boolean isEmpty() {
	return elementos[0]!=null?false:true;
}

public boolean isFull() {
	int aux = elementos.length-1;
	if(elementos[aux] != null) { return true; }else{ return false;}
}
}