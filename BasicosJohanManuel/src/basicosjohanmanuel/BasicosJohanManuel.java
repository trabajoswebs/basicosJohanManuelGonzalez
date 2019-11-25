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
    
}
