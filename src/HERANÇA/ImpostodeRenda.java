package HERANÇA;

public class ImpostodeRenda {

	private double impostoDeRenda;
	private PessoaFisica[] pessoa;
	private PessoaJuridica[] juridica;
	protected double renda;
	
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void setPessoa(PessoaFisica[] pessoa) {
		this.pessoa = pessoa;
	}
 
	public void setJuridica(PessoaJuridica[] juridica) {
		this.juridica = juridica;
	}

	public double mostrarImpostoDeRenda() {
		return impostoDeRenda;
	}

	public void calcularImpostoDeRenda(double renda) {
		this.impostoDeRenda = renda;
	}
	
 //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public void exibirImpostoPJ() {
	for (int i=0;i<3;i++) {
	 
		juridica[i].calcularImpostoDeRenda();
		System.out.println("Imposto de Renda da Pessoa Jurídica " +(1+i)+": "+ juridica[i].mostrarImpostoDeRenda());

	}
}
	public void exibirImpostoPF() {
		
		for (int i=0;i<3;i++) {
			 
			System.out.print("Imposto de Renda da Pessoa Física " + (1+i)+": ");
			pessoa[i].mostrarImpostoDeRendas();
			 
		}
}
}
