
package Paquete1;


public class Clase2 {
    public static void main(String []args){
        
        Clase1 objeto= new Clase1();
        //acceso a dato por modificador de acceso por defecto
        objeto.atributo1=10;
        
        //acceso a dato por modificador de acceso público
        objeto.atributo2=100;
        
        
        //acceso  a dato por modificador de acceso privado
        objeto.atributo3=5;
    }
    
}
