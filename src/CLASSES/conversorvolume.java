package CLASSES;

public class conversorvolume {
	private static double litrocmcubico = 1000;
	private static double metrocubicolitros = 1000;
	private static double metrocubicopecubico = 35.32;
	private static double galaoamericanopolegada = 231;
	private static double galaoamericanolitro = 3785;
	
	public static double converterlitrocmcubico(double litros) {
		System.out.println(" ");
		System.out.print(litros + " litros representam essa qtd em cm�: ");
		return litrocmcubico*litros;
	}
	
	public static double convertermetrocubicolitros(double metroscubicos) {
		System.out.println(" ");
		System.out.print(metroscubicos + " M� representam essa qtd em litros: ");
		return metrocubicolitros*metroscubicos;	
	}
	public static double convertermetrocubicopecubico(double metrocubicos1) {
		System.out.println(" ");
		System.out.print(metrocubicos1 + " M� representam essa qtd em p�s�: ");
		return metrocubicopecubico*metrocubicos1;
	}
	public static double convertergalaoamericanopolegada(double galao1) {
		System.out.println(" ");
		System.out.print(galao1 + " gal�es americanos representam essa qtd em polegadas: ");
		return galaoamericanolitro*galao1;
	}
	public static double convertergalaoamericanolitro(double galao) {
		System.out.println(" ");
		System.out.print(galao + " gal�es americanos representam essa qtd em litros: ");
		return galaoamericanolitro*galao;
	}
}
