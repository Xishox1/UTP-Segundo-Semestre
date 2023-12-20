/* Dado un vector con las estaturas de 20 estudiantes identifique la estatura del más alto y en
qué posición del vector se encuentra. */
import java.io.*;
class Hola{
	// atributos
	private final int ce = 3;
	private double x[] = new double[ce]; // declaré el arreglo
	
	// métodos
	void asignar(double dato, int i){
		x[i] = dato;
	}
	
	public int posicion(){
		int pos = 0;
		double max;
		int i;
		max = x[0];
		for(i=1; i<ce;i++){
			if(x[i] > max){
				max = x[i];
				pos = i;	
			}	
		}
		return pos;
	}
	
	public double mayor(int pos){
		return x[pos];
	}
	
	public int cantidad_elementos(){
		return ce; 
	}
}

public class Resuelto4{
	public static void main(String[] args){
		int i,dato = 0,pos;
		double altura;
		boolean error = true;
		Hola obj = new Hola();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			for(i=0; i<obj.cantidad_elementos(); i++){
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
		pos = obj.posicion();
		System.out.println("La estatura más alta es: "+obj.mayor(pos));
		System.out.println("La posición del vector es: "+pos);
	}
}
