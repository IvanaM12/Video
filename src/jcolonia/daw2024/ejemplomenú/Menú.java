package jcolonia.daw2024.ejemplomenú;

import java.util.List;
import java.util.Scanner;

/**
 * Menú 
 */
public class Menú {
	/** Almacena el título a mostrar */
	private String título;
	
	/** Almacena las distintas opciones para elegir */
	private List<String> textoOpciones;
	
	/** Guarda la opción que se ha elegido */
	private int opciónElegida;
	
	/** Entrada de los datos */
	private static Scanner scEntrada;
	
	/**
	 * Muestra un menú por pantalla según el título y las opciones dadas
	 * y genera una copia de la lista de opciones original. 
	 * 
	 * @param título a mostrar
	 * @param textoOpciones opciones a elegir
	 */
	public Menú(String título, List<String> textoOpciones) {
		this.título=título;
		
		this.textoOpciones=textoOpciones;
	}
	
	/**
	 * Muestra el título por la salida estándar con un subrayado.
	 */
	public void mostrarTítulo() {
		System.out.printf("%s%n%s%n", título, generarSubrayado(título));
	}
	
	/**
	 * Muestra por la salida estándar las diferentes opciones
	 * y su numeración.
	 */
	public void mostrarOpciones() {
		System.out.printf("Las opciones son las siguientes: %n");
		
		for (int i=1; i<textoOpciones.size(); i++) {
			System.out.printf(" %d: %s %n", i, textoOpciones.get(i-1));
		}
		
		System.out.printf("Presione 0 para salir %n");
	}
	
	/**
	 * Permite elegir una de las opciones mostradas.
	 * 
	 * @return el número de la opción elegida.
	 */
	public int elegirOpción() {
		getEntrada();
		String s;
		
		System.out.print("Elige una: ");
		boolean salir = false;
		do {
			s = scEntrada.nextLine();
			if (s.compareTo("0") == 0) {
				salir = true;
			} else {
				opciónElegida = Integer.parseInt(s);
				salir = true;
			}
		} while (!salir);
		cerrarEntrada();
			
		return opciónElegida;
	}
	
	/**
	 * Crea un texto de la misma longitud con guiones.
	 * 
	 * @param texto el texto original de referencia
	 * @return subrayado
	 */
	public static String generarSubrayado(String texto) {
		int longitud;
		StringBuilder subrayado;
		char c = '-';
		
		longitud = texto.length();
		subrayado=new StringBuilder();
		
		for (int i=1; i < longitud; i++) {
			subrayado.append(c);
		}	
		
		return subrayado.toString();
	}
	
	/**
	 * Muestra el texto dado por la salida estándar.
	 * 
	 * @param texto a mostrar
	 */
	public static void mostrarTexto(String texto) {
		System.out.print(texto);
	}
	
	/**
	 * Muestra el texto dado por la salida estándar a modo de error.
	 * 
	 * @param texto a mostrar
	 */
	public static void mostrarError(String texto) {
		System.err.print(texto);
	}
	
	/**
	 * Abre el escáner para la entrada de datos del usuario.
	 * 
	 * @return el escáner
	 */
	public static Scanner getEntrada() {
		if (scEntrada == null) {
			scEntrada = new Scanner(System.in);
		}
		
		return scEntrada;
	}
	
	/**
	 * Cierra el escáner.
	 */
	public static void cerrarEntrada() {
		scEntrada.close();
	}
}
