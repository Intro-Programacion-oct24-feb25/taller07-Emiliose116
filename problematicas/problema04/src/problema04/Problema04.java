/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;


/* @author L E N O V O
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numerador = 1;
        int denominador = 1;
        String cadenaFinal = "";
        int contador = 1;

        while (denominador <= 15) {

            if (denominador == 1) {
                cadenaFinal = String.format("%s%d ", cadenaFinal, numerador);
            } else {
                if (contador % 2 == 0) {
                    cadenaFinal = String.format("%s- %d/%d ", 
                            cadenaFinal, 
                            numerador, 
                            denominador);
                } else {
                    cadenaFinal = String.format("%s+ %d/%d ", 
                            cadenaFinal, 
                            numerador, 
                            denominador);
                }
            }
            denominador = denominador + 2;
                contador = contador + 1;           
        }
        System.out.printf("%s", cadenaFinal);
    }
}
