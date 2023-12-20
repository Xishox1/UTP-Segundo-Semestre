/* Elabore un programa Java empleando la metodología POO que lea un número
 *cualquiera mientras el usuario lo desee y calcule e imprime el %
 *La clase debe ser public para que pueda ser usada 
 *en cualquier paquete y los métodos públicos.
 *Los datos de la clase deben ser private para darle mayor seguridad.
 *Utilizar try y catch apra controlar excepciones. */

import java.io.*;
class Algo {
	private float numero;
	
	public void asignar(float a){
		numero = a;
	}
	
	public float calcular_num(){
		float nuevo;
		nuevo = numero / 100;
		return nuevo;
	}
	
}

public class Problem{
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String cadena; 
		char resp;
		float num1,f;
		Algo obj = new Algo();
		resp = 's';

		while(resp == 's'){
		
		try {
        System.out.println("Introduzca un número");
        cadena = br.readLine();

        num1 = Float.parseFloat (cadena);
        
        
        obj.asignar(num1);
        f = obj.calcular_num();
        System.out.println("La respuesta del número en porcentaje es: " +f+"%");
        
        
     }
     	
     
     catch(IOException e) {  System.out.print("Error...en la Entrada de datos, con el método readLine" +"\n\n"); }
     catch(NumberFormatException e) {  System.out.print("Error...conversion de tipo de dato" +"\n\n"); }
  
  		System.out.print("\n¿Desea Continuar? Escriba s para confirmar o n para terminar el programa.\n");
		resp = (char)br.read();
		br.skip(1);
}
}
}

