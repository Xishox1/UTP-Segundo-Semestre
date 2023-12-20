/* Dado un vector con las estaturas de 20 estudiantes identifique la estatura del más alto y en
qué posición del vector se encuentra. */
import java.io.*;
class Hola{
	// atributos
	private double x[] = new double[20]; // declaré el arreglo
	
	// métodos
	void asignar(double dato, int i){
		x[i] = dato;
	}
	
	public double mayor(){
		double max;
		int i;
		max = x[0];
		for(i=0; i<20;i++){
			if(x[i] > max)
				max = x[i];
		}
		return max;
	}
	
	public int posicion(){
		int pos = 0;
		double max;
		int i;
		max = x[0];
		for(i=0; i<20;i++){
			if(x[i] > max)
				max = x[i];
				pos = i;
		}
		return pos;
	}
}

public class Prob524{
	public static void main(String[] args){
		int i,dato = 0;
		double altura;
		boolean error = true;
		Hola obj = new Hola();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			for(i=0; i<20; i++){
			try{
				System.out.println("Ingresa tu altura");
				altura = Double.parseDouble(br.readLine());
				if(altura <= 0){
					System.out.println("Error la altura no puede ser menor o igual a 0");
					error = true;
					i--;
				}else 
					obj.asignar(altura,i);
					error = false;
			}catch(IOException e){
				System.out.println("Error en la entrada de datos");
				error = true;
				i--;
			}catch(NumberFormatException e){
				System.out.println("Error en la conversión de datos");
				error = true;
				i--;
			}
			}
		}while(error == true);
		System.out.println("La estatura más alta es: "+obj.mayor());
		System.out.println("La posición del vector es: "+obj.posicion());
	}
}
