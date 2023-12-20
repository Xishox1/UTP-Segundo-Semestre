
import java.io.*;
class Dif{
	private final static int limit=5;
	private int A[]= new int [limit];
	
	void asignar(int arreglo, int i){
		A[i]=arreglo;}
		
	int calcular_dif(){
		int redif;
		int i;
		int resp;
		resp= A[0]-A[1];
		for (i=1;i<=limit-2;i++){
			redif=A[i]- A[i+1];
			if (redif>resp)
			  resp=redif;}
			
		return resp;}
	

	int mostrar_arreglo(int i){
		return A[i];}
	
	int mostrar_limit(){
		return limit;}
}
class Difp{
	public static void main(String[] args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Dif obj= new Dif();
		int arreglo,result,i=0;
		int limite=obj.mostrar_limit();
		
		
		for(i=0;i<limite;i++){
		  try{	
		   System.out.println("Ingrese un numero por favor");
		   arreglo=Integer.parseInt(br.readLine());
		   obj.asignar(arreglo,i);}
		  catch(IOException x){
		   System.out.println("Error en la entrada de datos"+x);
	       i--;}
		catch(NumberFormatException x){
		  System.out.println("Error en la conversión de datos, el dato introducido no es el permitido"+x);
		  i--;}
		}
		result=obj.calcular_dif();
		System.out.println("La mayor diferencia es: "+result);
}}