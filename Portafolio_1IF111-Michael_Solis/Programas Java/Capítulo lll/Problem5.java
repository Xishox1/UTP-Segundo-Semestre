/* Escriba un programa que calcule la cantidad de sillas para un laboratorio que tiene
10 mesas y 4 máquinas por mesa.
La clase debe ser public para que pueda ser usada en cualquier paquete y los
métodos publicos.
Los datos de la clase deben ser private para darle mayor seguridad.
*/
import java.io.*;
class Silla{
	// Atributos o datos 
	private final int mesa = 10;
	private final int maquina = 4;
	
	
	// Métodos o acciones 
	public int calcular_sillas(){
		int multiplicacion;
		multiplicacion = mesa * maquina;
		return multiplicacion;
	}
}

// Clase Principal
public class Problem5{
	//int res; 
	//Silla obj = new Silla(); // Aplicando método constructor
	//res = obj.calcular_sillas();
	System.out.println("Hola");
}