/* Los empleados de la autoridad del canal trabajan 2 turnos rotativos, diurno y nocturno.  Se desea calcular el salario diario de acuerdo con lo siguiente:
•	La tarifa de las horas diurnas es de B/. 15.00
•	La tarifa de las horas nocturnas es de B/. 20.00
En caso de ser día feriado la tarifa se duplica para el turno nocturno.

Se cuenta con el siguiente registro por cada empleado:
Descripción	Nombre de variable 	Tipo de dato	valor
Nombre					n			Cadena	
Turno					t			Carácter 	d (para diurno), n (nocturno)
Horas trabajadas		ht			entero	
feriado					diafer		caracter	S (s) o N(n)

*/
import java.io.*;
class EjemploEmpleado {
	// atributos 
	private String n;
	private char t;
	private int ht;
	private char diafer;
	
	// Métodos
	public void asignar(String n1, char t1, int ht1, char diafer1){
		n = n1;
		t = t1;
		ht = ht1;
		diafer = diafer1;
	}
	
	// Bienvenida al usuario
	public String usuario(){
		String hola;
		hola = "Bienvenido "+n+" su salario es: ";
		return hola;
	}
	
	// Turno
	public float turno(){
		float trno = 0;
		if(t == 'd')
			trno = 15.00f;
		else if (t == 'n')
			trno = 20.00f;
		return trno;
	}
	
	// Preguntar dia feriado 
	public int diaf(){
		int valor = 0;
		if (diafer == 's' & t =='n')
			valor = 2;
		else if ((diafer == 'n') & (t == 'd')) 	
			valor = 1;
		return valor;
	}

	// Calculando salario
	public float calculando(){
		float turnos,metodo;
		int diaff;
		turnos = turno();
		diaff = diaf();
		metodo =  turnos * diaff * ht;
		return metodo;
	}
}

public class Empleado {
	public static void main(String[] args){
		String nombre = "",user;
		char tt = 0;
		int htt = 0,dia = 0,i;
		char resp = 'S';
		char feriado = 0;
		float calcular;
		EjemploEmpleado obj = new EjemploEmpleado();
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
		while(resp == 'S'){
		  try{	
		  // Preguntar ingresar nombre
		     System.out.println("Ingresa tu nombre: ");
		     nombre = leer.readLine();
		     }
		  catch(IOException e){
			 System.out.println("Error en la entrada de datos");
		     }
		
		//Preguntar turno de trabajo
		for( i = 1; i <= 1; i++){
		  try {
			 System.out.println("Ingresa tu turno 'd' para diurno y 'n' para nocturno");
			 tt = (char)leer.read();
			 leer.skip(1);
			 if((tt != 'd') && (tt != 'n')){
			 	System.out.println("Error, ingresa 'd' o 'n'");
			 	i--;
			 }
		     }
		  catch(IOException e){
			 System.out.println("Error en la entrada de datos");
			 i--;
		     }
		}
		// Preguntar horas trabajadas
		for(i = 1; i <= 1; i++){
		  try{
			 System.out.println("Ingresa la cantidad de horas trabajadas durante el dia");
			 dia = Integer.parseInt(leer.readLine());
			 if((dia <= 0) || (dia >= 19)){
				System.out.println("Error, ingresa la cantidad de horas en un rango de 1 horas a 18 horas");
				i--;
			   }
		     }
		  catch(IOException e){
			 System.out.println("Error en la entrada de datos");
			 i--;
		    }
		  catch(NumberFormatException e){
			System.out.println("Error en la conversión de datos");
			i--;
		    }
		 }
		
		// Preguntar si es feriado o no
		  try {
			  System.out.println("¿Es dia feriado? coloque 's' para si o 'n' para no");
			  feriado = (char)leer.read();
			  leer.skip(1);
		      }
		  catch(IOException e){
			 System.out.println("Error en la entrada de datos");
		      }
		// Imprimir resultados 
		obj.asignar(nombre,tt,dia,feriado);
		user = obj.usuario();
		calcular = obj.calculando();
		System.out.println(user+calcular);
		
		// Desear continuar
		  try {
			 System.out.println("¿Desea continuar? Escriba s para continuar o cualquiera otra tecla para salir del programa");
		   	 resp = (char)leer.read();
			 resp = Character.toUpperCase(resp);
			 leer.skip(1);
	         }
		  catch(IOException e){
			 System.out.println("Error en la entrada de datos");
		     }
		
	      }
	 }
}

