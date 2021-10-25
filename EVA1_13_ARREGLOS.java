/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_13_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int [3]; //12 bytes-- 3 enteros
        System.out.println("Direccion de iArreglo= "+ iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        for (int i=0; i<iArreglo.length; i++){
       System.out.println("cuenta "+ i + " $ "+ iArreglo[i]);
        }
        int[]iCopia= iArreglo;
               System.out.println("direccion de iCopia"+ iCopia);
         for (int i=0; i<iCopia.length; i++){
       System.out.println("cuenta iCopia "+ i + " $ "+ iCopia[i]);
        }
         iArreglo = new int[2];
         System.out.println("direccion de iArrglo modificado"+ iArreglo);
        for (int i=0; i<iArreglo.length; i++){
       System.out.println("cuenta modificada"+ i + "$"+ iArreglo[i]);
        
        }
        System.out.println("direccion de iCopia"+ iCopia);
        for (int i=0; i<iCopia.length; i++){
       System.out.println("cuenta iCopia "+ i + " $ "+ iCopia[i]);
        }
    }
    
}
