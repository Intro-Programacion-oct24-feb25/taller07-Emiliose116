/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;


 /* @author L E N O V O
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 2;
        String cadenaFinal = "";
        int contador = 3;
        
        while (numero <= 37){
           cadenaFinal = String.format("%s%d\n", cadenaFinal, numero);
           numero = numero + contador;
           contador = contador + 2;
        }
        
     System.out.printf("%s", cadenaFinal);
        
    }
    
}
