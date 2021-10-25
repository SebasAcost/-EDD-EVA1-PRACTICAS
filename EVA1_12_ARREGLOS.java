/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_12_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int [3]; //12 bytes-- 3 enteros
        System.out.println("Direccion de iArreglo= "+ iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;//iArreglo[3] = 3;  error: ArrayIndexOutOfBound-- nos pasamos de los limites
        for (int i=0; i<iArreglo.length; i++){
       System.out.println("cuenta"+ i + "$"+ iArreglo[i]);
   }
       System.out.println("direccion de iArrglo modificado"+ iArreglo);
        iArreglo = new int[2];
        for (int i=0; i<iArreglo.length; i++){
       System.out.println("cuenta modificada"+ i + "$"+ iArreglo[i]);
        
    }
    
}
}
