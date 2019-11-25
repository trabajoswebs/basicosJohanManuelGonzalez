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
        numericos();  // Llamada al método
        logicos();
    }
    
    public static void logicos() {

        //Estos son los tipos básicos
        int random;
        int edad;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        random = (int) (Math.random() * (45 - 5 + 1) + 5) ;
        edad = 18;
        
        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        if(random >= 18){
            System.out.println("Ya tienes edad para aprender a conducir.");
        }
        else{
            System.out.println("Eres muy joven para poder conducir");
        }
    }
    
    /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.print("Valor entero ");
        System.out.println(entero);
        System.out.print("Valor doble ");
        System.out.println(doble);
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
