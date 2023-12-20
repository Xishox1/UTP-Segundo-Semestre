import java.io.*;
class Diagonal{
	private float m[][];  // declaras
	private int lim;
	
	
	Diagonal(int limite){// constructor
		lim = limite;  
		m = new float[lim][lim];
	}
	
	void asignar(float d, int i, int j){
		m[i][j] = d;
	}
	
	float []diagonal_p(){
		float x[] = new float[lim];
		for(int i = 0; i < lim; i++){
			x[i] = m[i][i];
		}
		return x; 
	}
	
	float []diagonal_s(){
		int j = lim;
		float x[] =  new float[lim];
		for(int i = 0; i < lim; i++){
				j = j-1;
				x[i] = m[i][j];
		}
		return x; 
	}
	
	public int retornarlim(){
		return lim; 
	}
}

class Diagonalp{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int limite = 0;
		boolean error = false; 
		float x[];
		float dt;
		int i,j;
		do{
			try{
				System.out.println("Ingrese Lim");
				limite = Integer.parseInt(br.readLine());
				if(limite > 1)
					error = false; 
				else{
					error = true;
					System.out.println("Error, la cantidad de filas y columna debe ser mayor que 1");
					}
						
				}catch(IOException e){
					System.out.println("Error"+e);
					error = true;
					}
		}while(error == true);
		
		Diagonal obj = new Diagonal(limite);
		for(i = 0; i < obj.retornarlim(); i++){
			for(j = 0; j < obj.retornarlim() ; j++){
				try{
					System.out.println("Ingrese elementos del arreglo");
					dt = Float.parseFloat(br.readLine());
					obj.asignar(dt,i,j);
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					j--;
				}
			}
		}
		x = obj.diagonal_p();
		System.out.println("Elementos de la diagonal principal: ");
		for(i = 0; i < obj.retornarlim(); i++){
			System.out.print(x[i]+"  ");
		}
		x = obj.diagonal_s();
		System.out.println();
		System.out.println("\nElementos de la diagonal secundaria");
			for(i = 0; i < obj.retornarlim(); i++){
				System.out.print(x[i]+"  ");
			}
	}
}
