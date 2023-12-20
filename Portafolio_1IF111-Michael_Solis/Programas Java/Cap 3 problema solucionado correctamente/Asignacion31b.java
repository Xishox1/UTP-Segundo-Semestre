/* Elabore un programa Java empleando la metodolog�a POO que lea un n�mero
 *cualquiera mientras el usuario lo desee y calcule e imprime el %
 *La clase debe ser public para que pueda ser usada 
 *en cualquier paquete y los m�todos p�blicos.
 *Los datos de la clase deben ser private para darle mayor seguridad.
 *Utilizar try y catch apra controlar excepciones. */
 
import java.io.*;
class Porcentaje {
	private float numero;
	
	public void asignar(float a){
		numero = a;
	}
	
	public float calcular_num(){
		float nuevo;
		nuevo = numero / 100;
		return nuevo;
	}
}

class Asignacion31b{
  public static void main(String []args) {
	  BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	  String cadena; 
	  char resp;
	  float num1,f;
	  Porcentaje obj = new Porcentaje();
	  resp = 'S';

	  while(resp == 'S'){
	     try{
            System.out.println("Introduzca un n�mero");
            cadena = br.readLine();
            num1 = Float.parseFloat (cadena);
            obj.asignar(num1);
            f = obj.calcular_num();
            System.out.println("La respuesta del n�mero en porcentaje es: " +f+"%");
            }
          catch(IOException e) {
     	    System.out.print("Error...en la Entrada de datos, con el m�todo readLine" +	"\n\n"); }
          catch(NumberFormatException e) {
     	    System.out.print("Error...conversion de tipo de dato" +"\n\n"); }
           
          try{
              System.out.print("\n�Desea Continuar? Escriba s para confirmar o cualquier otro caracter para terminar el programa.\n");
	  	      resp = (char)br.read();	  	      
	  	      resp = Character.toUpperCase(resp); //convierte un caracter a may�scula
	  	      br.skip(1);
	   	     }
          catch(IOException e) {
     	      System.out.print("Error...en la Entrada de datos, con el m�todo readLine" + "\n\n"); } 
       }
    }
}

