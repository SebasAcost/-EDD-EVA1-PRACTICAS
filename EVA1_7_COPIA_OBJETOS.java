/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_c7_copia_objetos;

/**
 *
 * @author Tsuna0235
 */
public class EVA_1_7_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Prueba obj1 = new Prueba();
        System.out.println(obj1);
        Prueba obj2=obj1;
        System.out.println(obj2);
        System.out.println("Valor de la x = "+obj1.x);
        obj2.x++;
        System.out.println("Valor de la x= "+obj1.x);
    }
}
    class Prueba{
        int x=10;
    
}
