//Gustavo Alejandro Mendoza Cerna
//11/02/19
//9:10

import java.util.Scanner;
class exerciseSix{
	public static void main(String[] args){
	   	Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el primero numero");
		int n1 = in.nextInt();
		System.out.println("Ingrese el segundo numero");
		int n2 = in.nextInt();

		System.out.println(n1 + " + " + n2 + " = " + (n1+n2) );
		System.out.println(n1 + " - " + n2 + " = " + (n1-n2) );
		System.out.println(n1 + " x " + n2 + " = " + (n1*n2) );
		System.out.println(n1 + " / " + n2 + " = " + (n1/n2) );
		System.out.println(n1 + " mod " + n2 + " = " + (n1%n2) );
	}	
}