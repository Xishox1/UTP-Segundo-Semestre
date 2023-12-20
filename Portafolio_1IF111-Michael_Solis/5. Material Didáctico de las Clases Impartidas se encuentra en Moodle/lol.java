/*Se trabaja con un men?
  Permite corregir inmediatamente
  se controlan errores de excepciones y error de validaci?n de datos*/
import java.io.*;
class Potencia {
  private float n;
   
  void asignar(float nn) {
	   n=nn;
    }
  double calcular_cua(){
   	   return Math.pow(n,2);}
   		
  double calcular_cub(){
	   return Math.pow(n,3);}
}
class Menu{
 public static void main(String[] args) {
   //Bloque de declaraciones
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	Potencia o= new Potencia();
	int opcion=0,num=0;
	boolean error;
	do{
	  do{
		try{
			System.out.println("MENU");
			System.out.println("Elija una de las siguiente opciones: ");
			System.out.println("1. Elevar al Cuadrado");
			System.out.println("2. Elevar al Cubo");
			System.out.println("3. Salir");
			opcion= Integer.parseInt(br.readLine());
			if(opcion==1||opcion==2||opcion==3)//validaci?n de datos
				error=false;
			else
				error=true;
				
		}
		catch(IOException e){
			System.out.println("Error... en la entrada de datos \n"+e);
			error=true;
		}
		catch(NumberFormatException e){
			System.out.println("Error... de conversion de datos \n"+e);
			error=true;
		}
	}while(error==true);
	
    if (opcion == 1 || opcion == 2){
  	   do{
	     try{
	  	   System.out.print("Ingrese un Numero:");
		   num=Integer.parseInt(br.readLine());
		   error=false;
		   }
	     catch(Exception f){
		   System.out.println("Error Entrada o Conversion \n"+f);
		   error=true;
		   }
	    }while(error==true);
	
	    o.asignar(num);
	    if (opcion == 1)
		    System.out.println("El cuadrado del n?mero es : "+o.calcular_cua());
	    else
		     System.out.println("El cubo del n?meros es : "+o.calcular_cub());
    }	     
  }while(opcion!=3);
 }
}