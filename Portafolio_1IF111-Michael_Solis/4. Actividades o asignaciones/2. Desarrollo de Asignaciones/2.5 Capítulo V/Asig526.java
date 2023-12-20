import java.io.*;
class Asig56{
	private final int lim = 5;
	private float v[]= new float [lim];
	
	void asignar (int i,float a){
			v[i]=a;
		}
    int cant_elementos(){
        int i,j;
       int ct=0;	
       for(i=0;i<lim-1;i++)
     	  for(j=i+1;j<lim;j++)	
   	          if((v[i]+v[j])==75)
   	          	 ct++;
   	   return ct;}       	 
   	          	 
    float [][]Sumas75(int ct){
       float m[][] = new float [ct][2];
       int c=-1, i, j;	
       for(i=0;i<lim-1;i++)
     	  for(j=i+1;j<lim;j++)	
   	          if((v[i]+v[j])==75){
   	          	 c++;
   	          	 m[c][0]=v[i];
   	          	 m[c][1]=v[j];}
   	          	 
   	   return m;  	 
     }
   float mostrar(int a){
   	 return v[a];
   }
   int mostrar_lim(){
   	return lim;}	
 }


class Asig5_2_6 {
	public static void main ( String arg []){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Asig56 obj=new Asig56();
		float m[][];
	    int i=0,j=0;
	    float dat=0;
	    int ct;
        int lim=obj.mostrar_lim();  	
        for(i=0;i<lim;i++)	
     	  try{
     	    System.out.println("Tecle un numero.");
     	    dat=Float.parseFloat(br.readLine());
     	    obj.asignar(i,dat);}
     	  catch(IOException e){System.out.println("\nError al leer datos."+e);i--;}
     	  catch(NumberFormatException e){System.out.println("Error al convertir la lectura a Entero.");i--;}
     	
     	System.out.println("\nLos pares son: ");
     	ct=obj.cant_elementos();
     	m=obj.Sumas75(ct);
     	for(i=0;i< ct;i++)
     	    System.out.println("\n"+m[i][0]+" + "+ m[i][1]+" = 75");	
     		
     		
		}
}