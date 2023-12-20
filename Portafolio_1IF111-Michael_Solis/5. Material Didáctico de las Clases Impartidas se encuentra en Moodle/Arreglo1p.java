// ***********************************************************************************
//  Ejemplo de un arreglo inicializado con datos
//  Cargue un arreglo con los valores x = {1.85,  500.59,  3.56,  7.00,  1.90,  8.7}
//  imprima verticalmente el arreglo 
//  imprima el mayor elemento
//  Los elementos se retornan uno a uno al programa principal
// ***********************************************************************************
class Arreglo1
{
  private static final double  []  x = {1.85, 500.59,  3.56,  7.00,  1.90,  8.7 };

  double mayor()
  {
     double max;
     int i;
     max=x[0];
     for(i=1;i< 6 ;i++)
        if (x[i] > max)
             max = x[i];

     return max;
  }
   

   double mostrar_elemento(int i)
   {

    return x[i];
   }

 }

class Arreglo1p
{ public static void main(String []args)

  { Arreglo1 obj = new Arreglo1();
    int i;

    System.out.println ("Los elementos del arreglo x son:  ");
    for (i=0;i < 6;i++)
    	System.out.println ("    x["+i+"]= "+obj.mostrar_elemento(i)+"   ");


    System.out.println("\nEl elemento mayor es:  "+obj.mayor());

    
    }
}
