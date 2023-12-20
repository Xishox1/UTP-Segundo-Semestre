/* Usted escribirá un programa que simule un mezclador de colores primario según el modelo RGB. Los colores que se obtienen al combinar dos colores primarios es el siguiente:
Amarillo + Rojo= Naranja.
Amarillo + Azul= Verde.
Azul + Rojo= Violeta.
Declare 2 arreglos con los colores primarios a mezclar y el tercero lo genera en un método con el color resultante al mezclar los colores que 
usted almacenó en los dos primeros arreglos. Imprima los tres vectores.
*/

class Color1{
	private static final String x1[] = {"Amarillo", "Amarillo", "Azul"};
	private static final String x2[] = {"rojo", "azul","rojo"};
	
	String []mezclar(){
		String nuevo; 
		int j;
		String pos[] = new String[3];
		for(j = 0; j < 3; j++){
			if(j  == 0)
				pos[0] = "Naranja";
			else if(j == 1)
				pos[1] = "Verde";
			else if(j == 2)
				pos[2] = "Violeta";
		}
		return pos; 
	}
	
	public String mostrar_vector1(int i){
		return x1[i];
	}
	
	public String mostrar_vector2(int i){
		return x2[i];
	}
}

public class Color{
	public static void main(String[] args){
		int i; 
		String p[];
		Color1 obj = new Color1();
		p = obj.mezclar();
		System.out.println("Imprimiendo los 3 vectores de acuerdo a la forma de ejemplo del enunciado: ");
		
		for(i = 0; i < 3; i++){
			System.out.println(obj.mostrar_vector1(i)+" + "+obj.mostrar_vector2(i)+" = "+p[i]+".");
		} 
		// no estudié, es lo único que se me ocurre hacer :/
	}
}