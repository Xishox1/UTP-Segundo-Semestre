/* Cargar una matriz cuadrada de 25 elementos sólo con el marco de asteriscos. */

class EjemploBidi1{
	// creando el arreglo con 25 elementos
	private char x[][] = new char[5][5];
	
	// métodos
	
	public void asignar(int i, int j){
		x[i][j] = '*';

	}
	
	public char mostrar(int i, int j){
		return x[i][j];
	}
	
}

public class Bidi1{
	public static void main(String[] args){
		EjemploBidi1 obj = new EjemploBidi1();
		int i,j;
		
		for(i = 0; i < 5; i++){
			for(j = 0; j < 5; j++){
				obj.asignar(i,j);
			}
		}
		
		// Top side
		for(i = 0; i < 1; i++){
			for(j = 0; j < 5; j++){
				System.out.print(obj.mostrar(i,j));
			}
			
			System.out.println();
			// center
			for(i = 0; i < 1; i++){
				for(j = 0; j < 3; j++){
						System.out.println(obj.mostrar(i,j)+"   "+obj.mostrar(i,j));
				}
			
			}
			
			
			// bottom side
			for(i = 0; i < 1; i++){
				for(j = 0; j < 5; j++){
					System.out.print(obj.mostrar(i,j));
				}
			}
			
		}
		
		
	}
}