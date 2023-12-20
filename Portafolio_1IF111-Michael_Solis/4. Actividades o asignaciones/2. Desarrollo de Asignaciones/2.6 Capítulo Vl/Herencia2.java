/*Los miembros con modificador de acceso protected en la superclase 
  son visibles(no se ocultan) en la subclase al definir la herencia con la palabra extends */
class Poligono {    	 
   
  protected int ancho , altura; //datos con modificador de acceso protected
    
  public void set_atributos (int a, int b) {  
  ancho=a; altura=b;}
 }   
   	  
class Rectangulo  extends Poligono {    
 
  	  public int area() {  
      return (ancho * altura); } }  //ancho y altura son visbles en la subclase porque son protected
                                    //entonces el método area() puede usar a ancho y altura
  
class Herencia2 {
	public static void main(String arg[] ) {   	  
         Rectangulo recta;         
         recta= new Rectangulo(); //todos los miembros public, por defecto y protected 
                                  //son visibles por el objeto                                      
         recta.set_atributos (4,5);    	  
         System.out.print("AREA DEL RECTANGULO:  " + recta.area() );   
	}}  	
