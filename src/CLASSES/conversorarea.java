package CLASSES;

public class conversorarea {

	private static double metroquadpe = 10.76;
	private static double pequadcentimetro = 929;
	private static double milhaquadacre = 640;
	private static double acrepequad = 43560;

	public static double convertermetroquadpe(double metros) {
		System.out.println(" ");
		System.out.print(metros + " M� representam essa qtd em p�s�: ");
		return metroquadpe*metros;
	}
	public static double converterpequadcentimetro(double pequad) {
		System.out.println(" ");
		System.out.print(pequad + " p�s� representam essa qtd em cm�: ");
		return metroquadpe*pequad;
	}
	public static double convertermilhaquadacre(double milhaquad) {
		System.out.println(" ");
		System.out.print(milhaquad + " milhas� representam essa qtd em acres: ");
		return milhaquadacre*milhaquad;
	}
	public static double converteracrepequad(double acre) {
		System.out.println(" ");
		System.out.print(acre + " acres representam essa qtd em p�s�: ");
		return acrepequad*acre;
	}
}
