/*Los miembros con modificador de acceso private en la superclase 
  no son visibles(se ocultan) en la subclase al definir la herencia con la palabra extends */
  
/* Existe un mecanismo llamado método intermediario para poder utilizar los datos no visibles 
   de la superclase en la suclase */
  

/*       No marca error         */ 
class Poligono {    	 
   
  private int ancho , altura, base;   
 
  void set_atributos (int a, int b, int c) {  
  ancho=a; altura=b; base=c;}
  
  int get_altura( ){ 
  	return altura;
  }
  
  int get_ancho( ){
  	return ancho;
  }
  
  int get_base(){
  	return base; 
  }   
}   
   	  
class Rectangulo  extends Poligono {    
 
  	  public int area() { 
  	  return get_ancho() * get_altura() ; /*los métodos get_ancho() y get_altura()
  	                                        actuan como métodos intermediarios retornado los valores 
  	                                        ancho y altura para poder calcular el area del rectangulo*/
       }   
}

class Triangulo extends Rectangulo{
	public int area1(){
		return (get_base() * get_altura())/2;
	}
}  	  
	class Herencia5 { 
	   public static void main(String  []args ) {   	  
          Triangulo recta = new Triangulo();         
          recta.set_atributos (4,2,4);     	  
          System.out.print("AREA DEL RECTANGULO:  " +  recta.area() ); 
          System.out.print("AREA DEL TRIANGULO: "+recta.area1());
         
	}}  	
