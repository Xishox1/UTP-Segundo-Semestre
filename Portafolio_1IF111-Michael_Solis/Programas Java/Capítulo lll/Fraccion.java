/* Lea el numerador y el denominador de una fracci�n. Imprima el resultado de la divisi�n. 
En la POO la validaci�n de datos se realiza en el programa principal.
Repita el proceso 10 veces.
*/
import java.io.*;
class EjemploFraccion {
	// Datos o atributos
	private int numerador;
	private int denominador;
	
	// M�todos o atributos
	public void asignar(int a, int b){
		numerador = a;
		denominador = b;
	}
	
	public float calcular(){
		float resultado;
		resultado = (float)numerador/denominador;
		return resultado;
	}
}

public class Fraccion {
	public static void main(String[] args){
		int num1,num2,i;
		float res;
		EjemploFraccion obj = new EjemploFraccion(); // Se declara y crea el objeto
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(i = 1; i <= 10; i++){
		try{
		System.out.println("Ingresa el numerador");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("Ingresa el denominador");
		num2 = Integer.parseInt(br.readLine());
		obj.asignar(num1,num2);
		res = obj.calcular();
		System.out.println("El resultado de la operaci�n es: "+res);
		}
		catch(IOException e){
			System.out.println("Error con el m�todo readLine() en la entrada de datos");
			i--;
		}
		catch(NumberFormatException e){
			System.out.println("Error en la conversi�n de datos");
			i--;
		}
	}
	}
}