/* Dado un vector A de 50 números reales, obténgase la diferencia más grande
 *entre dos elementos consecutivos de este vector */
 
import java.io.*;

class Diferencia{
	private static final int ce = 5; 
	private int numreal[] = new int [ce];
	
	public void asignar(int temp, int i){
		numreal[i] = temp;
	}
	
	public int get_numreal(int i){
		return numreal[i];
	}
	
	public int difmayor(){
		int dif2, max =  numreal[0] - numreal[1];  
		int i;
 
											
		for(i = 1; i < ce-1; i++){
			dif2 = (numreal[i] - numreal[i+1]);
			if(dif2 > max)
				max = dif2; 
		}
		return max; 
	}
	
	public int cantidad_e(){
		return ce; 
	}
}


// Clase Principal
public class Prob5{
	public static void main(String[] args){
		int i;
		// Objeto de lectura
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		// arreglo
		int numerall;
		// Objeto
		Diferencia dif = new Diferencia();
		// genera 50 valores enteros
		for(i = 0; i < dif.cantidad_e(); i++){
			try{
				System.out.println("Lectura #"+(i+1)+": ");
				numerall = Integer.parseInt(leer.readLine());
				dif.asignar(numerall,i);
			} catch(IOException e){
				i--;
			}catch(NumberFormatException e){
				i--;
			}
		}
		
		// Impresión de Diferencia mayor(DISTANCIA ENTRE VALORES)
		System.out.println("\nDiferencia mayor: "+dif.difmayor());
	}
}