package HERANÇA;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

private double altura;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
public void calcAltura() {
	System.out.println("Calculando sua altura...");
	altura = Math.sqrt((getMedidaLados()*getMedidaLados())+((getMedidaLados())/2)*((getMedidaLados())/2));
}

public double getAltura() {return altura;}
public void calcArea() {
	System.out.println("Calculando sua área...");
 area = (getMedidaLados()*altura)/2;
	
}

public double getArea() {
return area;
	
}

@Override
public String toString() {
	return "Triangulo equilátero:\n" + "Área cm= " + area + " Altura cm= " + altura;
}


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
}
