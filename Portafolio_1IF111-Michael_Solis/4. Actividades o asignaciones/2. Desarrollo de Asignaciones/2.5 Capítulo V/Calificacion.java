/*Una señora requiere un programa que le permita conocer cómo califican los 
 * clientes la comida de un pequeño restaurante que tiene en su barrio. 
 * Para esto se definió una escala de 1 a 5 (1 denota horrible, 2 regular, 3 
 * buena y 4 denota excelente). El programa debe ser capaz capturar la calificación 
 * de cualquier número de clientes mientras el usuario lo desee. El programa deberá 
 * mostrar en su salida cuántos clientes fueron encuestados en total, así como el 
 * resumen de la encuesta con histograma como se muestra a continuación:*/
import java.io.*;

class Cali {
	private int [] val = new int [4];
	
	public void asignarVal(int cal) {
		if (cal == 1)
			val[0] = val[0] + 1;
			else 
				if (cal == 2)
					val[1] = val[1] + 1;
				else 
					if (cal == 3)
						val[2] = val[2] + 1;
					else 
						val[3] = val[3] + 1;
	}
	
	public int valmenor (int i1) {
		int min = val[0], menor[]= new int [4];
		int i;
		for (i = 1; i<4;i++) {
			if (min > val[i])
				min = val[i];
		}

		for (i = 0; i<4; i++) {
 			if (min == val[i])
 				menor[i] = i+1;
		}
			
		return menor[i1];
	}
	
	public int valmayor (int i1) {
		int max = val[0], may[]=new int [4];
		int i;
		for (i = 1; i<4;i++) {
			if (max < val[i])
				max = val[i];
		}

		for (i = 0; i<4; i++) {
 			if (max == val[i])
 				may[i] = i+1;
		}
			
		return may[i1];
	}
	
	public String ast(int i) {

		String men;
		int i1=0;
		men = "";
		for(i1 = 0; i1 < val[i]; i1++) {
			men = men + "*";				
		}
		return men;
	}
	
	public int getVal(int i) {
		return val[i];
	}
	
	public int getContador(int cont) {
		int contador1 = cont;
		return contador1;
	}
	
}

//CLASE PRINCIPAL
public class Calificacion {
	public static void main (String [] args) {
		
		//Lectura
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		//Constructor objeto
		Cali cali = new Cali();
		
		//Variables 
		int contador=0, puntaje = 0, i = 0;
		char resp= 's';
		
		System.out.print("--- CALIFICACION DEL SERVICIO ---\n");
		//ciclo
		do {
			//Lectura de Calificacion
			for(i = 0; i < 1; i++) {
				try {
					System.out.print("\nIngresa un puntaje del 4 (mejor) al 1 (peor): ");
					puntaje = Integer.parseInt(leer.readLine());
					if ((puntaje < 1) || (puntaje > 4)) {
						i--;
						System.out.println("Error, el valor debe ser entre 4 y 1\n");
					}
				}
				catch (IOException ioe) {
					i--;
				}
				catch (NumberFormatException nfe) {
					i--;
					System.out.print("Error... Ingrese un valor entero entre 4 y 1");
				}
				
				cali.asignarVal(puntaje);
			}
			
			//Lectura de usuario
			for(i = 0; i < 1; i++) {
				try {
					System.out.print("\n¿Desea Continuar? 's' para si y 'n' para no: ");
					resp = Character.toUpperCase((char) leer.read());
					leer.skip(1);
					if (resp != 'S' && resp !='N') {
						i--;
						System.out.println("Error,ingrese 's' para si y 'n' para no\n");
					}
				}
				catch (IOException ioe) {	
					i--;
				}
			}
			
			contador++;
		} while(resp == 'S'); //fin del ciclo
		
		//IMPRESION DE RESULTADOS
		System.out.print("\n\nTotal de clientes encuestados: " + cali.getContador(contador) + "\n");
		
		//Impresion en formato de tabla
		System.out.printf("\n%20s %30s %15s", "Numero de Escala", "Clientes Encuestados", "Histograma" );
		for(i = 0; i < 4; i++) {
	
			System.out.printf("\n%20s %30s %15s", (i+1), cali.getVal(i), cali.ast(i));
		}
		//IMPRESION DEL MENOS SELECIONADO
		System.out.print("\n\nLa(s) escala(s) con menos seleccion: ");
		for (i = 0; i<4; i++) {
			if (cali.valmenor(i) != 0)
				System.out.print(cali.valmenor(i) + "  ");
		}
		//IMPRESION DEL MAYOR SELECCIONADO
		System.out.print("\n\nLa(s) escala(s) con mayor seleccion: ");
		for (i = 0; i<4; i++) {
			if (cali.valmayor(i) != 0)
				System.out.print(cali.valmayor(i) + "  ");
		}
	}
}
