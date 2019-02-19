//Gustavo Alejandro Mendoza Cerna    Día: 19/02/19    hora: 9:13

import java.util.Scanner;//sirve para agregar una libreria a nuestro programa
class exercise17{
	public static void main(String args[]){
		Scanner in = new Scanner (System.in); //Scanner in se necesita para el obejto , = new es para crear un objeto vacio 
			//la palabra System.in es para recibir un dato.

		System.out.println("Ingrese el primer numero binario"); //se le pregunta al usuario que ingrese un número.
		String a = in.nextLine(); // se declara una variable de tipo string donde se almacenara un dato.
		System.out.println("Ingrese el segundo numero binario"); //se le pregunta al usuario el segundo número. 
		String b = in.nextLine();// se recibe la segunda variable de tipo String donde se almacenara un dato.
		
		System.out.println("La suma de los numeros binarios es de : "
+ Integer.toBinaryString((Integer.parseInt(a, 2) + (Integer.parseInt(b, 2)))));//mediante la parte Integer.tobinaryString se imprimira la suma de los numeros en binarios 
	}
}