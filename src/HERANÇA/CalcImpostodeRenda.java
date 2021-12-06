package HERANÇA;

import java.util.Scanner;

public class CalcImpostodeRenda {

	public static void main(String[] args) {
	PessoaFisica[] pessoa = new PessoaFisica[3];
	PessoaJuridica[] juridica = new PessoaJuridica[3];
    ImpostodeRenda imposto = new ImpostodeRenda(); 
	Scanner entrada = new Scanner(System.in);
 
	
	for(int i=0; i<3;i++) {
		PessoaFisica pes = new PessoaFisica();
		PessoaJuridica jur= new PessoaJuridica();
		System.out.println("Inserir renda da pessoa física " + (1+i));
	 pes.setRenda(entrada.nextDouble());
	 System.out.println("Inserir renda da pessoa jurídica " + (1+i));
	 jur.definirRendaempresa(entrada.nextDouble());
	pessoa[i]=pes;
	juridica[i]=jur;
	}
	 
	imposto.setPessoa(pessoa);
	imposto.setJuridica(juridica);
	imposto.exibirImpostoPJ();
	imposto.exibirImpostoPF();

}
	
}
