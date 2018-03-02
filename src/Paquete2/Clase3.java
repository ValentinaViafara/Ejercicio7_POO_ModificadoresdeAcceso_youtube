
//MODIFICADORES DE ACCESO

//Para icrear objeto de una clase de otro paquete


package Paquete2;
import Paquete1.Clase1;


public class Clase3 {
    public static void main(String[] args){
        Clase1 objeto1= new Clase1();
        
        //acceso a dato por modificador de acceso por defecto 
        objeto1.atributo1=15;
        
        //acceso a dato por modificador de acceso público
        objeto1.atributo2=10;
        
        //acceso a dato por modificador de acceso privado
        objeto1.atributo3=9;
        
        
    }
    
}

