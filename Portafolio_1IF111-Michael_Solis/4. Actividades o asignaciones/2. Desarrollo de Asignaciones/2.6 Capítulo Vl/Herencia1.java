/*Los miembros con modificador de acceso public y por defecto en la superclase 
  son visibles(no se ocultan) en la subclase al definir la herencia con la palabra extends */
class Poligono { //declaración de la superclase
   //miembros de la superclase Poligono  	 
   public int ancho ; //dato con modificador de acceso public 
          int altura; //dato con modificador de acceso por defecto
           
   void set_atributos (int a, int b) {  //método con modificador de acceso por defecto 
           ancho=a; altura=b;}       
}   
   	  
class Rectangulo  extends Poligono {  //declaración de la subclase aplicando herencia a partir de la 
                                      //superclase Poligono con la palabra reservada extends  
   //miembros de la subclase Rectangulo
   public int area() { 
          return (ancho  * altura); } //por herencia puede utilizar los datos ancho y altura
                                      //porque los miembros public y por defecto son visibles en la subclase
}  	
  
class Herencia1 { 
  public static void main(String args[]  ) {   	  
     Rectangulo recta; //declaración del objeto
                
     recta= new Rectangulo(); //creación del objeto llamado recta
                              //este objeto fue instanciado a la subclase Rectangulo 
                              //y como Rectangulo hereda de Poligono 
                              //entonces tiene sus propios miembros y los de la superclase 
                              //Ademas, todos los miembros tanto de la superclase y subclase son
                              //visibles en el objeto porque son public o por defecto
                              //solamente se oculta el constructor de la superclase 
      
     recta.set_atributos (4,5); //el método set_atributos es visible en el bjeto
                                // por lo que explique antes
                                                                      	  
     System.out.print("AREA DEL RECTANGULO:  " + recta.area() ); //el método area es visible en el objeto
                                                                 //por lo que explique antes  
}}  	
