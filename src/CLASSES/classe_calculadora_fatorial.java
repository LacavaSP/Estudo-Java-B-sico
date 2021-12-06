package CLASSES;
import java.lang.Math;
public class classe_calculadora_fatorial {
	private static double resultadofat1 = 1,resultadofat2 = 1;
	public classe_calculadora_fatorial() {
	}
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static double getSomar(double num1, double num2) { return num1+num2;}
	
	public static double getSubtrair(double num1, double num2) {return num1-num2;}
	
	public static double getMultiplicar(double num1, double num2) {return num1*num2;}
	
	public static double getPotencia (double num1, double num2) { return Math.pow(num1, num2);}
	
	public static double getDividir(double num1, double num2) {return num1/num2;}
	
	public static double getFatorialnum1(double num1) {for(double i=1;i<=num1;i++) {resultadofat1*=i;}System.out.print(num1 + " != "); return resultadofat1;}
	
	public static double getFatorialnum2(double num2) {for(double i=1;i<=num2;i++) {resultadofat2*=i;}System.out.print(num2 + " != ");return resultadofat2;}
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
