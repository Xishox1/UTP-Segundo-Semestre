/*Los miembros con modificador de acceso private en la superclase 
  no son visibles(se ocultan) en la subclase al definir la herencia con la palabra extends */
  
  
//Compile el programa y vea el error generado
class Poligono {    	 
   
 private int ancho , altura; //datos private  
 
  void set_atributos (int a, int b) {  
  ancho=a; altura=b;}
  
  int get_altura( ){ //retorna altura
  	return altura;
  }
  
  int get_ancho( ){ //retorna ancho
  	return ancho;
  }   
}   
   	  
class Rectangulo  extends Poligono {    
 
  	  public int area() { 
  	  return ancho * altura ; // marca error al compilar porque los atributos ancho y altura son privados
  	                          // hacer corrección
  	                          // en el laboratorio1.3 veremos cual es el mecanismo para utilizarlo
       }   
}  	  
	class Herencia3 { 
	   public static void main(String[] args) {   	  
          Rectangulo recta; 
         
          recta= new Rectangulo();         
          recta.set_atributos (4,5);     	  
          System.out.print("AREA DEL RECTANGULO:  " +  recta.area() );   
	}}  	
