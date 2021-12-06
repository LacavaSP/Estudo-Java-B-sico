package HERANÇA;

public class PessoaFisica extends ImpostodeRenda {
private double ImpostodeRenda;
	double[][] rendapf = new double[5][3];
	

 
	public void setRenda(double renda) {
		super.renda = renda;
	
	}


	public void mostrarImpostoDeRendas() {

		//PARCELAS A DEDUZIR:		
		rendapf[0][2] = 0;
		rendapf[1][2] = 100;
		rendapf[2][2] = 270;
		rendapf[3][2] = 500;
		rendapf[4][2] = 700;
//ALÍQUOTA:	
		rendapf[0][1] = 0;
		rendapf[1][1] = 0.1;
		rendapf[2][1] = 0.15;
		rendapf[3][1] = 0.25;
		rendapf[4][1] = 0.3;
//RENDA BRUTA:
		rendapf[0][0] = 1400;
		rendapf[1][0] = 2100;
		rendapf[2][0] = 2800;
		rendapf[3][0] = 3600;
		rendapf[4][0] = 3600.1;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	------------------------------------------------------------------------------------------------------	------------------------------------------------------------------------------------------------------	------------------------------------------------------------------------------------------------------	------------------------------------------------------------------------------------------------------	------------------------------------------------------------------------------------------------------	------------------------------------------------------------------------------------------------------	------------------------------------------------------------------------------------------------------		
		if(renda <= rendapf[4][0] && renda > rendapf[3][0] || renda > rendapf[4][0]  ) {
			ImpostodeRenda =  (renda*rendapf[4][1]) - rendapf[4][2];
	
		}else if(renda <= rendapf[3][0] && renda > rendapf[2][0]) {
			ImpostodeRenda =  (renda*rendapf[3][1]) - rendapf[3][2];
			
			}else if(renda <= rendapf[2][0] && renda > rendapf[1][0] ) {
			ImpostodeRenda =  (renda*rendapf[2][1]) - rendapf[2][2];
		
			}else if(renda <= rendapf[1][0] && renda > rendapf[0][0]){
				ImpostodeRenda =  (renda*rendapf[1][1]) - rendapf[1][2];
			
			}else if(renda <= rendapf[0][0]) {ImpostodeRenda = 0; }
		 System.out.print(" " + ImpostodeRenda + "\n");
		}

}

		 
 
	
		
	
