package HERANÇA;

import java.util.Scanner;

public class Testefiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		Triangulo triangulo = new Triangulo();
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Clindro cilindro = new Clindro();
		Cubo cubo = new Cubo();
		Pirâmide pirâmide = new Pirâmide();
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
		
		Scanner entrada = new Scanner(System.in);
/*		
  		System.out.println("Digite a medida dos lados de um triângulo equilátero em cm: ");
		triangulo.setMedidaLados(entrada.nextDouble());
		triangulo.calcAltura(); 
		triangulo.calcArea();
		System.out.println(triangulo);	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
		System.out.println("Digite a medida dos lados de um quadrado em cm: ");
		quadrado.setMedidaLados(entrada.nextDouble()); 
		quadrado.calcArea();
		quadrado.calcDiagonal();
		System.out.println(quadrado);	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
		System.out.println("Digite a medida do raio de um círculo em cm: ");
		circulo.setRaio(entrada.nextDouble());
		circulo.calcArea();
		circulo.calcCircunferencia();
		circulo.calcDiametro();
		System.out.println(circulo);	                                                                                                                                                   
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		System.out.println("Digite a medida do raio de um cilindro em cm: ");
		cilindro.setRaio(entrada.nextDouble());
		System.out.println("Digite a medida da altura de um cilindro em cm: ");
		cilindro.setAltura(entrada.nextDouble());
		cilindro.calcVolume();
		System.out.println(cilindro);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		System.out.println("Digite a medida da aresta de um cubo em cm: ");
		cubo.setMedidaLados(entrada.nextDouble());
		cubo.calcDiagonal();
		cubo.calcVolume();
		System.out.println(cubo);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
		System.out.println("Digite a medida da aresta de uma pirâmide uniforme em cm: ");
		pirâmide.setMedidaLados(entrada.nextDouble());
		pirâmide.calcAltura();
		pirâmide.calcAreadabase();
		pirâmide.calcVolume();
		System.out.println(pirâmide);
		*/
		FiguraGeometrica[] array = new FiguraGeometrica[6];
		array[0] = triangulo;
		array[1] = circulo;
		array[2] = quadrado;
		array[3] = cilindro;
		array[4] = cubo;
		array[5] = pirâmide;
		
		if(array[0] instanceof Triangulo) {
		
			System.out.println("Digite a medida dos lados de um triângulo equilátero em cm: ");
			triangulo.setMedidaLados(entrada.nextDouble());
			triangulo.calcAltura(); 
			triangulo.calcArea();
			System.out.println(triangulo);
		}
		if(array[1] instanceof Circulo) {
			System.out.println("Digite a medida do raio de um círculo em cm: ");
			circulo.setRaio(entrada.nextDouble());
			circulo.calcArea();
			circulo.calcCircunferencia();
			circulo.calcDiametro();
			System.out.println(circulo);		
	}
		if(array[2] instanceof Quadrado) {
			System.out.println("Digite a medida dos lados de um quadrado em cm: ");
			quadrado.setMedidaLados(entrada.nextDouble()); 
			quadrado.calcArea();
			quadrado.calcDiagonal();
			System.out.println(quadrado);	
	}
		if(array[3] instanceof Clindro) {
			System.out.println("Digite a medida do raio de um cilindro em cm: ");
			cilindro.setRaio(entrada.nextDouble());
			System.out.println("Digite a medida da altura de um cilindro em cm: ");
			cilindro.setAltura(entrada.nextDouble());
			cilindro.calcVolume();
			System.out.println(cilindro);
		}
		if(array[4] instanceof Cubo) {
			System.out.println("Digite a medida da aresta de um cubo em cm: ");
			cubo.setMedidaLados(entrada.nextDouble());
			cubo.calcDiagonal();
			cubo.calcVolume();
			System.out.println(cubo);
		}
		if(array[5] instanceof Pirâmide) {
			System.out.println("Digite a medida da aresta de uma pirâmide uniforme em cm: ");
			pirâmide.setMedidaLados(entrada.nextDouble());
			pirâmide.calcAltura();
			pirâmide.calcAreadabase();
			pirâmide.calcVolume();
			System.out.println(pirâmide);
		}
}
}
