/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Emiliose
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;      
        String posicion;
        String salir;
        int edad;
        double estatura;
        int contador = 0;
        boolean bandera = true;
        String cadenaFinal = "";
        String cadenaEdades = "";
        String cadenaReporte = "";
        double sumaEstatura = 0;
        double sumaEdades = 0;
        double promedioEstatura;
        double promedioEdades;

        while (bandera) {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();

            contador = contador + 1;
            cadenaReporte = String.format("%s%d. %s -%s-, edad %d, estatura %2f\n",
                    cadenaReporte, contador, nombre, posicion, edad, estatura);

            cadenaEdades = String.format("%s%d\n", cadenaEdades, edad);

            sumaEstatura = sumaEstatura + estatura;
            sumaEdades = sumaEdades + edad;

            

            
         System.out.println("Ingrese si para salir");
            entrada.nextLine();
            salir = entrada.nextLine();
            salir = salir.toLowerCase();
            if (salir.equals("si")) {
                bandera = false;

            }
        }
        
        promedioEstatura = sumaEstatura / contador;
        promedioEdades = sumaEdades / contador;
        cadenaFinal = String.format("listado de Jugadores\n%s\nListado de Edades"
                + "\n%sPromedio de edades: %.1f\nPromedio de estaturas: %.2f",
                cadenaReporte, 
                cadenaEdades, 
                promedioEdades, 
                promedioEstatura
            );
        
        
        
        System.out.printf("%s\n", cadenaFinal);

    }
}
