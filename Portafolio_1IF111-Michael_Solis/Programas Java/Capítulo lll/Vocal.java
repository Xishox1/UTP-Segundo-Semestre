/* dada una vocal. Imprima si es una vocal abierta (a,e,o) o si es una vocal cerrada (i,u).
 Permite repetir el proceso mientras el usuario lo deseee.*/

class EjemploVocal {
	// atributos 
	private char vocal;
	
	private void asignar(char z){
		vocal = z;
	}
	public String imprimir(){
		String oye;
		if(vocal == a){
			oye = "Es una vocal abierta";
		}
		else if (vocal == e)
			oye = "Es una vocal abierta";
		else if (vocal == o)
			oye = "Es una vocal abierta";
		else if (vocal == i)
			oye = "Es una vocal cerrada";
		else if (vocal == u)
			oye = "Es una vocal cerrada";
		return oye;
	}
}

public class Vocal{
	public static void main(String[] args){
		String resultado = "";
		char voc = 0;
		char resp = 's';
		EjemploVocal obj = new EjemploVocal();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(resp == 's'){
		try {
		System.out.println("Ingresa una vocal: ");
		voc = (char)br.read();
		br.skip(1);
		}
		catch(IOException e){
			System.out.println("Error en la entrada de datos");
		}
		obj.asignar(voc);
		resultado = obj.imprimir();
		System.out.println(resultado);
		System.out.println("¿Desea continuar? escriba s para continuar o cualquiera otra tecla para salir");
		resp = (char)br.read();
		br.skip(1);
		}
	}
}