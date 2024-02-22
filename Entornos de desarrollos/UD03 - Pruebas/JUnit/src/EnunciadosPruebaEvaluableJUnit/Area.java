package EnunciadosPruebaEvaluableJUnit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = -1;
		double b = 0, a = 0, r = 0;
		double resultado = 0;

		while (opcion != 0) {
			opcion = menu();
			switch (opcion) {
				case 1:
					// area de un cuadrado
					b = solicitarValor("Indica la base o altura: ");
					Cuadrado cuad = new Cuadrado(b);
					resultado = cuad.CalcularAreaCuadrado();
					System.out.println("\n El area del cuadrado es " + resultado);
					break;
				case 2:
					// area de un rectangulo
					b = solicitarValor("Indica la base: ");
					a = solicitarValor("Indica la altura: ");
					Rectangulo rec = new Rectangulo(b, a);
					resultado = rec.CalcularAreaRectangulo();
					System.out.println("\n El area del rectangulo es " + resultado);
					break;
				case 3:
					// area de un circulo
					r = solicitarValor("Indica el radio: ");
					Circulo cir = new Circulo(r);
					resultado = cir.CalcularAreaCirculo();
					System.out.printf("\n El area de la circunferencia es %1.2f\n", resultado);
					break;
				case 4:
					// area de un triangulo
					b = solicitarValor("Indica la base: ");
					a = solicitarValor("Indica la altura: ");
					Triangulo tri = new Triangulo(b, a);
					resultado = tri.CalcularAreaTriangulo();
					System.out.printf("\n El area del triangulo es %1.2f\n", resultado);
					break;
			}
		}
		entrada.close();
	}

	private static double solicitarValor(String texto) {
		while (true) {
			try {
				System.out.print(texto);
				return entrada.nextDouble();
			} catch (InputMismatchException e) {
				// Controlamos que siempre introduzca un valor numerico
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
			}
		}
	}

	private static int menu() {
		int opcion = -1;
		System.out.println("\n\n---------------------------");
		System.out.println("1-Area de un cuadrado");
		System.out.println("2-Area de un rectangulo");
		System.out.println("3-Area de un circulo");
		System.out.println("4-Area de un trinagulo");
		System.out.println("0-Salir");
		System.out.println("Selecciona una opción");
		while (opcion < 0) {
			try {
				opcion = entrada.nextInt();
			} catch (InputMismatchException e) {
				// Controlamos que siempre introduzca un valor numerico
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
				opcion = -1;
			}
		}

		return opcion;
	}
}