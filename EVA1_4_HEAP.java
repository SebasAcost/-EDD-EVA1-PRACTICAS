/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_heap;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MiClase obj = new MiClase();
      System.out.println(obj);//REFERENCIA AL OBJETO EN EL HEAP
      MiClase obj2 = new MiClase();
            System.out.println(obj);//REFERENCIA AL OBJETO EN EL HEAP
      EVA1_4_HEAP objHeap = new EVA1_4_HEAP();      
            System.out.println(objHeap);//REFERENCA AL OBJETO EN EL HEAP

    }
    
}
class MiClase{//nuevo tipo de dato --> tipos de datos abstractos
    private String mensaje;{//atributos-->estado del objeto
}
    public MiClase (){//metodos--> comportamiento
        mensaje= "Hola mundo";
    }
    public String getmensaje(){
        return mensaje;
    } 
    public void setMesaje (String mensaje){
        this.mensaje = mensaje;
    }
}
