/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosjohanmanuel;

/**
 *
 * @author Acer
 */
public class BasicosJohanManuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cadenas();  // Llamada al método
    }
    
    /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void cadenas() {

        //Estos son los tipos básicos
        String nombre;
        String apellidos;
        

        //Ejemplos de asignación de valores a las variables de tipos básicos
        nombre = "Johan Manuel";
        apellidos = "GONZÁLEZ RODRÍGUEZ";

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.print("El nombre del alumno es: ");
        System.out.println(nombre);
        System.out.print("El apellido es: ");
        System.out.println(apellidos);
    }
    
    
}
