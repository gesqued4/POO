
package act_prog_1;
import java.util.Scanner;

public class Operaciones_basicas {
    
    // Instancio el objeto sc
    
    Scanner sc = new Scanner(System.in);
           
    // Atributos
    
    String num_1, num_2, op_case;
    double numDouble_1, numDouble_2;
    boolean ciclo = true, flag;

    public void main() {
        if(flag) {
            ciclo = true;
        }
        while(ciclo) { // Ciclo while
            menu();
            op_case = sc.nextLine();
          
            switch(op_case) {
                case "1": {
                    ingresarNum();
                    convNum();
                    double sum = numDouble_1 + numDouble_2;
                    System.out.println("La suma de " + numDouble_1 + " + " + numDouble_2 + " es igual a: " + sum);
                    break;
                }
                case "2": {
                    ingresarNum();
                    convNum();
                    double res = numDouble_1 - numDouble_2;
                    System.out.println("La resta de " + numDouble_1 + " - " + numDouble_2 + " es igual a: " + res);
                    break;
                }
                case "3": {
                    ingresarNum();
                    convNum();
                    double mult = numDouble_1 * numDouble_2;
                    System.out.println("La multiplicacion de " + numDouble_1 + " * " + numDouble_2 + " es igual a: " + mult);
                    break;
                }
                case "4": {
                    ingresarNum();
                    convNum();
                    double div = numDouble_1 / numDouble_2;
                    System.out.println("La division de " + numDouble_1 + " / " + numDouble_2 + " es igual a: " + div);
                    break;
                }
                case "5": {
                    ciclo = false;
                    flag = true;
                    break;
                }
                default: {
                    System.out.println("");
                    System.out.println("Opcion incorrecta, seleccione una opcion correcta para continuar...");
                } // Fin default
            } // Fin switch
        } // Fin ciclo while
    } // Fin metodo main
    
    /**
     * Metodo para imprimir el menu
     */
    
    public void menu() {
        System.out.println("");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    } // Fin metodo menu
    
    /**
     * Metodo para solicitar numeros
     */
    
    public void ingresarNum() {
        System.out.println("");
        System.out.print("Ingrese un numero: ");
        num_1 = sc.nextLine();
        System.out.print("Ingrese otro numero: ");
        num_2 = sc.nextLine();
        System.out.println("");
    } // Fin metodo ingresarNum
    
    /**
     * Metodo para convertir string a double
     */
    
    public void convNum() {
        numDouble_1 = Double.parseDouble(num_1);
        numDouble_2 = Double.parseDouble(num_2);
    } // Fin metodo convNum
} // Fin class Operaciones_basicas
