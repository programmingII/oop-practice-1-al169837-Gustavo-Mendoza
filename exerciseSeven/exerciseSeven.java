//nombre: Gustavo Alejandro Mendoza Cerna       Dia: 12/02/19     hora: 12:47

import java.util.Scanner;
class exerciseSeven{

	public static void main(String[] args){
		Scanner in = new Scanner (System.in); 	
		
		System.out.println("Ingrese un numero");
		int n1 = in.nextInt();
		
		int suma = 0;
		for (int i = 1; i<=10 ; i++){
			suma += n1;
			System.out.println(n1 + " X " + i + " = " + (n1*i));
		}
	}
}