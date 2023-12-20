/* Dado un vector con las estaturas de 20 estudiantes identifique la estatura del más alto y en
qué posición del vector se encuentra. Contemplar estaturas iguales , el valor igual debe imprimir cantidad que se repiten y la posición de las repeticiones */
import java.io.*;
class Hola{
	// atributos
	private final int ce = 4;
	private double x[] = new double[ce]; // declaré el arreglo
	
	// métodos
	void asignar(double dato, int i){
		x[i] = dato;
	}
	
	public int posicion(){
		int pos = 0;
		double max;
		int cont = 0; 
		int i;
		max = x[0];
		for(i=1; i<ce;i++){
			if(x[i] > max){
				max = x[i];
				pos = i;	
			} else if(x[i] == max) {
				cont = cont + 1;
			}
		}
		return pos;
	}
	
	public double mayor(int pos){
		return x[pos];
	}
	
	public int valor_igual(){
		int pos = 0,cac = 0;
		double max;
		int cont = 0; 
		int i;
		max = x[0];
		for(i=1; i<ce;i++){
			if(x[i] > max){
				max = x[i];
				pos = i;	
			} else if(x[i] == max) {
				cac = i;
				cont = cont + 1;
			}
		}
		return cac;
	}
	
	public int contando(int cont61){
		int pos = 0,cac = 0;
		double max;
		int i;
		int cont = cont61; 
		max = x[0];
		for(i=1; i<ce;i++){
			if(x[i] > max){
				max = x[i];
				pos = i;	
			} else if(x[i] == max) {
				cac = i;
				cont = cont + 1;
			}
		}
		return cont;
	}
	
	
	public int cantidad_elementos(){
		return ce; 
	}
	
}

class Reto{
	public static void main(String[] args){
		int i,dato = 0,pos;
		double altura;
		int cont61 = 1;
		boolean error = true;
		Hola obj = new Hola();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			for(i=0; i<obj.cantidad_elementos(); i++){
			try{
				System.out.println("Ingresa tu altura");
				altura = Double.parseDouble(br.readLine());
				if(altura <= 0 || altura >= 2.5){
					System.out.println("Error la altura no puede ser menor o igual a 0 o mayor a 2.5");
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
		System.out.println("Las veces que se repiten son: "+obj.contando(cont61));
	}
}
