/* Programa que carga una matriz de 5 filas y 10 columnas con números enteros e imprime el
máximo y las posiciones de la matriz donde fue encontrado.
Desarrolle el programa pensando que no van a existir valores iguales.
*/
import java.io.*;
class EjemploBidi2{
	private static final int ce1 = 5,ce2=10;
	private int x[][] = new int[ce1][ce2];
	
	//método
	void asignar(int i, int j, int dato){
		x[i][j] = dato;
	}
	
	public int mayor(int one, int two){
		return x[one][two]; 
	}
	
	public int ii(){
		int i,j,f = 0; 
		int max = x[0][0];
		for(i = 0; i < ce1; i++){
			for(j = 0; j < ce2; j++){
				if(x[i][j] > max){
						max = x[i][j];
					f = i;
				} 
			}
		}
		return f; 
	}
	
	public int jj(){
		int i,j,f = 0; 
		int max = x[0][0];
		for(i = 0; i < ce1; i++){
			for(j = 0; j < ce2; j++){
				if(x[i][j] > max){
					max = x[i][j];
					f = j; 
				}	
			}
		}
		return f; 
	}
	
	public int cant_ce1(){
		return ce1;
	}
	
	public int cant_ce2(){
		return ce2;
	}
}

public class Bidi2{
	public static void main(String[] args){
		int i,j; 
		int dato; 
		int one, two; 
		EjemploBidi2 obj = new EjemploBidi2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(i = 0; i < obj.cant_ce1(); i++){
			for(j = 0; j < obj.cant_ce2(); j++){
				try{
					System.out.println("Ingresa un número de tipo (entero): ");
					dato = Integer.parseInt(br.readLine());
					obj.asignar(i,j,dato);
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					i--;
				}catch(NumberFormatException e){
					System.out.println("Error en la conversión de datos");
					i--;
				}
			}
		}
		one = obj.ii();
		two = obj.jj();
		System.out.println("El número mayor es: "+obj.mayor(one,two));
		System.out.println("Matriz en la posición: ["+one+"]["+two+"]");
	}
}