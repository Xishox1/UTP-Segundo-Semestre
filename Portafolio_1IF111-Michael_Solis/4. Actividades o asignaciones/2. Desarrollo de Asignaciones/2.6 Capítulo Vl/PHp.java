//Herencia y sobrecarga de métodos 

/*Los métodos sobrecargados en la superclase y la subclase se heredan (son visibles o no se ocultan) en la  
  en la subclase al definir la herencia con la palabra extends */

//Creación de la superclase P
class P{  
    private int casas;
    public void asignar (int cas){ //método sobrecargado
       casas=cas;}        
    public int get_casas(){
      return (casas);}    
    }
//Creación de la subclase 
class H extends P{   
  private int carros;
  public void asignar (int cas, int car){//método sobrecargado
      asignar (cas);  /*llamando a ejecutar el método asignar de la superclase para asignarle valor a casas
                        casas se ocultó, pero el mecanismo para tener acceso es utilizar un método intermediario
                        que este caso es asignar con un parámetro (se está reutilizando código existente)*/ 
      carros=car;}      
       
  public int get_carros() {
   	  return carros;  }
     
   }

class PHp{
   public static void main (String arg []) {	
   H obj = new H();	/*Declara y crea el objeto obj instanciadolo a la subclse H 
                      usando el método constructor de la subclase H()  */ 
	
   obj.asignar (2,4);/* El objeto identifica al asignar de la subclase que es el que tiene 2 parámetros
                        y si ve a este método en la subclase, el llama a ejecutar al asgnar de la superclase
                        entoces en el objeto obj el dato casas tomara el valor de 2 y carros el valor de 4*/ 
                         	
   System.out.println ("Contenido del objeto obj");	
   	                                       // lo dicho antes lo puede comprobar en las siguientes 2 instrucciones 	
   System.out.println ("Cantidad de casas : "+obj.get_casas());
   System.out.println ("Cantidad de carros : "+obj.get_carros());
   	
} }	
	  
	     
     
         
     	
       	 