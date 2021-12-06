package HERANÇA;
public class PessoaJuridica extends ImpostodeRenda {

	private static final double TAXA_IMPOSTO_PJ = 0.1;
	private double rendaempresa;
	private double impostoDeRenda;

	public double mostrarRendaempresa() {
		return rendaempresa;
	}
	public void definirRendaempresa(double rendaempresa) {
		this.rendaempresa = rendaempresa;
	}
	
	public void calcularImpostoDeRenda() {
	 
		impostoDeRenda = rendaempresa * TAXA_IMPOSTO_PJ;
	}
	public double mostrarImpostoDeRenda() {
		return impostoDeRenda;
	}
}
