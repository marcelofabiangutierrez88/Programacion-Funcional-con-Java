package biFunction;

import java.util.Arrays;
import java.util.List;

import ejercicio2.CalculadoraDos;
import ejercicio2.Empleado;

public class EjercicioBiFunctionTres {
	
	public static void main(String[] args) {
		
		List<Empleado> listaEmpleado = Arrays.asList(
				new Empleado("Marcelo", 24000),
				new Empleado("Ariana", 34500),
				new Empleado("Dante", 12500),
				new Empleado("Jazmin", 18000));
		
		CalculadoraDos calc = new CalculadoraDos();
		List<Double> salarios = calc.calc((salario,incremento) -> salario +(salario*(incremento/100)), 
				listaEmpleado, 16.0);
		
		for(Double salario : salarios) {			
			System.out.println("El salario se incremento a:  "  +salario);
		}
	}
	

}
