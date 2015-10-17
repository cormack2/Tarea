import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {

	public static void menu(Scanner intro) {
		int opc = 0;
		int num1 = 0;
		int num2 = 0;
		boolean ciclo = true;
		do {
			do {
				System.out.println("Seleccione la opcion que quiera realizar:");
				System.out.println("(1)Sumar");
				System.out.println("(2)Restar");
				System.out.println("(3)Multiplicar");
				System.out.println("(4)Division");
				System.out.println("(5)Mayor de los numeros");
				System.out.println("(6)Potencia, Primero por el Segundo");
				System.out.println("(7)Salir");
				try {
					opc = intro.nextInt();
					while (opc > 7 || opc < 1) {
						System.out.println("Ingrese un numero entre 1 y 7");
						opc = intro.nextInt();
					}
					ciclo = false;
				} catch (InputMismatchException a) {
					System.out.println("\t error de tipo" + a);
					intro.nextLine();
					System.out.println("Sólo se aceptan valores numéricos");
				}
			} while (ciclo);
			ciclo = true;
			switch (opc) {
			case 1:
				suma(intro, num1, num2);
				break;
			case 2:
				resta(intro, num1, num2);
				break;
			case 3:
				multi(intro, num1, num2);
				break;
			case 4:
				division(intro, num1, num2);
				break;
			case 5:
				comparar(num1, num2);
				break;
			case 6:
				potencia(num1, num2);
				break;
			case 7:
				salir(intro, num1);
				break;

			}

		} while (opc != 7);
	}

	public static void suma(Scanner intro, int num1, int num2) {
		System.out.println("Ingrese numeros");
		num1 = intro.nextInt();
		num2 = intro.nextInt();
		int suma = num1 + num2;
		System.out.println("El resultado de la suma es: " + suma);
	}

	public static void resta(Scanner intro, int num1, int num2) {
		System.out.println("Ingrese numeros");
		num1 = intro.nextInt();
		num2 = intro.nextInt();
		int resta = num1 - num2;
		System.out.println("El resultado de la resta es: " + resta);
	}

	public static void multi(Scanner intro, int num1, int num2) {
		System.out.println("Ingrese numeros");
		num1 = intro.nextInt();
		num2 = intro.nextInt();
		int multiplicacion = num1 * num2;
		System.out.println("El resultado de la multipliacion es: " + multiplicacion);
	}

	public static void division(Scanner intro, int num1, int num2) {
		System.out.println("Ingrese numeros");
		num1 = intro.nextInt();
		num2 = intro.nextInt();
		while (num2 == 0) {
			try {
				double div = (double) (num1 / 0);
			} catch (ArithmeticException a) {
				System.out.println("Error, la division por 0 no existe" + a);
			}
			System.out.println("ingrese un numero que no sea cero");
			num1 = intro.nextInt();
			num2 = intro.nextInt();
		}
		double div = (double) (num1 / num2);
		System.out.println("El resultado de la division es: " + div);
	}

	public static int comparar(int num1, int num2) {
		return Math.max(num1, num2);
	}

	public static int potencia(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

	public static void salir(Scanner intro, int num1) {
		System.out.println("Desea salir");
		System.out.println("(1)Sí y (2)No");
		num1 = intro.nextInt();
		if (num1 == 1) {
			System.out.println("Hasta Luego");
		}
		if (num1 == 2) {
			menu(intro);
		}
	}

	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		menu(intro);
	}

}