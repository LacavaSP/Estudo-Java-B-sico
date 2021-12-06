package HERANÇA;

public class Pirâmide extends Figura3D implements DimensaoVolumetrica {
private double altura;
private double areadabase;
public void calcAltura() {
	System.out.println("Calculando sua altura...");
	altura = getMedidaLados()*(Math.sqrt(2)/2);
}

public void calcAreadabase() { areadabase=getMedidaLados()*getMedidaLados();}
public void calcVolume() {
	System.out.println("Calculando seu volume...");
	volume = (areadabase*altura)/3;
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

@Override
public String toString() {
	return "Pirâmide:\n" + "Altura cm=" + altura + ", volume cm³=" + volume;
}


}
