import java.io.*;


class Accidente {
	
	private String name, ced, lic;
	private int ave, calle;
	
	public void setAcc (int ave, int calle, int a [][]){
	
		 
		a[ave-1][calle-1] = a [ave - 1][calle -1] + 1;
	}
	
	
	public int getAve(int ave) {
		return ave;
	}
	public int getCalle(int calle) {
		return calle;
	}
	public String getNombre(String nombre) {
		name = nombre;
		return name;
	}
	public String getCedula(String cedula) {
		ced = cedula;
		return cedula;
	}
	public String getLicencia(String licencia) {
		lic = licencia;
		return licencia;
	}
	
}


//CLASE PRINCIPAL
public class AccidenteP {
	public static void main (String [] args) {
		int accidente=0, ave=0, calle=0, i=0, i1=0;
		char resp='S';
		String nombre="", licencia="", cedula="";
		final int fila =7, col=58;
		int [][] acciden = new int [fila][col];
		//Lectura objeto
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("--- INICIO DEL PROGRAMA ---\n");
		Accidente acc = new Accidente ();
		do {
			//lectura de nombre
			for (i = 0; i< 1; i++) {
				try {
					System.out.print("\nIngrese su nombre: ");
					nombre = leer.readLine();
				}
				catch (IOException ioe) {
					System.out.print("\nError... intente denuevo.\n");
					i--;
				}
			}
			
			//lectura cedula
			for (i = 0; i< 1; i++) {
				try {
					System.out.print("Ingrese su cedula: ");
					cedula = leer.readLine();
				}
				catch (IOException ioe) {
					System.out.print("\nError... intente denuevo.\n");
					i--;
				}
			}
			
			//lectura de licencia
			for (i = 0; i< 1; i++) {
				try {
					System.out.print("Ingrese su licencia: ");
					licencia = leer.readLine();
				}
				catch (IOException ioe) {
					System.out.print("\nError... intente denuevo.\n");
					i--;
				}
			}
			
			//Lectura de Columna / Calle
			for (i = 0; i< 1; i++) {
				try {
					System.out.print("\nIngrese el numero de Calle (columna): ");
					calle = Integer.parseInt(leer.readLine());
					if (calle <=0 || calle > col) {
						System.out.print("Ingrese un valor entre 1 y "+ col+"\n");
						i--;
					}
				}
				catch (IOException ioe) {
					System.out.print("\nError... intente denuevo.\n");
					i--;
				}
				catch (NumberFormatException nfe) {
					System.out.print("\nUyyy... Ingrese un valor entero valido.\n");
					i--;
				}
			}
			
			//Lectura de Avenida / Fila o renglon
			for (i = 0; i< 1; i++) {
				try {
					System.out.print("\nIngrese el numero de Avenida (fila): ");
					ave = Integer.parseInt(leer.readLine());
					if (ave <=0 || ave > fila) {
						System.out.print("Ingrese un valor entre 1 y "+ fila+"\n");
						i--;
					}
				}
				catch (IOException ioe) {
					System.out.print("\nError... intente denuevo.\n");
					i--;
				}
				catch (NumberFormatException nfe) {
					System.out.print("\nUyyy... Ingrese un valor entero valido.\n");
					i--;
				}
			}
			
			acc.setAcc(ave, calle, acciden);
			
			System.out.print("Accidente(s) registrado en la Calle: " + acc.getCalle(calle) + " avenida: " + acc.getAve(ave) +
					"\nPor: " + acc.getNombre(nombre) + "\nCedula: " + acc.getCedula(cedula) +"\nLicencia: " + acc.getLicencia(licencia));
			//leer resp
			for (i = 0; i< 1; i++) {
				try {
					System.out.print("\n\nDesea Continuar? 's' para si 'n' para no");
					resp = Character.toUpperCase((char)leer.read());
					leer.skip(1);
					if (resp != 'S' && resp != 'N') {
						i--;
						System.out.print("\nError: 's' para si 'n' para no");
					}		
				}
				catch(IOException ioe) {
					System.out.print("\nError... intente denuevo.\n");
					i--;
				}
			}
		} while (resp == 'S');
		
		//IMPRESION FINAL
		System.out.print("\nCalle:       ");
		for (i1 = 0; i1<col; i1++) {
			System.out.printf("%5s",(i1+1));
		}
		
		for (i = 0; i<fila; i++) {
			System.out.print("\nAvenida " + (i+1) + ":   ");
			for (i1 = 0; i1<col; i1++) {
				System.out.printf("%5s", acciden [i] [i1]);
			}
		}
	}//FIN DEL PROGRAMA
}