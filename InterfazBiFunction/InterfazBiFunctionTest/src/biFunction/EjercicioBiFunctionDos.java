package biFunction;

public class EjercicioBiFunctionDos {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		String resultado = calculadora.calc((x,y) -> " : " + (x*y), 60, 12);
		System.out.println("El resultado es" + resultado);
	}
}
