/* Cargue un arreglo con 6 elementos que contenga los números pares desde el 2 hasta el 12
 *e imprima sus elementos en forma vertical */
 class EjemploEz{
 	private final int [] numeros = {2,4,6,8,10,12};
 	
 	int mostrar(int i){
 		return numeros[i];
 	}
 }
 
 //Programa Principal
 public class Ez{
 	public static void main(String[] args){
 		EjemploEz obj = new EjemploEz();
 		int j;
 		System.out.println("Los elementos del arreglo nuemeros son: ");
 		for(j=0; j<6;j++)
 			System.out.println(obj.mostrar(j));
 	}
 }