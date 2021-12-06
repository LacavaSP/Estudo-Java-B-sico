package HERANÇA;

public class Clindro extends Figura3D implements DimensaoVolumetrica {

	private double raio;
	private double altura;

	public void calcVolume() {
	System.out.println("Calculando seu volume...");
	volume = 3.14*raio*raio*altura;
	}

	
	@Override
	public String toString() {
		return "Clindro:\n" + "Volume cm³=" + volume;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimetroTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void calcPerimetroTotal() {
		// TODO Auto-generated method stub
		
	}

}
