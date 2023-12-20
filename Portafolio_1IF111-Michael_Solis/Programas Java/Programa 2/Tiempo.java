/* Elabore un programa Java que dada una cantidad de horas e imprima su
equivalencia en minutos, segundos y días.
La clase debe ser public para que pueda ser usada en cualquier paquete y los
métodos publicos.
Los datos de la clase deben ser private para darle mayor seguridad.
*/

class Tiempop{
	private int horas;
	
	public void asignar(int a){
		horas = a;
	}
	
	public int calcular_minutos(){
		int min;
		min = horas * 60;
		return min;
	}
	
	public int calcular_segundos(){
		int seg;
		seg = horas * 3600;
		return seg;
	}
	
	public int calcular_dias(){
		int dia;
		dia = horas / 24;
		return dia; 
	}
	
	public int mostrar_hora(){
		return horas;
	}
			
}
// Programa Principal
public class Tiempo{
	public static void main(String[] args){
		int res,horas,minn,segg,ddia;
		//Se crea el objeto
		Tiempop time = new Tiempop();
		//Se asigna el valor
		time.asignar(25);
		horas = time.mostrar_hora();
		minn = time.calcular_minutos();
		segg = time.calcular_segundos();
		ddia = time.calcular_dias();
		System.out.println("Dadas "+horas+" horas, su equivalencia en\nMinutos es: "+minn+"\nSegundos es: "+segg+"\nDias es: "+ddia+"\n===Programa terminado===");
	}// Fin del método main
}// Fin de la clase Principal Tiempo