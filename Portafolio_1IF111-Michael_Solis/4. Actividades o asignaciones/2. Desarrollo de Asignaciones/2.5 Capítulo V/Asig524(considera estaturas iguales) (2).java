import java.io.*;
class Asig524 {
	private static final int lim=5;
	private float [] x = new float [lim];

	void Asignar(float t, int i){
		x[i]=t;}
	
	float comparar(){
 		float mayor; 	
 		int  i;
 		mayor = x[0]; 
		for(i=1;i<lim;i++)
			if(x[i] >= mayor)
				mayor = x [i];
			
		return mayor;}
		
	int [] posicion(float mayor){
 		int p[]= new int[lim];
 		int c=-1, i;
 		for(i=0;i<lim;i++)
 			p[i]=-7;
 			
 		for(i=1;i<lim;i++)
			if(x[i] == mayor){
				c=c+1;
				p[c] = i;
				}
			
		return p;}
	float mostrar_elemento(int i){
	   	return x[i];}
    	
    int mostrar_lim(){
    	return lim;}	
}

class Estaturasp{
	public static void main(String[] args) {
 		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		Asig524 obj = new Asig524();
	
		int i=0;
		float esta=0.0f, mayor;
		boolean error;
	    int p[];
		System.out.println("Ingrese las 20 estaturas de los estudiantes");
		for(i=0;i<obj.mostrar_lim();i++){
	  	do{
			try{
         		System.out.print("x["+i+"]:");
         		esta=Float.parseFloat(br.readLine());
         		if(esta<=0){
         			System.out.println("\nLa estatura debe ser mayor a cero(0)."+"\n");
         			error=true;}
         		else
         			error=false;}
         			
        	catch(IOException y){  
         		System.out.println("\nError de E/S de datos"); 
         		System.out.println("El contenido de y: "+y+"\n"); error=true;}
         		
         	catch(NumberFormatException y){  
         		System.out.println("\nError en la conversion de datos");
         		System.out.println("El contenido de y:  "+y+"\n"); error=true;}
	  	}while(error==true);       
	  	
	  	obj.Asignar(esta,i); }
	  	
	  	
		mayor=obj.comparar(); 
		System.out.println("\nEl más alto de los estudiantes mide: "+
			               mayor);
	    p=obj.posicion(mayor);
		for(i=0;i<obj.mostrar_lim();i++)
			if (p[i] != -7)	 
	  	    System.out.println("\nSe encuentra en la posición: "+ p[i]); 
	  
 }
}