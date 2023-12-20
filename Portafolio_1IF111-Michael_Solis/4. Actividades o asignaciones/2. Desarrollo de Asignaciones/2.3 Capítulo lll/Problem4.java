/* Escriba un programa que calcule la cantidad de sillas para un laboratorio que tiene
10 mesas y 4 máquinas por mesa.
La clase debe ser public para que pueda ser usada en cualquier paquete y los
métodos publicos.
Los datos de la clase deben ser private para darle mayor seguridad.
*/
import java.io.*;
class Silla{
	// Atributos o datos 
	private int silla;
	
	// Métodos o acciones 
	
	public void asignar(int a){
		silla = a;
	}
	
	public int func_acumulador(int a, int b){
		int acumuladorr;
		acumuladorr =  b;
		acumuladorr =  acumuladorr + a;
		return acumuladorr;
	}
}

// Clase Principal
public class Problem4{
	public static void main(String[] args){
	int res,i,cadena;
	res = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Silla obj = new Silla(); // Aplicando método constructor
	// Ingresando la cantidad de sillas
	for(i = 1; i <= 10; i++){
	try{
		System.out.println("Ingresa la cantidad de silla para la mesa #"+i);
		cadena = Integer.parseInt(br.readLine());
		obj.asignar(cadena);
		res = obj.func_acumulador(cadena,res);
		}
	catch(IOException e){
		System.out.println("Error en la entrada de datos, con el método Readline()");
		i--;
		}
	catch(NumberFormatException e){
		System.out.println("Error en la conversión de datos");
		i--;
		}
	}
	System.out.println("El total de sillas es: "+res+"\n ===Programa Terminado===");
}
}

