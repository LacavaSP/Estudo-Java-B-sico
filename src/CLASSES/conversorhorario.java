package CLASSES;

public class conversorhorario {

	private static double minutosegundo = 60;
	private static double horaminuto = 60;
	private static double diahoras = 24;
	private static double semanadias = 7;
	private static double mesdias = 30;
	private static double anodias = 365.25;
	
	
	public static double converterminutosegundo(double minutos) {
		System.out.println(" ");
		System.out.print(minutos + " minutos representam essa qtd em segundos: ");
		return minutosegundo*minutos;
	}
	public static double converterhoraminuto(double hora){
		System.out.println(" ");
		System.out.print(hora + " horas representam essa qtd em minutos: ");
		return horaminuto*hora;
	}
	public static double converterdiahoras(double dia) {
		System.out.println(" ");
		System.out.print(dia + " dias representam essa qtd em horas: ");
		return diahoras*dia;
	}
	public static double convertersemanadias(double semana) {
		System.out.println(" ");
		System.out.print(semana + " semanas representam essa qtd em dias: ");
		return semanadias*semana;
	}
	public static double convertermesdias(double mes) {
		System.out.println(" ");
		System.out.print(mes + " meses representam essa qtd em dias: ");
		return mesdias*mes;
	}
	public static double converteranodias(double ano) {
		System.out.println(" ");
		System.out.print(ano + " anos representam essa qtd em dias: ");
		return anodias*ano;
	}
	
}

