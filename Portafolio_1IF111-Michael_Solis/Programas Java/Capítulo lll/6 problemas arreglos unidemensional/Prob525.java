/* Dado un vector A de 50 números reales, obténgase la diferencia más grande entre dos
elementos consecutivos de este vector. */

import java.io.*;
class Arreglo5{
	private double x[] = new double[5]; // declare y cree el arreglo x
	
	void asignar(int i, double dato){
		x[i] = dato;
	}
	
	public double mostrar_datos(int i){
		return x[i];
	}
	
	public double hola(int i){
		double valor;
		valor = (mostrar_datos(i-1)-mostrar_datos(i));
		return valor; 
	}
	
	public double mayor(double elemento){
		double max;
		int i;
		max = elemento;
		for(i = 0; i < 5; i++){
			if(elemento > max)
				max = elemento;
		}
		return max; 
	}
	
}
class Prob525{
	public static void main(String[] args){
		double elemento;
		double variable = 0;
		int i;
		double dato;
		Arreglo5 obj = new Arreglo5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(i = 0; i < 5; i++){
			try{
				System.out.println("Ingresa un dato de tipo entero: ");
				dato = Double.parseDouble(br.readLine());
				obj.asignar(i,dato);
			}catch(IOException e){
				System.out.println("Error en la entrada de datos");
				i--;
			}catch(NumberFormatException e){
				System.out.println("Error en la conversión de datos");
				i--;
			}
		}
		
		for(i = 1; i < 5; i++){
			elemento = obj.hola(i);
			variable = obj.mayor(elemento);
			System.out.println("x["+(i-1)+"] - x["+(i)+"] = "+elemento);
		}
		
		System.out.println("La diferencia más grande entre 2 elementos consecutivos es: "+variable);
	}
}