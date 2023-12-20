/*Escriba un programa que lea un n�mero e imprima si es neutro, positivo o no. Repita el proceso 7 veces. */

import java.io.*;
class EjemploNumero{
	// Atributos o datos
	private int numero;
	
	// M�todos
	public void asignar(int a){
		numero = a;
	}
	
	public String calcular(){
		String mensaje; 
		if(numero > 0)
			mensaje = "positivo";
		else if(numero < 0)
			mensaje = "negativo";
		else 
			mensaje = "neutro";
		return mensaje; 
	}
}

public class Numero{
	public static void main(String[] args){
		int num,i;
		String cadena;
		EjemploNumero obj = new EjemploNumero();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(i = 1; i <= 7; i++){
			try{
				System.out.println("Ingresa el numero: ");
				num = Integer.parseInt(br.readLine());
				obj.asignar(num);
				cadena = obj.calcular();
				System.out.println("Ejecuci�n#"+i+".El resultado es: "+cadena);
				}
			catch(IOException e){
				System.out.println("Error en la entrada de datos con el m�todo readLine()");
				i--;
				}
			catch(NumberFormatException e){
				System.out.println("Error en la conversi�n de datos con el m�todo parse");
				i--;
				}
		}
		
	}
}
