package HERAN�A;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

private double altura;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
public void calcAltura() {
	System.out.println("Calculando sua altura...");
	altura = Math.sqrt((getMedidaLados()*getMedidaLados())+((getMedidaLados())/2)*((getMedidaLados())/2));
}

public double getAltura() {return altura;}
public void calcArea() {
	System.out.println("Calculando sua �rea...");
 area = (getMedidaLados()*altura)/2;
	
}

public double getArea() {
return area;
	
}

@Override
public String toString() {
	return "Triangulo equil�tero:\n" + "�rea cm= " + area + " Altura cm= " + altura;
}


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
}
