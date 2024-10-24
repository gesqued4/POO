/*
Nombre: Gerardo Esqueda Padilla
Fecha: 03 de septiembre de 2024
Actividad: Actividad de programacion 1
Nombre del proyecto: Act_prog_1.java
Descripcion: Realizar un programa con las siguientes opciones.     
Menú (ciclo)
    Op. 1: Solicitar Nombre, Apellidos, edad, sexo (M - masculino, F- Femenino, N-No deseo decirlo), Qué estudia, y universitario, si esta titulado o no (valor boolean que se maneje como 0 (no ha terminado, 1 Titulado)
    Op 2: Relizar operaciones basicas de 2 números (+, -, *, y /), los valores que entran deben ser textuales y el programa debe realizar las conversiones correspondientes para manejarlos como números.
    Op 3. Mostrar los datos de entrada, de una forma ordenada, ejemplo:
        Nombre: Sergio Franco Casillas
        Sexo: Masculino
        Edad: XX años
        Estatura: 1.75 metros
        Otros datos solicitados.
*/
package act_prog_1;
/*
Biblioteca de funciones
*/
import java.util.Scanner;

public class Main {
     
    // Atributos

    private static boolean bucle = true, flag = false;
    private static String op_case;
    
    /**
     * @param args
     */    

    public static void main(String[] args) {
        
        // Objetos

        Persona persona = new Persona();
        Operaciones_basicas opBasicas = new Operaciones_basicas();
        Scanner sc = new Scanner(System.in);
        
        while(bucle) {  // Ciclo while
            menu();
            op_case = sc.nextLine();
            switch(op_case) { 
                case "1": { // Case 1: Ingresar datos
                    persona.ingresarDatos();
                    flag = true;
                    break;
                } // Fin case 1
                case "2": { // Case 2: Operaciones basicas 
                    opBasicas.main();
                    break;
                } // Fin case 2
                case "3": { // Case 3: Imprimir datos
                    if(flag) {
                        persona.imprimirDatos();
                    } else {
                        System.out.println("");
                        System.out.println("No existen datos para mostrar...");
                        System.out.println("Ingrese datos para continuar...");
                    } 
                    break;
                } // Fin case 3
                case "4": { // Case 4: Salir
                    bucle = false;
                    break;
                } // Fin case 4
                default: {
                    System.out.println("");
                    System.out.println("Opcion incorrecta, seleccione una opcion correcta para continuar...");
                    break;
                } // Fin default
            } // Fin switch
        } // Fin while
    } // Fin metodo main

    /**
     * Metodo para imprimir el menu
     */

    public static void menu() {
        System.out.println("");
        System.out.println("1. Ingresar Datos");
        System.out.println("2. Operaciones Basicas");
        System.out.println("3. Mostrar Datos");
        System.out.println("4. Salir");
        System.out.println("");
        System.out.print("Seleccione una opcion: ");
    }   // Fin metodo menu
} // Fin class Main
