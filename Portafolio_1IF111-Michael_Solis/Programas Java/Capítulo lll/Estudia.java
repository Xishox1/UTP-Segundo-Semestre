// ************************************************************************
//   Declare y cree un arreglo x con 10 elementos y retorne todo el arreglo 
// ***********************************************************************
class Arreglo4{
	double [] mostrar_arreglo(){
		double x[] = new double[10]; // creo y declaro el arreglo
		return x;
	}
}

class Arreglo4p{
	public static void main(String[] args){
		int i; 
		Arreglo4 obj = new Arreglo4();
		
		double a[]; // Se declara el objeto con la capacidad de almacenar información en la dirección de memoria que haga referencia a un vector unidimensional
		a = obj.mostrar_arreglo();
		System.out.println("Dirección de memoria del vector: "+obj.mostrar_arreglo());
		for(i = 0; i < 9; i++){
			System.out.println(a[i]);
		}
	}
}
