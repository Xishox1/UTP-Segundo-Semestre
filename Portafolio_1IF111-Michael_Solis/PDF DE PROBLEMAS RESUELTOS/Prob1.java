/* Cargue un arreglo con 6 elementos que contenga los n�meros pares desde el 2 hasta el 12 e
imprima sus elementos en forma vertical. */

// Programa secundario 
class EjemploProb1{
	// atributos
	private final int x[] = {2,4,6,8,10,12};
						//   0,1,2,3, 4, 5   <---- los ind�ces o posiciones del arreglo
	
	// m�todos 
	public int mostrando_valores(int i){
		return x[i];
	}
}

// Programa Principal
public class Prob1{
	public static void main(String[] args){
		EjemploProb1 obj = new EjemploProb1();
		int j; 
		System.out.println("Los elementos del arreglo x son: ");
		for(j = 0; j<6; j++){
			System.out.println("	x["+j+"] = "+obj.mostrando_valores(j)+"		");
		}
	}
}