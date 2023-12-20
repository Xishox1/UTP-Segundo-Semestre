/* Escriba un programa que dado el peso de una computadora en kilogramos e imprima el
peso en libras.
*/
class PesoComputadora {
	private double peso;
	
	public double kilogramo(double a){
		peso = a;
		double multi;
		multi = a * 2.2046;
		return multi;
	}
}
// Programa Principal
class PesoCalculado{
	public static void main(String[] args){
		double res;
		// Se declara y crea el objeto 
		PesoComputadora obj = new PesoComputadora();
		// Activación de mensajes o llamado de métodos a ejecutar
		res = obj.kilogramo(24);
		System.out.println("El peso de kilogramo a libra del computador es: "+res);
	}//fin del método main()
} //fin de la clase PesoCalculado

