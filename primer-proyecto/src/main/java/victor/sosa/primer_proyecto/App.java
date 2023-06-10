package victor.sosa.primer_proyecto;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Calculadora con Maven y Junit" );
        int opcion = 0;
        
        
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	Double resultado = null;
        	if(opcion == 1) {
        		resultado = sumar(leerDecimalTeclado("Número 1 a sumar:"),leerDecimalTeclado("Número 2 a sumar:"));
        	}else if(opcion == 2) {
        		resultado = restar(leerDecimalTeclado("Número 1 a restar:"),leerDecimalTeclado("Número 2 a restar:"));

        	}else if(opcion == 3) {
        		resultado = multiplicar(leerDecimalTeclado("Multiplicando:"),leerDecimalTeclado("Multiplicador:"));

        	}else if(opcion == 4) {
        		resultado = dividir(leerDecimalTeclado("Dividendo:"),leerDecimalTeclado("Divisor:"));

        	}else {
        		System.out.println("Finalizando la aplicación.");
        	}
        	System.out.println("El resultado de la operación es: "+resultado);
        }
        
        
        
    }

	private static int leerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimalTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}

	private static void imprimirMenu() {
		System.out.println("*** CALCULADORA ***");
		System.out.println("1. SUMAR");
		System.out.println("2. RESTAR");
		System.out.println("3. MULTIPLICAR");
		System.out.println("4. DIVIDIR");
		System.out.println("5. SALIR");
		System.out.println("ELIJA UNA OPCIÓN DEL MENÚ:");
	}

	public static double sumar(double numero1, double numero2) {
		return numero1+numero2;
	}

	public static double restar(double numero1, double numero2) {
		double respuesta = numero1 - numero2;
		return respuesta;
	}

	public static double multiplicar(double multiplicando, double multiplicador) {
		return multiplicando*multiplicador;
	}

	public static Double dividir(double dividendo, double divisor) {
		Double resultado = 0.0;
		if(divisor == 0) {
			resultado = null;
			System.err.println("Intentanto dividir "+dividendo+"/"+divisor);
			System.err.println("No se puede dividir entre cero");
		}else {
			resultado = dividendo/divisor;
		}
		
		return resultado;
	}

}
