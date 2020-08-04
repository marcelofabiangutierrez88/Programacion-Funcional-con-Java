package ejercicio4;

public class Main {

	public static void main(String[] args) {
		Long a = (long) 4;
		Long c = (long) 2;
		System.out.println(create().calculate(a,c));
	}
	
	private static CalculadoraLong create() {
		return (x,y) -> x/y;
	}

}
