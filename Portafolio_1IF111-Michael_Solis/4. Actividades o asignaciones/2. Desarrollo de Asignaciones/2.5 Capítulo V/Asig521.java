class Arreglo1{
  private static final int  []  x = {2,4,6,8,10,12};

  int mostrar_elemento(int i){
      return x[i];}
 }

class Asig521
{ public static void main(String args[])
  { Arreglo1 obj = new Arreglo1();
    int i;

    System.out.println ("Los elementos del arreglo x son:  ");
    for (i=0;i < 6;i++)
    	System.out.println (+obj.mostrar_elemento(i)+ "   ");
    }
}