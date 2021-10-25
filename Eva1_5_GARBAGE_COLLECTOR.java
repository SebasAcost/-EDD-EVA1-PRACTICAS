/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_garbage_collector;

/**
 *
 * @author Tsuna0235
 */
public class Eva1_5_GARBAGE_COLLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj);
        //ELIMINAMOS EL OBJETO
        obj = null;
        
    }
    
}
class MiClase{//nuevo tipo de dato --> tipos de datos abstractos
    private String mensaje;{ //atributos-->estado del objeto
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
