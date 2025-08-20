package Cicles_Codes;

public class Ciclos_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i=1;/* Se declara la variable en i=1 para que se cumpla la condicion 
			y entre al arreglo.		Sintaxis: while (condicion) { */
			
			while (i >= 5) {
							System.out.println("Numero: " + i);
							int n;
							i++;
						   }
			
			/*Ciclo For:
			  Sintaxis:  for (inicializacion; condicion; actualizacion) {
			 */
			
			for(int x = 1; x<=5; x++) {
										System.out.println("Iterancion:" + x);
									  }
			
			
			/* Do While:
			  Es similar al while pero siempre ejecuta al menos una vez el bloque de código 
			  ya que la condicion se evalua despues.
			  
			   Sintaxis:
			   	do{
			   		Codigo que se repite
			   	  } while (condicion);
			 */
			
			int j=1;
			do {
				System.out.println("Valor: "+j);
				j++;
			   }while (j>= 5);
	}

}
