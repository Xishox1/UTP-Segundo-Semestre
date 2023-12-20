/* Dado un vector con las estaturas de 20 estudiantes identifique la estatura del más alto y en qué posición del vector se encuentra. 
*/
import java.io.*;
class Any{
	private static final int ce = 5; 
	private double x[] = new double[ce];
	
	void asignar(double dato, int i){
		x[i] = dato;
	}
	
	double mayor(){
		double max;
		int i; 
		max = x[0];
		for(i = 0; i < ce; i++)
			if(x[i] > max)
				max = x[i];
		return max;
	}
	
	int []posicion(double maximo){
		int j;
		int pos[] = new int[ce];
		for(j = 0; j < ce; j++){
			if(x[j] == maximo)
			pos[j] = j+1;
		}
		return pos;	
	}
	
	double mostrar_elemento(int i){
		return x[i];
	}
	
	public int mostrar_ce(){
		return ce; 
	}
}

class Estaturap{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Any obj = new Any();
		int i, sum, p[];
		double maximo, dato;
		System.out.println("Estatura de 20 estudiantes \n");
		System.out.println("Las estaturas deben ser ingresadas en metros por ejemplo: 1.87\n");
		for(i = 0; i < obj.mostrar_ce(); i++){
			try{
				System.out.println("Ingresa la estatura del estudiante "+(i+1)+": ");
				dato = Double.parseDouble(br.readLine());
					if((dato < 1) || (dato > 2)){
						System.out.print("Ingrese una altura entre 1 y 2 metros. Intente de nuevo\n");
						i--;
				} else 
					obj.asignar(dato,i);
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					i--;
				}catch(NumberFormatException e){
					System.out.println("Error en la conversión de datos");
					i--;
				}
			}
		
		System.out.println("Lista de las estaturas ingresadas");
		for(i = 0; i < obj.mostrar_ce(); i++){
			System.out.println("Estudiante"+i+" = "+obj.mostrar_elemento(i));
		}
		maximo = obj.mayor();
		p = obj.posicion(maximo);
		System.out.println("La mayor estatura entre los 20 estudiantes es de: "+maximo);
		System.out.println("Se encuentra en la(s) posición(es) del vector: ");
		for(int k = 0; k < obj.mostrar_ce(); k++)
			if(p[k] != 0){
				sum = p[k];
				sum = sum-1;
				System.out.println("["+sum+"]");
			}
	}
}
