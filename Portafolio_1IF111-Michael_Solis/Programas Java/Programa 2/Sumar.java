/* Elabore un programa Java empleando la metodología POO que dado 2 números permita calcular e imprimir la suma y el promedio.   
La clase debe ser public para que pueda ser usada en cualquier paquete y los métodos publicos. 
Los datos de la clase deben ser private para darle mayor seguridad. 
*/
class Suma{
	private float num1;
	private float num2;
	
	public void asignar(float a, float b){
		num1 = a;
		num2 = b;
	}
	
	public float sumar(){
		float suma;
		suma = num1 + num2;
		return suma;
	}
	
	public float calcularPromedio(){
		float prom;
		prom = sumar()/2;
		return prom;
	}

}
// Programa Principal
public class Sumar{
	public static void main(String[] args){
		float res,summ;
		// Se crea el objeto
		Suma nuevo = new Suma();
		// Se asignan los valores o números
		nuevo.asignar(1,2);
		res = nuevo.calcularPromedio();
		summ = nuevo.sumar();
		System.out.println("El resultado de la suma es: "+summ+"\nEl promedio de la suma es: "+res);
	}// Fin del método main
}// Fin de la clase Sumar