package HERANÇA;

public class Circulo extends Figura2D implements DimensaoSuperficial {

private	double circunferencia;
private double raio;	
private double diametro;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 

public void calcArea() {
	System.out.println("Calculando sua área...");
	area = 3.14*raio*raio;
}

public double getArea() {
	return area;
}


@Override
public String toString() {
	return "Circulo\n" + "Circunferencia= " + circunferencia + ", raio cm=" + raio + ", diametro cm=" + diametro + ", area cm²=" + area;
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public double getCircunferencia() {
	return circunferencia;
}
public void calcCircunferencia() {
	System.out.println("Calculando sua circunferencia...");
	circunferencia = 2*3.14*raio;
}
public double getRaio() {
	return raio;
}
public void setRaio(double raio) {
	System.out.println("Calculando seu raio...");
	this.raio = raio;
}
public double getDiametro() {
	return diametro;
}
public void calcDiametro() {
	System.out.println("Calculando seu diâmetro...");
	diametro = raio*2;
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
}
