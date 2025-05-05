package jcolonia.daw2024.ejemplomenú;

import java.util.List;

/**
 * Ejemplo de uso de {@link Menú}.
 * 
 * @author Ivana Marcos
 * @version 1.0 20250314
 */
public class EnsayoMenú {

	/**
	 * do menú, if entrada 0, salir, else imprimir opciones while salir
	 */
	public void ejecutar() {
		Menú menú;
		int entrada;
		List<String> opciones = List.of("opción1", "opción2", "opción3", "opción4");
		
		menú = new Menú("Prueba de título", opciones);
		menú.mostrarTítulo();
		menú.mostrarOpciones();
		entrada = menú.elegirOpción();
		
		System.out.printf("La opción elegida es: %s", opciones.get(entrada));
	}

	/**
	 * llamar al ejecutar
	 * 
	 * @param args argumentos a dar, no usado
	 */
	public static void main(String[] args) {
		EnsayoMenú ensayo;
		ensayo = new EnsayoMenú();
		
		ensayo.ejecutar();
	}

}
