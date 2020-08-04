package ejercicioFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import ejercicioFunction.pojo.Comensal;

public class DatosComensales {

	public static void main(String[] args) {
		
		List<Comensal> listaComensales = Arrays.asList(new Comensal("Marcelo", 12, 1),
				new Comensal("Gutierrez", 12, 1), 
				new Comensal("Fabian", 12, 1),
				new Comensal ("Dante", 12, 1),
				new Comensal ("Jazmin", 12, 1));
		
		List<Object> nombresComensales = 
				getDatosComensales(listaComensales, x -> x.getNombre());
		System.out.println("La lista de nombres de los comensales es la siguiente: ");
		for (Object nombreComensal : nombresComensales) {
			System.out.println("El nombre es: " + nombreComensal);
		}
	}

	public static List<Object> getDatosComensales (List<Comensal> listaCom, Function<Comensal, Object> func){
		List<Object> listaDatos = new ArrayList<>();
		for (Comensal comensal : listaCom) {
			listaDatos.add(func.apply(comensal));
		}
		return listaDatos;
	}
}
