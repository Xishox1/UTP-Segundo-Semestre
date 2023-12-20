/* Una fábrica de paletas emplea 20 carritos especiales para la carga, venta y
distribución del producto. Estos carritos cargan una computadora. Todos los días
temprano específicamente a las 7:00 a.m. salen los carritos surtidos inicialmente de
100 paletas para cada uno de los sabores como: naranja, piña, limón, tamarindo y
coco, regresando a las 4:00 p.m. de la tarde. Inmediatamente se requiere conocer
cuántas paletas quedan de cada sabor para poder llenar los carritos con la cantidad
inicial de todos los días para salir temprano a la venta. Se desea que desarrolle un
programa para registrar las ventas y conocer al final del día:
• Cuánto queda en existencia de cada sabor de paleta para cada carrito.
• Cuánto se requiere de cada sabor para completar las 100 paletas en cada
carrito.
• Cuánto dinero se hizo en las ventas en cada carrito por cada sabor de paleta.
• Además, se necesita conocer el sabor que más se vende y que número de
carrito la vende. Contemple que pueden existir igualdad. */
import java.io.*;
class PaletaEjemplo{
	/*private String sabor;
	private int cantidad,prec; 
	private static final int naranja = 20,pina = 20,limon = 20 ,tamarindo = 20,coco = 20;*/
	private int fila = 20, col = 5; // 20 filas porque son 20 carritos y 5 columnas porque son 5 sabores.
		
		
	public void setAcc (int carrito, int sabor, int a[][], int cantidad){ // carrito, sabor, referencia
		a[carrito -1][sabor-1] = a[carrito-1][sabor-1] + cantidad; // acumulador de cantidad.
		if(a[carrito -1][sabor-1] > 20){  // validación si la cantidad pasa de 20
			a[carrito -1][sabor-1] = 20; //me colocas 20 en la paleta como máximo.
		}
	}
	
	public void joke(int carrito, int sabor, float b[][], float precio, int cantidad){ // para calcular el precio x cantidad
		
		b[carrito-1][sabor-1] = b[carrito-1][sabor-1] + precio*cantidad;  // acumula el precio por la cantidad que voy ingresando
		if(b[carrito-1][sabor-1] > precio*20){  // para establecer que si se pasa de 20 paletas, colocar el precio de 20 paletas.
			b[carrito-1][sabor-1] = precio*20;   // aquí te coloca el precio de 20 paletas como máximo.
		}
	}
	
	public int []posicionmayor(int a[][]){  // crear un vector dentro de un método y enviarle valores
		int i,j;
		int carrito = 0, sabor = 0; 
		int max = a[0][0];
		for(i = 0; i < fila; i++){
			for(j = 0; j < col; j++){
				if(a[i][j] > max  ){  // acá se calcula el valor mayor o sea el máximo en este método pero solo sus índices
					max = a[i][j];
					carrito = i+1;
					sabor = j+1; 
				}
			}
		}
		int mayorp[] = {carrito,sabor};
		return mayorp; 
	}
	 
	public int mayor(int a[][]){
		int max;
		int i,j;
		max = a[0][0];
		for(i = 0; i < fila; i++){
			for(j = 0; j < col; j++){
				if(a[i][j] > max){  // el número mayor de paleta vendida 
					max = a[i][j];
				}
			}
		}
		return max; 
	}
	
	public int []posicion(int maximo, int a[][]){  // creo un nuevo arreglo para calcular cuando se contempla valores máximos de carritos
		int poss[]=new int [fila];
		for(int i=0; i<fila; ++i){
			for(int j=0; j<col;++j){
				if(a[i][j] == maximo){
					poss[i] = i+1;
				}
			}
		}
		return poss; 
	}
	
	public int []posicion1(int maximo, int a[][]){  // creo un nuevo arreglo para calcular cuando se contempla valores máximos de sabores.
		int pos[] = new int[col];
		for(int i=0; i<fila; ++i){
			for(int j=0; j<col;++j){
				if(a[i][j] == maximo){
					pos[j] = j+1;
				}
			}
		}
		return pos; 
	}

}
	
public class Paleta{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Para lectura de datos
		PaletaEjemplo obj = new PaletaEjemplo(); // declaro y creo el objeto
		int saborr = 0,cantidad = 0;
		int maximo = 0; // Para hallar el número mayor del método mayor()
		int sum; 
		int acumulador = 0;  // Para enviar un mensaje de que está lleno el sabor y ese número del carrito
		int f[];
		int p[]; 
		float precio = 0; // calcular precio de cada sabor  
		char resp = 'S'; // Mientras controlado por respuesta. 
		int carrito = 0,i,j;
		final int fila = 20, col = 5;
		int [][]x = new int[fila][col]; // matriz para acumular la cantidad de paletas y controlarlo.
		float [][]z = new float[fila][col]; // matriz para acumular el precio y controlarlo.
		// Inicio del do while
		do{
			// lectura del sabor
			for(i = 0; i < 1;i++){
				try{
					System.out.println("Ingresa el sabor de acuerdo al numero que quiere comprar, el menu es: \n ");
					System.out.println("1.naranja\n2.piña\n3.limón\n4.tamarindo\n5.coco\n ");
					System.out.print("Escoge:");
					saborr = Integer.parseInt(br.readLine()); // se lee el sabor y se almacena en la variable saborr
					if(saborr < 1 || saborr > 5){ // se hace una validación 
						System.out.println("Error, ingresa un numero del menú entre 1 y 5."); // si ingresas un valor fuera de 1 y 5 marca error
						i--;  // Reinicia el ciclo for de 0 a 1 para volver a preguntar qué sabor desea comprar. 		
					} else {
							System.out.println("¿Qué cantidad quieres de ese sabor?");
							cantidad = Integer.parseInt(br.readLine());
							if(cantidad < 1 || cantidad > 20){ // validación
								System.out.println("Error, ingresa una cantidad entre 1 y 20");
								i--;
								}
							if(saborr == 1){
								precio = 2.00f;
							} else if (saborr == 2){
								precio = 3.00f;
							} else if (saborr == 3){
								precio = 4.00f;
							} else if(saborr == 4){
								precio = 5.00f;
							} else if (saborr == 5){
								precio = 6.00f;
								}	
							}
					
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					i--;
				}catch(NumberFormatException e){
					System.out.println("Error en la conversión de datos");
					i--;
				}
			}
			
			// Lectura del carrito
			for(i = 0; i < 1;i++){
				try{
					System.out.println("Ingrese en qué carrito se encuentra");
					carrito = Integer.parseInt(br.readLine());
					if(carrito <1 || carrito > 20){
						System.out.println("Error, ingresa un número entre 1 y 20");
						i--;
					}
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					i--;
				}catch(NumberFormatException e){
					System.out.println("Error en la conversión de datos");
					i--;
				}
			}
			//acumulador = acumulador + cantidad;  // acumulador para mandar mensaje de error
			obj.setAcc(carrito, saborr,x,cantidad);// Se lo envia al método setAcc  
			obj.joke(carrito,saborr,z,precio,cantidad);
			
	

			/*for(i = 0; i < fila; i++){  // marcar error por si se pasa de cantidad acumulada
				for(j = 0; j < col; j++){
					if(saborr == j && acumulador > 20 && carrito == i){
						acumulador = 0; 	
						System.out.println("Error, cantidad máxima alcanzada y se le asignan 20 paletas completas en el carrito y sabor.");
					}	
				}
			}*/

			
			
			// Leer resp  si o no, continuar o finalizar.
			for(i = 0; i < 1; i++){
				try{
					System.out.println("¿Desea continuar? Escribe s para continuar o cualquier otra tecla para terminar");
					resp = (char)br.read();
					br.skip(1);
					resp = Character.toUpperCase(resp);
				}catch(IOException e){
					System.out.println("Error en la entrada de datos");
					i--;
				}
			}
			
		}while(resp == 'S');
		
		// impresión final
		
		
		System.out.println("\nSabores que quedan por cada carrito ");
		System.out.print("Sabor         1  2  3   4  5");
		// paletas que quedan por cada sabor de cada carrito
		for (i = 0; i<fila; i++) {
			System.out.print("\nCarrito " + (i+1) + ":   ");
			for (j = 0; j<col; j++) {
				if(x[i][j] <= 20)
					System.out.print(" "+ (20-x [i][j]));  // si ingreso 19, agarra 20-19 = 1.
				else if (x[i][j] > 20)
					System.out.print(x[i][j] = 0); // si te comiste todo,te queda 0 paletas en ese cuadrito.
			}
		}
		
		
		
		// Completar 100 paletas en cada carrito, cuántas se requieren de cada sabor
		System.out.println("\n\nPaletas en cada sabor que se requieren para completar las 100 paletas en cada carrito");
		System.out.print("Sabor         1 2 3 4 5");
		for (i = 0; i<fila; i++) {
			System.out.print("\nCarrito " + (i+1) + ":   ");
			for (j = 0; j<col; j++) {
				if(x[i][j] <= 20)
					System.out.print(" "+ x [i][j]); // paletas que vendiste y necesitan ser reemplazadas, si compraste 19, debes reponer 19.
				else if (x[i][j] > 20)
					System.out.print(x[i][j] = 20);
				}
			}
			
			
		
		// Cuánto dinero se hizo en las ventas en cada carrito por cada sabor de paleta.
		System.out.println("\n\nDinero ganado por cada carrito en cada sabor");
		System.out.print("Sabor           1    2    3    4    5 ");
		for (i = 0; i<fila; i++) {
			System.out.print("\nCarrito " + (i+1) + ":   ");
			for (j = 0; j<col; j++) {
				if(x[i][j] <= 20)
				System.out.print("  "+ z [i][j]);
				}
			} 
				
		// Sabor que sabor más se vende y qué carrito la vende, contemple igualdad o sea el mayor.
		
		maximo = obj.mayor(x); 
		p = obj.posicionmayor(x);
		System.out.println("\n\nEl sabor que más vende es el número: "+p[1]+"  y el carrito que más vende es el "+p[0]+".");
	
		f = obj.posicion(maximo,x); // posiciones que contemplan igualdad con valor máximo
		System.out.println("\nPosiciones maximas que encuentran carritos: ");
		for(i = 0; i < 20; i++){
			if(f[i] != 0){
				sum = f[i];
				System.out.println(sum);
			}
		}
		
		f = obj.posicion1(maximo,x)	;
		System.out.println("\nPosiciones maximas que encuentran sabores: ");
		for(i = 0; i < 5; i++){
			if(f[i] != 0){
				sum = f[i];
				System.out.println(sum);
			}
		}
	
}
}
