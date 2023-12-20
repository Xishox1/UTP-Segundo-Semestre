/* Cargue un arreglo con n elementos y desplace sus elementos un lugar hacia su derecha,
teniendo en cuenta que el último componente se ha de desplazar al primer lugar. */
import java.io.*;
class EjemploProb2{
	// atributos 
	private int x[];
	int lim; 
		
	// métodos
	EjemploProb2(int limite){ // está construyendo
		lim = limite;
		x = new int[lim];
	}
	
	public int mostrando_valores(int i){
		return x[i];
	}
	
	void asignar(int i, int dato){
		x[i] = dato;
	}
	
	public int valor(int limite){
		int limitt;
		limitt = limite - 1;  //guardando el último elemento
		x[0] = x[limitt];
		return x[0];
	}
	
	//correr a la derecha
	public int metodo(int i){ 
		 return x[i+1] = x[i];
		
		/////x[1] = x[0]
	}
	
}

public class Prob2{
	public static void main(String[] args){
		int i, limite = 0,dato,cap;
		boolean error; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
		try{
			System.out.println("Ingresa la cantidad de elementos del arreglo: ");
			limite = Integer.parseInt(br.readLine());
			if(limite <= 0){
				System.out.println("Error, no se permite un numero igual o menor a cero");
				error = true;
			} else 
				error = false;
			}catch(IOException e){
				System.out.println("Error en la entrada de datos");
				error = true;
			}catch(NumberFormatException e){
				System.out.println("Error en la conversión de datos");
				error = true;
			}
		}while(error == true);
		
			EjemploProb2 obj = new EjemploProb2(limite); // objeto
			
			for(i = 0; i<limite; i++){
				try{
					System.out.println("Ingresa un numero de tipo entero: ");
					dato = Integer.parseInt(br.readLine());
					obj.asignar(i,dato);
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					i--;
				}catch(NumberFormatException e){
					System.out.println("Error en la conversión de datos");
					i--;
				}
			}
			  // el último quedó de primero
			obj.valor(limite);
			for(i=limite-2; i>=0;i--){
				obj.metodo(i);
			}
		  
			
		
			for(i = 0; i<limite; i++){
				System.out.print("\n"+obj.mostrando_valores(i)+"\t");
				
			}
			System.out.print("\n\n 7 9 8");
			
	}
}
