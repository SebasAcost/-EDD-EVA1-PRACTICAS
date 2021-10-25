/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_6_pasoxval_pasoxref;

/**
 *
 * @author Tsuna0235
 */
public class Eva1_6_PASOXVAL_PASOXREF {
//PASO POR VALOR---> PASAMOS UNA COPIA DEL VALOR EN UNA VARIABLE (LOCALES PRIMITIVOS)
   
    public static void main(String[] args) {
        // TODO code application logic here
    int valOrig = 5;
    System.out.println("valOrig en el main "+ valOrig);
    incrementa(valOrig);
    System.out.println("valOrig despues de llamar a incrementa =  "+ valOrig);
   //demostracion de paso por referencia
    Prueba objPrueba =new Prueba();
    System.out.println("Valor de la x = " + objPrueba.x);
    System.out.println("obj prueba en el main= "+objPrueba);
    System.out.println(objPrueba);
    System.out.println("Valor de la x despues de incrementa = " + objPrueba.x);
    }
    public static void incrementa(int val){
        //opciones para incrementar: val ++, val=val+1, val+=1
    val++;
        System.out.println("valor en incrementa "+ val);

    }
    public static void incrementaObj(Prueba val){
    System.out.println("Objeto en el incrementaObj = "+val);   
    val.x++;
    }
}
class Prueba{
    public int x=10;
}