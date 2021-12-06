package HERANÇA;

public abstract class FiguraGeometrica {

	private int numeroDeLados;  
	private int numeroDeArestas;
	private int numerodeVertices;
	private double medidaLados;
	 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public int getNumeroDeLados() {
		return numeroDeLados;
	}
	
	public double getMedidaLados() {
		return medidaLados;
	}

	public void setMedidaLados(double medidaLados) {
		this.medidaLados = medidaLados;
	}

	public void setNumeroDeLados(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}
	public int getNumeroDeArestas() {
		return numeroDeArestas;
	}
	public void setNumeroDeArestas(int numeroDeArestas) {
		this.numeroDeArestas = numeroDeArestas;
	}
	public int getNumerodeVertices() {
		return numerodeVertices;
	}
	public void setNumerodeVertices(int numerodeVertices) {
		this.numerodeVertices = numerodeVertices;
	} 	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
 
}
