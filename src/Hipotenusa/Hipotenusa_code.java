package Hipotenusa;
import java.util.Scanner;

public class Hipotenusa_code {
	public static void main(String [] args) {
		Scanner ba = new Scanner(System.in);
		Scanner ho = new Scanner(System.in);
		Scanner hy = new Scanner(System.in);
		Scanner menu_operation_scanner = new Scanner(System.in);
		int menu_operation;
		double basis;
		double hooget;
		double hypotenusas;
		boolean menu=true;
		while(menu==true) {
						System.out.println("Bienvenido a la calculadora \n Que quieres sacar? \n 1.-Hypotenusa 2.-Lado 3.-Salir)");
						menu_operation = menu_operation_scanner.nextInt();
						switch (menu_operation) {
													case 1:
															System.out.println("Porfavor ingresa la altura:  ");
															hooget=ho.nextDouble();
															System.out.println("Porfavor ingresa la base: ");
															basis=ba.nextDouble();
															double hypotenusa=Math.sqrt(basis*basis + hooget*hooget);
															System.out.println("La hypotenusa es: "+hypotenusa);
															break;
													case 2: 
															System.out.println("Porfavor ingrese la Hypotenusa");
															hypotenusas = hy.nextDouble();
															System.out.println("Porfavor ingrese un lado");
															basis=ba.nextDouble();
															double lado=Math.sqrt(hypotenusas*hypotenusas - basis*basis);
															System.out.println("Lado: "+lado);
															break;
													case 3:
															System.out.println("Saliendo");
															menu=false;
															break;
													default:
															System.out.println("Error....");
															break;
												}
						
						
						
				}
		ba.close();
		ho.close();
		hy.close();
		menu_operation_scanner.close();
	}
}
