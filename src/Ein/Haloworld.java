package Ein;
import java.util.Scanner;
public class Haloworld {

	
	public static void main(String[]args) {
		Scanner un = new Scanner(System.in);
		Scanner uo = new Scanner(System.in);
		System.out.println("Halo" + "World");
		int num;
		int num2;
		int r;
		int op=0;

		boolean menu=true;
		while(menu) {
					System.out.println("Porfavor seleccione un numero de acorde a la operacion que deseaa ejecutar");
					System.out.println("1.-Suma");
					System.out.println("2.-Resta");
					System.out.println("3.-Multiplicacion");
					System.out.println("4.-Division");
					System.out.println("5.-Salir");
					op=uo.nextInt();
		
					switch(op) {
								case 1:
									   System.out.println("Porfavor ingrese un numero");
									   num=un.nextInt();
									   System.out.println("Porfavor ingrese un numero");
									   num2=un.nextInt();
									   r=num+num2;
									   System.out.println("Tu resultado es:"+r);
									   break;
								case 2:
										System.out.println("Porfavor ingrerse un numero");
										num=un.nextInt();
										System.out.println("Porfavor ingrese un numero");
										num2=un.nextInt();
										r=num-num2;
										System.out.println("Tu resultado es:"+r);
										break;
								case 3:
										System.out.println("Porfavor ingrese un numero");
										num=un.nextInt();
										System.out.println("Porfavor ingrese un numero");
										num2=un.nextInt();
										r=num*num2;
										System.out.println("Tu resultado es:"+r);
										break;
								case 4:
										System.out.println("Porfavor ingrese un numero");
										num=un.nextInt();
										System.out.println("Porfavor ingrese un numero");
										num2=un.nextInt();
										r=num / num2;
										System.out.println("Tu resultado es:"+r);
										break;
								case 5:
										menu=false;
										System.out.println("Saliendo....");
										break;
								default:
										System.out.println("Error");
							 }
					}
		
		uo.close();
		un.close();
		
	}

}
