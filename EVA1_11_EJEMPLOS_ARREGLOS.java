/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_ejemplos_arreglos;

import java.util.Scanner;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_11_EJEMPLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //preguntar el tamaño del grupo
     Scanner input = new Scanner(System.in);
     System.out.println("Indica el tamaño del grupo: ");
     int iTama =input.nextInt();
     int aiEdades[] = new int [iTama];//decalran un arreglo, tamaño iTama
     
        for (int i = 0; i < aiEdades.length; i++) {//desde el primer elemento
            System.out.println("Edad: ");
            aiEdades[i] = input.nextInt();
            
        }
        int iAcum = 0;
         for (int i = 0; i < aiEdades.length; i++) {
             System.out.print("["+ aiEdades[i]+"]");
             iAcum = iAcum + aiEdades[i];
         }
         double dProm =iAcum/iTama;
         System.out.println("Promedio: "+dProm);
     
    }
    
}
