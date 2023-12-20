import java.io.*;
class Mayor{
	private final int filas = 2;
	private final int columnas = 2;
	private int numeros[][] = new int[filas][columnas];
	
	public void asignar(int i, int j, int num){
		numeros[i][j] = num;
	}
	
	public int []posicionmayor(){
		int mayor;
		int fila = 0;
		int columna = 0;
		mayor = numeros[0][0];
		for(int i = 0; i < numeros.length; i++){
			for(int j = 0; j < numeros[0].length; j++){
				if(numeros[i][j] > mayor){
					mayor = numeros[i][j];
					fila = i;
					columna= j; 
				}
			}
		}
		int mayorp[] = {fila,columna};
		return mayorp;
	}
	
	public int cf(){
		return filas;
	}
	
	public int cc(){
		return columnas;
	}
	
	public int [][]matriz(){
		return numeros; 
	}
}

public class Mayorp{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Mayor obj = new Mayor();
		int numero;
		int numeros[][];
		int p[];
		for(int i = 0; i < obj.cf(); i++){
			for(int j = 0; j < obj.cc(); j++){
				try{
					System.out.println("Escriba un número entero: ");
					numero = Integer.parseInt(br.readLine());
					obj.asignar(i,j,numero);
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					j--;
				}catch(NumberFormatException e){
					System.out.println("Error en la conversión de datos");
					j--;
				}
			}
		}
		numeros = obj.matriz();
		System.out.println("Los elementos ingresados fueron: ");
		for(int i = 0; i < obj.cf(); i++){
			for(int j = 0; j < obj.cc(); j++){
				System.out.println("\t["+i+"]"+"["+j+"] = "+numeros[i][j]);
			}
		}
		p = obj.posicionmayor();
		System.out.println("El numero mayor es: "+numeros[p[0]][p[1]]);
		System.out.println("La posición del mayor es: "+"["+p[0]+"]"+"["+p[1]+"]");
		
	}
}
