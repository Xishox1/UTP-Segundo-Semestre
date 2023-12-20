/*Cargar un vector con 10 elementos, imprimir el vector. Calcular e imprimir la suma de sus
elementos.
 */
import java.io.*;
class EjemploProb522{
	private double x[] = new double[10]; // declaro y creo el arreglo x
	
	
	public double imprimir_valores(int i){
		return x[i];
	}
	
	void asignar(double dato, int i){
		x[i] = dato; 
	}
	
	public double sumar(double total,int i){
		double acumulador;
		acumulador = total; 
		acumulador = acumulador + x[i];
		return acumulador; 
	}
}

public class Prob522{
	public static void main(String[] args){
		int i; 
		double total = 0; 
		double dato;
		double elemento; 
		boolean error; 
		EjemploProb522 obj = new EjemploProb522();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(i = 0; i < 10; i++)	{
		try{
			System.out.println("Ingresa un tipo de dato double: ");
			dato = Double.parseDouble(br.readLine());
			obj.asignar(dato,i);
		}catch(IOException e){
			System.out.println("Error en la entrada de datos");
			i--;
		}catch(NumberFormatException e){
			System.out.println("Error en la conversión de datos");
			i--;
		}
	}
	System.out.println("Los datos del vector x son: ");
	for(i = 0; i < 10; i++){
		elemento = obj.imprimir_valores(i);
		System.out.println("\t"+"["+i+"] = "+elemento);
	}
	
	// sumar
	for(i = 0; i < 10; i++){
		total = obj.sumar(total,i);
	}
	System.out.println("\nEl total de la suma es: "+total);
	}
}

