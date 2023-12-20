/* Cargue un arreglo con n elementos y desplace sus elementos un lugar hacia su derecha,
teniendo en cuenta que el último componente se ha de desplazar al primer lugar. */
import java.io.*;
class EjemploProb523{
	private int x[]; // se crea el arreglo
	private int lim; 
	
	EjemploProb523(int limite){
		lim = limite;
		x = new int[lim]; // se declara la cantidad de elementos del arreglo
	}
	
	public int mostrar_arreglo(int i){
		return x[i];
	}
	
	void asignar(int dato, int i){
		x[i] = dato; 
	}
	
	public int derecha(int j){
		int ultimo = x[x.length-1];
		for(j = (x.length - 2); j >= 0; j--){
			x[j+1] = x[j];
		}
		x[0] = ultimo; 
		return x[j];
	}
}

public class Prob523{
	public static void main(String[] args){
		int derecha; 
		int i;
		int elemento; 
		int limite = 0;
		int dato = 0;
		boolean error;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			try{
				System.out.println("Ingresa la cantidad de elementos que va tener el arreglo: ");
				limite = Integer.parseInt(br.readLine());
				if(limite <= 0){
					System.out.println("Error, el limite debe ser positivo o no igual a 0");
					error = true;
				}else
					error = false;
			}catch(IOException e){
				System.out.println("Error en la entrada de datos");
				error = true;
			}catch(NumberFormatException e){
				System.out.println("Error en la conversión de datos");
				error = true; 
			}
		}while(error == true);
		
		EjemploProb523 obj = new EjemploProb523(limite);
		
		for(i = 0; i < limite; i++){
			try{
				System.out.println("Ingresa un dato de tipo entero: ");
				dato = Integer.parseInt(br.readLine());
				obj.asignar(dato,i);
			}catch(IOException e){
				System.out.println("Error en la entrada de datos");
				i--;
			}catch(NumberFormatException e){
				System.out.println("Error en la conversión de datos");
				i--;
			}
		}
		System.out.println("\nLos datos del arreglo x son: ");
		// cargar arreglo
		for(i = 0; i < limite ; i++){
			elemento = obj.mostrar_arreglo(i);
			System.out.print("\t"+elemento);
		}
		System.out.println("\nNuevo arreglo x: ");
		for(i = 0; i < limite; i++){
			System.out.println(obj.derecha(i)+"\t");	
		}
		
		
	
	}
}