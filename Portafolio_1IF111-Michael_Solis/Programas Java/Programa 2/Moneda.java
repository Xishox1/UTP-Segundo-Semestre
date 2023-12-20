/* Un se�or tiene una cantidad de monedas de .25 centavos, escriba un programa que
imprima la cantidad de dinero que tiene el se�or.
(La cantidad de monedas no la vamos a leer para desarrollar un programa muy
sencillo). */
class EjemploMoneda {
	private int moneda;
	
	public void asignar(int cant_moneda){
		moneda = cant_moneda;
	}
	
	public float cantidad_dinero(){
		float s;
		s = 0.25f * moneda;
		return s;
	}
	
	public int mostrarMoneda(){
		return moneda;
	}
}
// Clase Principal
class Moneda {
	public static void main(String[] args){
		float res;
		int mmoneda;
		// Se declara y crea el objeto
		EjemploMoneda obj = new EjemploMoneda();
		// Activaci�n de mensajes o llamado de m�todos a ejecutar
		obj.asignar(7);
		res = obj.cantidad_dinero();
		mmoneda = obj.mostrarMoneda();
		System.out.println("El se�or tiene "+mmoneda+" monedas de 0.25 centavos que en cantidad de dinero es: "+res+" dolares.");
	} // Fin del m�todo main()
} // Fin de la clase Moneda
		
