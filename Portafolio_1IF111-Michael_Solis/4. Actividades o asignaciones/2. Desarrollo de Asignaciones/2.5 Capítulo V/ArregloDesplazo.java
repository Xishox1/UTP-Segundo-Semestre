import java.io.*;
class DesplazarAr{
	private int valor[];
	
	public void cant(int lim1) {
		valor = new int [lim1];
	}
	public void asignar(int vtemp, int i1) {
		valor[i1] = vtemp;
	}
		
	public void desplazo (int lim) {
		int i, ultimo;
		//ultimo valor
		ultimo = valor[lim -1];
		for(i=lim-1; i>0; i-- ) 
			valor [i] = valor[i-1];
		valor[0] = ultimo;
	
	}
		
	public int get_valor (int pos){
		return valor[pos];
	}
}
	
//CLASE PRINCIPAL
public class ArregloDesplazo {
	public static void main (String [] args) {
		
		int lim = 0, valor1;
		boolean error = false;
		//Objeto de lectura
		BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
		//Objeto
		DesplazarAr obj = new DesplazarAr();
		//LECTURA DE LIM
		do {
			System.out.print("Cuantos datos desea ingresar: ");
			try {
				lim = Integer.parseInt(leer.readLine());
				obj.cant(lim);
				error = false;
			}
			catch(IOException ioe) {
				System.out.print("Uyyy... Intente denuevo.\n");
				error = true;
			}
			catch(NumberFormatException nfe) {
				System.out.print("Uyyy... Intente denuevo. Recuerde ingresar un numero.\n");
				error = true;
			}
		} while (error == true);
		
		//LECTURA DE DATOS
		for (int i=0; i < lim; i++) {
			try {
				System.out.print("Ingrese un valor: ");
				valor1 = Integer.parseInt(leer.readLine());
				obj.asignar(valor1, i);
				System.out.print("");
			}
			catch(IOException ioe) {
				System.out.print("Uyyy... Intente denuevo.\n");
				i--;
			}
			catch(NumberFormatException nfe) {
				System.out.print("Uyyy... Intente denuevo. Recuerde ingresar un numero.\n");
				i--;
			}
		}

		obj.desplazo(lim);
		//impresion del arreglo
		System.out.print("\n\nARREGLO DESPLAZADO\n");
		for (int i1 = 0; i1 < lim; i1++) {
			System.out.println("Posición " + i1 + " : " + obj.get_valor(i1));
		}
		
	}
}
