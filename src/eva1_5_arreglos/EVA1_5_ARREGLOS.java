/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos;

/**
 *
 * @author Kevin ORtiz
 */
public class EVA1_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static final int ARRE_TAMA = 30;

    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[] = new int[ARRE_TAMA];//declaramos un identificador de tipo arreglo
        //arreglos siempre empezar en cero
        //hay que movernos a un valor previo al tamaño del arreglo
        //for (int i = 0; i < aiEdad-length; i++) <--- equivalente, ma<s adecuado       

        for (int i = 0; i < ARRE_TAMA; i++) {//Leemos nuestro arreglo
            System.out.println("aiEdad[" + i + "]=" + aiEdad[i]);

        }
        aiEdad[0] = 25; //POSICION CERO (PRIMERO POSICION DEL ARREGLO) UN VALOR DE 25

        //LLENAR CON VALORES ENTRE 0 Y 36
        //Math.random regresa valores entre 0 y 1 --> 0.15165848
        //Hay que hacer un casting de double a entero (int)
        for (int i = 0; i < aiEdad.length; i++) {
            aiEdad[i] = (int) (Math.random() * 36);
        }
        for (int i = 0; i < ARRE_TAMA; i++) {//Leemos nuestro arreglo
            System.out.println("aiEdad[" + i + "]=" + aiEdad[i]);
        }
        

    }

}
