/* Elaborar un programa para un señor que tiene 8 terrenos. Calcule e imprima el
costo de un terreno teniendo como datos la anchura y la longitud en metros, y el
costo del metro cuadrado.
La clase debe ser public para que pueda ser usada en cualquier paquete y los
métodos publicos.
Los datos de la clase deben ser private para darle mayor seguridad.
Utilizar try y catch para controlar excepciones. Permita introducir lo datos en caso
de error de excepciones.

Miguel Pinilla
Michael Solis
Christian Espinosa
Andres Villarreal
Maria Ibarguen
Rolando Riley 
Mariana Zabala Atucha
*/
import java.io.*;
class Terreno{
	private float anchura;
	private float longitud;
	private float pmetrom;
	
	public void asignar(float a, float b, float c){
		anchura = a;
		longitud = b;
		pmetrom = c;
	}
	
	public float calcular_axl(){
		float local;
		local = anchura * longitud;
		return local;
	}
	
	public float calcular_preciom(){
		float locall;
		locall = calcular_axl() * pmetrom; 
		return locall;
	}
}

public class Programa3 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float variable1,variable2,variable3,pp,ppp; 
		int i; 
		Terreno obj = new Terreno();
		for(i = 1; i <= 8; i++){
		
		try {
		
		System.out.println("Ingresa la anchura del terreno: ");
		variable1 = Float.parseFloat(br.readLine());
		System.out.println("Ingresa la longitud: ");
		variable2 = Float.parseFloat(br.readLine());
		System.out.println("Ingresa el precio por metro cuadrado: ");
		variable3 = Float.parseFloat(br.readLine());
		
		obj.asignar(variable1,variable2,variable3);
		pp = obj.calcular_axl();
		ppp = obj.calcular_preciom();
		
		System.out.println("Iterador"+i+". El costo del terreno es: "+ppp+"\n");
 		}
 		catch(IOException e){
 			System.out.println("Error en la entrada de datos, por el método readLine()");
 			i--;
 		}
 		catch(NumberFormatException e){
 			System.out.println("Error en la conversión de datos");
 			i--;
 		}
	}
	}
}