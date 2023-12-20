// ************************************************************************
//   Declare y cree un arreglo x con 10 elementos y retorne todo el arreglo 
// ************************************************************************
class Arreglo4
{        
   double [] mostrar_arreglo( ) 
  {  double [] x = new double[10];  //declarando el arreglo x
     
      return x;} //se esta retornando el arreglo x
   }

class Arreglo4p
{   public static void main(String args[])
    {   int i;    	   
        Arreglo4 obj = new Arreglo4();
        
        double a[] ; //se declara un objeto con la capacidad de guardar una direccion de memoria
                     //que haga referencia a un vector unidimencional con datos enteros
           
         a = obj.mostrar_arreglo();
         System.out.println("Dirección de memoria donde está almacenado el vector "+a);
         for (i=0;i<= 9; i++)
              System.out.println(a[i]);
     } 
}