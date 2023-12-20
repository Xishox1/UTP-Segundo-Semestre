
import java.io.*;
class Simetria{
	private float m[][];
	private int lim;
	
	Simetria (int l){
		lim=l;
		m=new float [lim][lim];
	}
	
	void asignar (float val, int i, int j){
		m[i][j]=val;
	}
	String determinar_simetria(){
	  int i, j;
	  boolean sime=true;
	  for (i=0;i<lim;i++)
	  	 for (j=0;j<lim;j++){
			 if (!(m[i][j]== m[j][i])){
				sime=false;
				j=lim+1;
				i=lim+1;}
	  	 }	
		if (sime==true)
			return "Es simetrica";
		else
			return "No es simetrica";
	}
	float mostrar_elemento(int i, int j){
		return m[i][j];
	}
}

class Matriz{

	public static void main (String [] args){
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		int lim=0,i,j;
		float val;
		boolean error;
		
		do{
			try{
				System.out.println("Entre el tama?o de la matriz:");
				lim=Integer.parseInt(br.readLine());
				if (lim<0){
					error=true;
					System.out.println("Error. La cantidad de elementos no puede ser negativo");
				}
				else
					error=false;
			}
			catch (IOException exc){
				System.out.println ("Error en la entrada " +exc);
				error=true;
			}
			catch (NumberFormatException exc){
				System.out.println("Error en la conversion de datos: "+exc);
				error=true;
			}
		}while (error==true);
		
		Simetria obj=new Simetria(lim);
		
		for (i=0;i<lim;i++){
			for (j=0;j<lim;j++){
				try{
					System.out.println("Ingrese un valor: ");
					val=Float.parseFloat(br.readLine());
					obj.asignar(val,i,j);
				}
				catch (IOException exc){
					System.out.println ("Error en la entrada " +exc);
					j--;
				}
				catch (NumberFormatException exc){
					System.out.println("Error en la conversion de datos: "+exc);
					j--;
				}
			}
		}
		
		for (i=0;i<lim;i++){
			for (j=0;j<lim;j++)
				System.out.print(obj.mostrar_elemento(i,j)+"\t\t");
				
			System.out.println("\n");} 
				
		System.out.println ("La Matriz " +obj.determinar_simetria());
	}
}