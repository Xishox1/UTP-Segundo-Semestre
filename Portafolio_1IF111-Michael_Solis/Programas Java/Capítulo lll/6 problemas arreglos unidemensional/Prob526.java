/* Escriba una aplicación que lea 25 números n1, n2, ..., n25 e imprimir en líneas separadas
cada par de números cuya suma sea 75. */
import java.io.*;
class Arreglo5{
	private int x[] = new int[5]; // declare y cree el arreglo x
	
	void asignar(int i, int dato){
		x[i] = dato;
	}
	
	public int mostrar_datos(int i){
		return x[i];
	}
	

}
class Prob526{
	public static void main(String[] args){
		int i, dato;
		Arreglo5 obj = new Arreglo5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(i = 0; i < 5; i++){
			try{
				System.out.println("Ingresa un dato de tipo entero: ");
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
		
		for(i = 1; i < 5; i++){
			System.out.println("x["+(i-1)+"] + x["+(i)+"] = "+(obj.mostrar_datos(i-1)+obj.mostrar_datos(i)));
		}
	}
}