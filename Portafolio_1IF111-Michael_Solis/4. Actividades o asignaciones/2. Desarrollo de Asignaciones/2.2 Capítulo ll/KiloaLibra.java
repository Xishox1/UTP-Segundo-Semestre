class Conversor{
	
	private float kilo;
	
	public void asignar (float akilo) {
	kilo = akilo;
	}
	
	public double convertir () {
		double libras;
		libras = kilo * 2.2046;
		return libras;
		}
}
// Programa Principal
class KiloaLibra {
	public static void main (String[] args) {
		
		//variable
		double res;
		
		// Se declara y crea el objeto 
		Conversor obj = new Conversor();
		
		// Activación de mensajes o llamado de métodos a ejecutar
		obj.asignar(24);
		res = obj.convertir();
		
		//impresion de valor en libras
		System.out.println ("El peso de kilogramo a libra del computador es: " + res);
	} //fin del metodo main()
} //fin de la clase KiloaLibra

