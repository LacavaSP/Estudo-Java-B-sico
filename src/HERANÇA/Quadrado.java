package HERANÇA;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

private double diagonal;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
public void calcDiagonal(){
	System.out.println("Calculando sua diagonal...");
	diagonal = 2*getMedidaLados();
}

public void calcArea() {
	System.out.println("Calculando sua área...");
	area = getMedidaLados()*getMedidaLados();
}

public double getDiagonal() {
	return diagonal;
}

public double getArea() {
	return area;
	
}

@Override
public String toString() {
	return "Quadrado\n" + "Diagonal cm=" + diagonal + ", area cm²=" + area;
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
}
