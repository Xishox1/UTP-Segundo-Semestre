class Diagonales{
	private int [][] matriz = {{2,4,4,3},{6,6,9,4},{1,3,8,5},{7,9,8,5}};
	
	public int [][] dPrincipal(){
		int [][] x = new int[4][4];
		int i,j;
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				if (i==j)
					x[i][j]=matriz[i][j];
			}
		}
		return x;	
	}
	
	public int [][] dSecundaria(){
		int [][] x = new int[4][4];
		int i,j;
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				if ((i+j)==3)
					x[i][j]=matriz[i][j];
			}
			
		}
		return x;	
	}
	
}

public class Asignacion534 {
 
    public static void main(String[] args) {
        Diagonales obj = new Diagonales();
        int i,j;
        int [][] matriz = new int[3][3];
        
  		System.out.println("Diagonal Principal \n");
  		matriz=obj.dPrincipal();
        for(i=0;i<4;i++){
        	for(j=0;j<4;j++){
				System.out.print( matriz[i][j]);
				}
        	System.out.println();
    	}
    	
    	System.out.println("\nDiagonal Secundaria \n");
    	matriz=obj.dSecundaria();
        for(i=0;i<4;i++){
        	for(j=0;j<4;j++){
				System.out.print( matriz[i][j]);
				}
        	System.out.println();
    	}
    }
}
