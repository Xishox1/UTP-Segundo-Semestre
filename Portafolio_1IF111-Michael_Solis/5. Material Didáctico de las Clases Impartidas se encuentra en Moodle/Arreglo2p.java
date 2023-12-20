//Cargue un arreglo de 10 elementos con el numero 3 en todos sus elementos 
//imprima (horizontalmente)el arreglo una vez se crea
//imprima (verticalmente) el arreglo despues de cargarlo  

class Arreglo2
{
  	private int x []=  new int[10];  // Define el arreglo como atributo de la clase

    //Retorna un elemento del arreglo
    int mostrar_elemento(int i)
    {  return x[i];    }

    void asignar (int i)
    { x[i] = 3;  }
  }

class Arreglo2p
{  	public static void main(String []args)
   {   Arreglo2 obj = new Arreglo2();
      
  	   int ip, elemento;

  	   //Imprime horizontalmente todos los elementos del arreglo  	  
  	   System.out.println ("elementos del arreglo una vez se crea");
  	   for (ip=0; ip<10; ip=ip+1)
  	   {  elemento = obj.mostrar_elemento(ip);
  	     System.out.print(elemento+ "\t" );     }

  	   //Carga el arreglo, asignandole el número 3 a
  	   //todos sus elementos
  	    for (ip=0; ip<10; ip=ip+1)
  	         obj.asignar(ip); 

  	   //Imprime verticalmente todos los elementos del arreglo
  	   System.out.println ("\nElementos del arreglo despues de la carga con el valor de 3");
  	   for (ip=0; ip<10; ip=ip+1)
  	   { elemento = obj.mostrar_elemento(ip);
  	     System.out.println(elemento);    }
   }
 }