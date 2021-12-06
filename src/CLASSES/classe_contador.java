package CLASSES;

public class classe_contador {

	private static int numero;
	private static int incremento;
	private static int aux;
	
	public classe_contador(int numero, int incremento) {
		this.numero = numero;
		this.incremento = incremento;
		numero +=incremento;
		aux = numero;
		System.out.println("Classe instanciada com sucesso");
		System.out.println(" ");
	}

	public int incrementar(int i) {
		incremento = i;
		aux += incremento;
		numero = aux;
		return numero;
	}
	public  void exibir() {
		System.out.println(numero +" "+incremento);
	
}
	public  void zerarcontador() {
		numero = 0;
		incremento = 0;
	}
}