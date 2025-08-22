package Arreglos;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[3];
		Scanner captura = new Scanner(System.in);
		String nombre;
		for(int i = 0; i< nombres.length; i++) {
												System.out.println("Dame el nombre"+ i+1);
												nombre = captura.nextLine();
												nombres[i]=nombre;												
											   }
		
	}

}
