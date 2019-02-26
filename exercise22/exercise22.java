//Gustavo Alejandro Mendoza Cerna     Día: 26/02/19  hora: 13:09

import java.util.Scanner;
class exercise22 {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Ingrese un numero binario");
		String n1 = in.nextLine();

		int dec = Integer.parseInt(n1, 2);
		
		System.out.println("El resultado es : " + dec);
	}
}