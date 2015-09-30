import java.util.Scanner;

public class Calculadora {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Seleccione la opcion que quiera realizar");
	System.out.println("(1)Sumar");
	System.out.println("(2)Restar");
	System.out.println("(3)Multiplicar");
	System.out.println("(4)Division");
	System.out.println("(5)Salir");	
	sc = new Scanner(System.in);
	int eleccion = sc.nextInt();

   
	switch (eleccion) {
	case 1:
		 int i = sc.nextInt();
		    int o = sc.nextInt();
		    int r;
		    r = i+o;
		    System.out.println("El resultado de la suma es:"+r);
		break;
	case 2:
		 int i2 = sc.nextInt();
		    int o2= sc.nextInt();
		    int r2;
		    r2 = i2-o2;
		    System.out.println("El resultado de la resta es:"+r2);
		break;
	case 3:
		 int i3 = sc.nextInt();
		    int o3 = sc.nextInt();
		    int r3;
		    r3 = i3*o3;
		    System.out.println("El resultado de la multiplicacion es:"+r3);
		break;
	case 4:
		 int i4 = sc.nextInt();
		    int o4 = sc.nextInt();
		    int r4;
		    r4 = i4/o4;
		    System.out.println("El resultado de la division es:"+r4);
		break;
	case 5:
		
		break;
		

		
		
		
		
	default:
		break;
	}
	}
}

	