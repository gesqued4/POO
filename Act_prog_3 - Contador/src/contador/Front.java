package contador;
import java.util.Scanner;
/**
 *
 * @author pades
 */
public class Front {

    /**
     * @param args the command line arguments
     */
    // Atributos globales
    private static boolean flag = true;
    private static int num;
    // Instanciar scanner
    static Scanner sc = new Scanner(System.in);
    // Metodo main
    public static void main(String[] args) {
        // Atributos locales
        boolean ciclo = true;
        String opc;
        // Instanciar el contador
        Counter cnt = new Counter();
        while(ciclo) {
            menu();
            flag = false;
            System.out.println("Valor actual contador: " + cnt.getNum());
            System.out.println("Valor actual limite: " + cnt.getLimite());
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextLine();
            switch(opc) {      
                case "1": { // Incrementar contador      
                    if(cnt.addNum()){
                        msj();
                    }
                    else {
                        msjError();
                    }    
                    break;
                } // Fin case 1
                case "2": { // Sumar num a contador
                    inputUser();
                    if(cnt.addNum(num)){
                        msj();
                    }
                    else{
                        msjError();
                    }
                    break;
                } // Fin case 2
                case "3": { // Modificar contador
                    inputUser();
                    if(cnt.modNum(num)){
                        msj();
                    }
                    else{
                        msjError();
                    }    
                    break;
                } // Fin case 3
                case "4": { // Decrementar contador
                    cnt.decreaseNum();
                    msj();
                    break;
                } // Fin case 4
                case "5": { // Modificar limite
                    inputUser();
                    cnt.modLimite(num);
                    msj();
                    break;
                }
                case "6": { // Salir
                    ciclo = false;
                    break;
                } //  Fin case 5
                default: {
                    System.out.println("");
                    System.out.println("Opcion invalida, seleccione una opcion correcta...");
                    break;
                } // Fin default
            } // Fin switch
        } // Fin while
    } // Fin main
    
    // Metodo para imprimir menu
    public static void menu(){
        if(flag){
            System.out.println("\t\t\t\tCONTADOR");
        }
        System.out.println("");
        System.out.println("1. Incrementar contador");
        System.out.println("2. Sumar numero a contador");
        System.out.println("3. Modificar contador");
        System.out.println("4. Decrementar contador");
        System.out.println("5. Modificar limite");
        System.out.println("6. Salir");
        System.out.println("");
    } // Fin menu
    
    // Metodo para imprimir mensaje de operacion relizada con exito
    public static void msj(){
        System.out.println("");
        System.out.println("Operacion realizada con exito...");
    }
    // Metodo para imprimir un mensaje de error
    public static void msjError(){
        System.out.println("");
        System.out.println("Error el numero ha excedido el limite del contador");
    }    
    // Metodo para leer la entrada del usuario
    public static void inputUser(){
        boolean valido = false;
        while(!valido){
            System.out.print("Ingrese un numero entero: ");
            // Validar que sea un numero entero
            try{ 
                num = Integer.parseInt(sc.nextLine());
                valido = true;
            }
            catch(NumberFormatException e){
                System.out.println("");
                System.out.println("Error no has ingresado un numero entero valido...");
                System.out.println("");
            }
            /*num = sc.nextInt();
            sc.nextLine();*/
        }
    }
} // Fin class Front
