/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int iVal = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < iVal; i++) {
            int iMod = iVal % i;
            if(iMod ==0){
                esPrimo = false;
                break;//detiene el for
                
            }
        }
        //imprimir si es primo o no
        if(esPrimo)
            System.out.println("el numero es primo");
            else
            System.out.println("El numero no es primo");
    }
    
}
