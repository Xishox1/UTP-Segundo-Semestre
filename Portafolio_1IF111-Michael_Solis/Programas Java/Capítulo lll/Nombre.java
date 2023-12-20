/* Escriba un programa que lea el nombre de una persona. Concatene la cadena Hola
y el nombre de la persona e imprima la cadena resultante. Repita el proceso
mientras el usuario lo desee.
La clase debe ser public para que pueda ser usada en cualquier paquete y los
métodos publicos.
Los datos de la clase deben ser private para darle mayor seguridad.
Utilizar try y catch para controlar excepciones.
*/
import java.io.*;
class EjemploNombre{
	// Atributos o datos
	private final String v = "Hola";
	public String nombre;
	
	// Métodos
	public void asignar(String cad){
		nombre = cad;
	}	
		
	public String enunciado(){
		String nuevo = v+" "+nombre;
		return nuevo;
	}
}

public class Nombre{
	public static void main(String[] args){
		String cadena,res;
		char resp = 'S';
		EjemploNombre obj = new EjemploNombre(); // Se declara y crea el objeto
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(resp == 'S'){
		try{
		
		System.out.println("Por favor ingresa tu nombre: ");
		cadena = br.readLine();
		obj.asignar(cadena);
		res = obj.enunciado();
		System.out.println(res);
		}
		catch(IOException e){
			System.out.println("Error en el método readLine()");
		}
		catch(NumberFormatException e){
			System.out.println("Error en la conversión de datos");
		}
		
		try{
			System.out.println("¿Desea continuar? escriba s para continuar o cualquier otro carácter para terminar el programa");
			resp = (char)br.read();
			resp = Character.toUpperCase(resp);
			br.skip(1);
		}
		catch(IOException e){
			System.out.println("Error en la entrada de datos con el método readline()");
		}
	}
	System.out.println("***Programa terminado***");
}
}
