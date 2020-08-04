package evaluaempleados;

import java.util.Arrays;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Empleado> listaEmpleados = Arrays.asList(
				new Empleado("Marcelo", 32, 1500, "Desarrollo"),
				new Empleado("Dante", 6, 1900, "Juegos"),
				new Empleado("Jazmin", 11, 250, "Minecraft"),
				new Empleado("Ariana", 40, 1300, "Docente particular"),
				new Empleado("Sarasa", 32, 5000, "Sarasea")
				);
		
		Evaluador evaluador = new Evaluador();
		System.out.println("Empleados con salarios mayor a 1200");
		List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados,
				(empleado)-> empleado.getSalario() > 1200);
		
		for (Empleado empleado : empSalariosAltos) {
			System.out.println(empleado.getNombre() +" trabajan en el departamento de: " + empleado.getDepartamento());
		}
		
		System.out.println("\nEmpleados que su numbre inicia con M: ");
		List<Empleado>inicianConJ = 
				evaluador.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("M"));
		for (Empleado empleado : inicianConJ) {
			System.out.println(empleado.getNombre());
		}
		System.out.println("\nEmpleados mas jovenes: ");
		List<Empleado> empleadosJovenes = evaluador.evaluar(listaEmpleados, empleado -> empleado.getEdad()<18);
		for(Empleado empleado: empleadosJovenes) {
			System.out.println(empleado.getNombre()+ " tiene: " +empleado.getEdad()+ " años");
		}
		
	}

}
