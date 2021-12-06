package HERANÇA;

public class Cubo extends Figura3D implements DimensaoVolumetrica {

	private double diagonal;
	
	public void calcVolume() {
		System.out.println("Calculando seu volume...");
		volume = Math.pow(getMedidaLados(), 3);
	}

	public double getVolume() {
		return volume;
	}

	public void calcDiagonal() {
		
		System.out.println("Calculando sua diagonal...");
		diagonal = getMedidaLados()*Math.sqrt(3);
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

	@Override
	public String toString() {
		return "Cubo:\n" + "Diagonal cm=" + diagonal + ", volume cm³=" + volume;
	}

}
