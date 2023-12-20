/* Dado un vector A de 50 n�meros reales, obt�ngase la diferencia m�s grande entre dos
elementos consecutivos de este vector */
import java.io.*;
class Hola{
	private int x[] = new int[5];
	
	// metodos
	void asignar(int dato, int i){
		x[i] = dato;
	}
	
	public int dos_elementos(int i){
		int novo = 0;
		if(x[i] > x[i+1])
			novo = x[i] - x[i+1];
		return novo;
	}
	
}

public class Prob525{
	public static void main(String[] args){
		int i;
		int numero;
		Hola obj = new Hola();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(i = 0; i < 5; i++){
			try{
				System.out.println("Ingresa un numero de tipo entero: ");
				numero = Integer.parseInt(br.readLine());
				obj.asignar(numero,i);
			}catch(IOException e){
				System.out.println("Error en la entrada de datos");
				i--;
			}catch(NumberFormatException e){
				System.out.println("Error en la conversi�n de datos");
				i--;
			}
		}
		for(i = 0; i < 5; i++){
			System.out.println(obj.dos_elementos(i));
		}
	}
}


