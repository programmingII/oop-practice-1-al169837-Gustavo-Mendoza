//Gustavo Alejandro Mendoza Cerna      Día 18/02/19      Hora 19:43

import java.util.Scanner;
class exercise12{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese la primera calificacion");
		double n1 = in.nextDouble();
		System.out.println("Ingrese la segunda calificacion");
		double n2 = in.nextDouble();
		System.out.println("Ingrese la tercera calificacion");
		double n3 = in.nextDouble();
		
		double suma = ((n1+n2+n3)/3);
		System.out.println("El promedio es : " + suma);
		
	}	
}