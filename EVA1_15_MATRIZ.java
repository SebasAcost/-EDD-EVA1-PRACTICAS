/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_matriz;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_15_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO DE DOS DIMENSIONES, 5FILAS X 3 COLUMNAS(ENTEROS)
        int iMatriz[][] = new int [5][3];
        //ACCEDER A UN ELEMENTO:
        iMatriz[0][0] = 1000;
        iMatriz[4][2] = 2000;
        System.out.println("Tamaño del arreglo: "+iMatriz.length);
       
        //ciclo x cada dimension
        //ciclos anidados (ciclo dentro de otro ciclo
        for (int i = 0; i < iMatriz.length; i++) {
            for(int j = 0; j < 3; j++){
                iMatriz[i][j] = 1000;
            }
            
        }
         for (int i = 0; i < iMatriz.length; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print("["+iMatriz[i][j]+"]");
        }
     }           
  }   
}
