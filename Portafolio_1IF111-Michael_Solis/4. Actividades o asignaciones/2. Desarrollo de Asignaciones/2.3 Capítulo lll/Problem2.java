/* La velocidad de la luz es de 300,000 kms/seg. Elaborar un programa que lea un
tiempo en segundo e imprima la distancia que recorre en dicho tiempo. Permita que
el usuario repita el proceso 10 veces. En caso de ocurrir un error de excepción
cualquiera permita introducir el dato nuevamente.
La clase debe ser public para que pueda ser usada en cualquier paquete y los
métodos publicos.
Los datos de la clase deben ser private para darle mayor seguridad.
Utilizar try y catch para controlar excepciones. */

import java.io.*;
class Tiempo{
	private int sec;
	private final int vl = 300000;
	
	public void asignar(int a){
		sec = a;
	}
	
	public int calcular_segundos(){
		int tt;
		tt = sec * vl;
		return tt;
	}
}
// Programa Principal
public class Problem2{
	public static void main(String[] args){
		String cadena; 
		int numero,i,f;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Tiempo nuevo = new Tiempo();
		for(i = 0; i < 10; i++){
			try{
				System.out.println("Ingresa los segundos para calcular en kilometros");
				cadena = br.readLine();
				numero = Integer.parseInt(cadena);
				nuevo.asignar(numero);
				f = nuevo.calcular_segundos();
				System.out.println("El resultado a kilometros recorridos es: "+f);
				}
			catch(IOException e){
				System.out.println("Error en la entrada de datos,con en el método readLine");
				}
			catch(NumberFormatException e){
				System.out.println("Error en la conversión de dato");
				}
		}
	}
}


