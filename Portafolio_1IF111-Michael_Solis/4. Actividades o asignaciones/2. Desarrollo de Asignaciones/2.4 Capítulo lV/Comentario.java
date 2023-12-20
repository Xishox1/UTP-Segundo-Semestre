/* Dada 2 variables que contienen los resultados de la evaluación (s para si o n para no) de dos condiciones.
 * Imprima el resultado según la tabla de la verdad del And (Y) de los dos resultados proporcionados. Repita el proceso 8 veces.
 */
import java.io.*;
class EjemploComentario {
	// atributos
	private char var1;
	private char var2;
	
	// métodos
	public void asignar(char a, char b){
		var1 = a;
		var2 = b;
	}
	
	public String valores(){
		String mensaje;
		if(var1 == 's' & var2 == 's')
			mensaje = "El resultado es verdadero";
		else
			mensaje = "El resultado es falso";
		return mensaje;
	}
}

public class Comentario {
	public static void main(String[] args){
		String res = "";
		char valor1 = 0,valor2 = 0;
		int i;
		EjemploComentario obj = new EjemploComentario();
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		for(i = 1; i<= 8; i++){
			try{
				System.out.println(i+".Ingresa el primer valor 's' o 'n': ");
				valor1 = (char)leer.read();
				leer.skip(1);
				}
			catch(IOException e){
				System.out.println("Error en la entrada de datos");
				i--;
				}
			try{
				System.out.println(i+".Ingresa el segundo valor 's' o 'n': ");
				valor2 = (char)leer.read();
				leer.skip(1);
				// Validar dentro del Programa Principal
				if((valor1 != 's' & valor1 != 'n') | (valor2 != 's' & valor2 != 'n')) {
					System.out.println("Error, ingresa 's' o 'n'");
					i--;
				} else {
					obj.asignar(valor1,valor2);
					res = obj.valores();
					System.out.println(res);
				}
			}
			catch(IOException e){
				System.out.println("Error en la entrada de datos");
				i--;
				}
				
		}
		System.out.println("\n***Programa terminado***");
}
}

