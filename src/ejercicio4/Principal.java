package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		engine((Long x, Long y) -> x+y);
		//o
		engine((CalculadoraInt)(x, y) -> x+y);
		//o
		CalculadoraInt calI = (x, y) -> x+y;
	}

	public static void engine(CalculadoraInt cal) {
		int x = 5, y =9;
		int resultado  = cal.calculate(x, y);
		System.out.println(resultado);
	}

	public static void engine(CalculadoraLong cal) {
		Long x =(long) 13; 
		Long y = (long) 18;
		Long resultado = cal.calculate(x, y);
		System.out.println(resultado);

	}

}
