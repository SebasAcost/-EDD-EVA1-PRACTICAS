package eva1_10_length;

/**
 *
 * @author Tsuna0235
 */
public class EVA1_10_LENGTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiDatos = new int[100];
        System.out.println("Tamaño del arreglo: " +aiDatos.length);
        System.out.println(aiDatos);
        System.out.println(args);
        double[] algo = new double[100];
        System.out.println(algo);
        
        for (int i=0; i<aiDatos.length ; i++){
            aiDatos[i] = (int)(Math.random()*100);
            
        }
        for(int i=0; i<aiDatos.length; i++){
            System.out.print("["+aiDatos[i]+"]");
    }
  }
}
    
