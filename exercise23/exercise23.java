//Gustavo Alejandro  Mendoza Cerna    día 26/02/19    hora:12:18

import java.util.Scanner;//agregamos la libreria que nos permite escanear un digito y guardarlo.
class exercise23{
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);//declaramos que scanner in sera igual a System.in que nos permite introducir y almacenar un digito.
		System.out.println("Ingrese el numero binario");//le preguntamos al usuario que introduzca un número.
		String b1 = in.nextLine();//almacenamos en String b1 todo el numero binario con la etiqueta in.nextline que nos permite guardar toda la linea que escribimos.

		int hex = Integer.parseInt(b1, 2);//almacenamos en un entero, donde el entero de b1 se convertira a base binaria.

		String result = Integer.toHexString(hex);//resultado almacenara la funcion de entero a hex, donde se escanea hex que ya esta en binario.
		System.out.println(result); //imprimos result
	}
}