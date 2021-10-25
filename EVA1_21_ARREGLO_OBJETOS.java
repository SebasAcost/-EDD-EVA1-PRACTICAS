/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_arreglo_objetos;

/**
 *
 * @author Tsuna0235
 */
public class EVA_21_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] aPersonas = new Persona[10];
        //para unsar un objeto se debe crear
        //para crear un objeto se debe usar new
        //si no se crea, no existe
        for (int i = 0; i < aPersonas.length; i++) {
            aPersonas[i] = new Persona();
            
        }
        for (int i = 0; i < aPersonas.length; i++) {
            System.out.println("Nombre: "+aPersonas[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
}
