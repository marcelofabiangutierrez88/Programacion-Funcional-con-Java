package ejercicio2;

public class LambdaTest2 {
	public static void main(String[] args) {
		
		Operations op = (num1, num2) -> System.out.println ("La suma de es: " +(num1 + num2));
		
		LambdaTest2 objeto = new LambdaTest2();
		// Referenciando Operation suma
		objeto.miMetodo(op, 15, 12);
		// impl funcion lambda personalizada.
		objeto.miMetodo((num1, num2) -> System.out.println("La resta es: " + (num1 -num2)), 30,25 );
		// impl funcion lambda personalizada.
		objeto.miMetodo((num1,  num2) -> System.out.println("La multiplicacion es:  " + (num1 * num2)), 30,10);
		// impl funcion lambda personalizada.
		objeto.miMetodo((num1,  num2) -> System.out.println("La division es: " +(num1 /num2)), 30,15);
	}
	
	public void miMetodo(Operations op ,int num1, int num2) {
		op.imprimeOperacion(num1, num2);
	}

}
