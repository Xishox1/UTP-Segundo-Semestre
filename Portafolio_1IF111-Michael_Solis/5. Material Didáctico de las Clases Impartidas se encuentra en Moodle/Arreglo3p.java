// *************************************************
//   Cargue un arreglo con n cantidad de elementos e
//   imprima (verticalmente) despues de asignarle datos
//   imprima cuantos elementos tiene el arreglo 
//   imprima el mayor de sus elementos
// *************************************************
import java.io.*;
class Arreglo3
{
  private double x[];    // Declara el arreglo x
  
  private int lim;

  Arreglo3 (int limite)    //constructor
  { 
    lim=limite;
    x = new double[lim];} //Crea el arreglo con limite cantidad de elementos

  void asignar (double dato,int i)
  {  x[i]=dato;  }

  double mayor()
  {  double max;
     int i;
     max=x[0];
     for(i=1;i<lim;i++)
         if (x[i] > max)
             max = x[i];
     
     return max;
  }

  double mostrar_elemento(int i)
  {  return x[i];}

  int mostrar_longitud()
  { return x.length; }
 }

class Arreglo3p
{public static void main(String []args)  
 { BufferedReader br = new
   BufferedReader (new InputStreamReader (System.in));
   int i; 
   double dato;
   int limite=0;
   
   boolean error;
   do{
     try{   
       System.out.println("\n\n\nEntre la cantidad de elementos que necesita: ");
       limite=Integer.parseInt(br.readLine());
       if (limite <= 0){
           error=true;
           System.out.println("Error...la cantidad de elemetos debe ser positivo o y no cero");}
       else
       	   error= false;}
      catch(IOException e){
    	    System.out.print("\nError...de entrada de datos");
    	    error=true;
    	    } 
      catch(NumberFormatException e){
    	    System.out.print("\nError...de conversión de datos");
    	    error=true;
           }       	
     }while(error==true);
      	
   Arreglo3 obj = new Arreglo3 (limite);
  
   for(i=0;i<limite;i++)
     {try
             {
             System.out.println("\nEntre un numero de tipo double:");
             dato=Double.parseDouble(br.readLine());
             obj.asignar(dato,i);
      
             }
      catch(IOException e){
    	     System.out.print("\nError...de entrada de datos");
    	     i--;
          } 
      catch(NumberFormatException e){
    	      System.out.print("\nError...de conversión de datos");
    	      i--;
           }
         
     } 
     	  
     System.out.println("\n\nLos elementos del arreglo despues de asignar\n");
     for(i=0;i<limite;i++)
          System.out.println(obj.mostrar_elemento(i));

     System.out.println("\n\nLongitud fisica del arreglo temp    "+
                          obj.mostrar_longitud()+"   elementos");

     System.out.println("\n\nEl elemento mayor es:  "+obj.mayor()); 
    
      }
      
   }    
   
   
  
