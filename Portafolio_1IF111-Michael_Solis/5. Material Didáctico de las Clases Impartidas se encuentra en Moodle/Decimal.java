import java.io.*;
import java.text.*;
class Suma{
 private	float n1;
 private	float n2;
 public void asignar (float n1f,float n2f){
	n1=n1f;
	n2=n2f;
 }
 public float sumar(){
  float s;
  s=n1+n2;
  return s;
 }
}
class Sumarp{
public static void main(String Args[])
	{   float n1,n2,rs;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat dc = new DecimalFormat("###,###.##");
		Suma obj = new Suma();
		System.out.println("Calculo de la Suma");
        try{
        
		System.out.println("Entre el primer numero a sumar ");
		n1= Float.parseFloat(br.readLine());
		System.out.println("Entre el segundo numero a sumar ");
		n2= Float.parseFloat(br.readLine());
		obj.asignar(n1,n2);
		rs=obj.sumar();
		System.out.println("Resultado de la suma sin formato = "+rs);
		System.out.println("Resultado de la suma con formato = "+dc.format(rs));
        }
        catch (Exception e){
        System.out.println("Error... de captura o conversi?n de datos");	
        }
	}

}