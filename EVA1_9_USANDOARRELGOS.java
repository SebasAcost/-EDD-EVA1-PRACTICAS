/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_usandoarrelgos;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_9_USANDOARRELGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.UN ARREGLO DE ENTEROS
        int[]aiDatos = new int [20];
        //2. LLENAR CON VALORES
        /*
        indice:
        primer elemento del arreglo: posicion 0
        Ultimo elemento del arreglo: posicion N-1
        */
        //ACCESO A LOS VALORES
        for(int i = 0; i<10; i++){
            aiDatos[i] = (int)(Math.random()*20);
        }
        //3. IMPRIMIR LOS VALORES
        for(int i=0; i<10; i++){
            System.out.print("["+aiDatos[i]+"]");
        }
        
    }
    
}
