/* Cargue un arreglo con n elementos y desplace sus elementos un lugar hacia su derecha,
teniendo en cuenta que el último componente se ha de desplazar al primer lugar. 
*/
import java.io.*;
class Arreglo3{
	private int x[];
	private int lim;
	
	Arreglo3(int limite){ // constructor
		lim = limite; 
		x = new int[lim]; // Crea el arreglo con limite cantidad de elementos
	}
	
	public void asignar(int dato, int i){
		x[i] = dato; 
	}
	
	public void desplazo(){
		int i, ultimo;
		// ultimo valor
		ultimo = x[lim-1];
		for(i = lim-1; i > 0; i--){
			x[i] = x[i-1];
		}
		x[0] = ultimo;
	}
	
	public int mostrando_valores(int i){
		return x[i];
	}
}

// Programa Principal
public class Resuelto3{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int dato;
		int limite = 0;
		
		boolean error;
		do{
			try{
				System.out.println("Entre la cantidad de elementos que encesita: ");
				limite = Integer.parseInt(br.readLine());
				if(limite <= 0){
					error = true;
					System.out.println("Error... la cantidad de elementos debe ser positovs o no igual a cero");
				} else {
					error = false;
				}
			}catch(IOException e){
				System.out.println("Error en la entrada de datos");
				error = true;
			}catch(NumberFormatException e){
				System.out.println("Error en la conversión de datos");
				error = true;
			}
		}while(error == true);
		
		Arreglo3 obj = new Arreglo3(limite);
		
		for(i = 0; i < limite; i++){
			try{
				System.out.println("Entre un numero de tipo entero: ");
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
		
		System.out.println("Los elementos del arreglo después de asignar: ");
		for(i = 0; i < limite; i++){
			System.out.print("\t"+obj.mostrando_valores(i)+"\t");
		}
		
		obj.desplazo();
		
		System.out.println("\nLos elementos del arreglo después de desplazar son: ");
		for(i = 0; i < limite; i++){
			System.out.print("\t"+obj.mostrando_valores(i)+"\t");
		}
	}
}
