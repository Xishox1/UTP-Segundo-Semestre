/* Imprima la diagonal principal y la diagonal secundaria en una matriz. */

class EjemploBidi3{
	// Funcion que recibe un array de enterio y lo muestra por pantalla

     void visualizarArray(int[] pArray){
        for(int i=0;i<pArray.length;i++){
            System.out.print("\t" + pArray[i]);
        }
    }
 
    // Funcion que rellena la matriz 5x5 con numeros consecutivos
     void inicializar(int[][] pMatriz){
        int aux = 1;
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] = aux;
                aux++;
            }
        }
    }
 
    // Funcion que muestra el contenio del array 5x5
     void visualizarMatriz(int[][] pMatriz){
        System.out.println("\nArray 5x5");
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }
}

public class Bidi3 {
 
    public static void main(String[] args) {
    	EjemploBidi3 obj = new EjemploBidi3();
        int[][] matriz = new int[2][2];
        obj.inicializar(matriz);
        obj.visualizarMatriz(matriz);
        int[] diagoPrincipal = new int[matriz.length];
        int[] diagoSecundaria = new int[matriz.length];
 
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagoPrincipal[i] = matriz[i][j];
                }
 
                if(i+j == matriz.length-1){
                    diagoSecundaria[i] = matriz[i][j];
                }
            }
        }
        System.out.println("\nDiagonal Principal");
        obj.visualizarArray(diagoPrincipal);
 
        System.out.println("\n\nDiagonal Secundaria");
        obj.visualizarArray(diagoSecundaria);
 
        System.out.println("\n\n");
    }
}