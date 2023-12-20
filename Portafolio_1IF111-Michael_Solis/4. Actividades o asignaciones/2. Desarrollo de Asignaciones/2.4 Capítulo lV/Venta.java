/* Una empresa de ventas por catálogos ofrece 3 productos distintos, cuyos precios
de ventas al detalle son:
Producto 1 $2.98
Producto 2 $4.50
Producto 3 $9.98
Usted cuenta con los siguientes datos o atributos de entrada: Número de
producto (np), cantidad vendida en un día (cvd).
Calcular e imprimir el precio de venta según el producto vendido.
Repita el proceso mientras el usuario lo desee.
*/
import java.io.*;
class EjemploVenta{
	// datos o atributos
	private int np;
	private int cvd;
	private final float product1 = 2.98f;
	private final float product2 = 4.50f;
	private final float product3 = 9.98f;
	
	// Métodos o acciones
	public void asignar(int a){
		np = a;
	}
	
	public String imprimir(){
		String mensaje = "";
		if(np == 1)
			mensaje = "El precio es 2.98";
		else if (np == 2)
			mensaje = "El precio es 4.50";
		else if (np == 3)
			mensaje = "El precio es 9.98";
		return mensaje; 
	}
}

public class Venta{
	public static void main(String[] args){
		int num1;
		int cvd = 0;
		char resp = 'S';
		String res;
		EjemploVenta obj = new EjemploVenta();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(resp == 'S'){
		try{
		cvd = cvd + 1;
		System.out.println("Ingresa el numero del producto que quieres comprar: ");
		num1 = Integer.parseInt(br.readLine());
		
		if(num1 < 1 || num1 > 3){
			System.out.println("Error, introduce un número entre 1 y 3");
			cvd--;
		} else {
		obj.asignar(num1);
		res = obj.imprimir();
		System.out.println(res);
		}
		
		}
		catch(IOException e){
			System.out.println("Error en la entrada de datos");
			cvd--;
		}
		catch(NumberFormatException e){
			System.out.println("Error en la conversión de datos");
			cvd--;
		}
		
		try{
		System.out.println("¿Desea continuar? escriba s para continuar o cualquier otro caracter para termianr el programa");
		resp = (char)br.read();
		resp = Character.toUpperCase(resp);
		br.skip(1);
		}
		catch(IOException e){
			System.out.println("Error en la entrada de datos");
		}
	
	}
		System.out.println("El total de cantidad vendida en un dia: "+cvd);
}
}


