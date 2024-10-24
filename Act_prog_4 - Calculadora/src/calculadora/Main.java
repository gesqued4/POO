/*
Nombre: Gerardo Esqueda Padilla
Fecha: 10 de octubre de 2024
Profesor: Sergio Franco Casillas
Ing en Computacion
Actividad: Actividad de programacion Calculadora
Nombre del proyecto: Calculadora.java
Descripcion: Realizar un programa con las siguientes opciones.     
    Calculadora
        Operaciones basicas
        Conversion de sistemas numericos
        Conversion de sistema metrico
    Realizar frontend
*/

package calculadora;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Main {
    
// Atributos globales
private static boolean ciclo = true, ciclo_opBasicas = true, ciclo_sisNum = true, ciclo_sisMet = true; // Ciclos principales
private static boolean flag = false, flagMenu_2 = true, flagMenu_3 = true, flagValidacion = false; // Banderas
private static String numInp, valInp, opMenu_0, opMenu_1, opMenu_2, opMenu2, opMenu_3, opMenu3; 
private static int decimalRes; // Conv sistema numerico
private static double valor, result; // Conv sistema metrico

// Instanciar objetos
static Scanner sc = new Scanner(System.in);
static Operaciones_basicas opBasicas = new Operaciones_basicas();
static ConversionesSN convSN = new ConversionesSN();
static ConversionesSM convSM = new ConversionesSM();
static Validaciones validar = new Validaciones();

public static void main(String[] args) { // Metodo principal
        
    while(ciclo) {  // Ciclo principal
        if(!flag) {
            menu(0);
            flag = true;	 
        }
        opMenu_0 = sc.nextLine();
        System.out.println("");
	switch(opMenu_0) {  // Switch de opciones principal 
            case "1": {     // Operaciones básicas
                boolean flagOp = true; // Bandera que verifica si es el primer numero ingresado
                String input = null;   // Lee la entrada del usuario
                while(ciclo_opBasicas) {
                    double num;     // Variables op basicas
                    System.out.println("--------------------- OPERACIONES BASICAS --------------------------");
                    System.out.println("");
                    if(flagOp) {
                        System.out.print("Ingrese un numero: ");
                        input = sc.nextLine();
                        if(validar.isNum(input)) {  // Valida la entrada
                            num = Double.parseDouble(input); 
                            opBasicas.setFirstNum(num); // Metodo para guardar el primer numero
                            flagOp = false;
                            flagValidacion = true;
                            
                        } else {
                            System.out.println("");
                            System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                            opBasicas.reset(); // Reinicia el valor de la variable res
                            flagOp = true;
                            flagValidacion = false;
                        }
                        System.out.println("");
                    } else {
                        System.out.println("Resultado actual: " + opBasicas.getRes());
                        System.out.println("");
                    }
                    if(flagValidacion) {
                        menu(1);
                        opMenu_1 = sc.nextLine();
                        switch(opMenu_1) {  // Switch operaciones basicas
                            case "+": { // Suma
                                System.out.println("----------------------------- SUMA --------------------------------");
                                System.out.println("");
                                System.out.print("Ingrese un numero: ");
                                input = sc.nextLine();
                                System.out.println("");
                                if(validar.isNum(input)) {
                                    num = Double.parseDouble(input); 
                                    opBasicas.sum(num); // Metodo para la suma
                                } else {
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                                }
                                break;
                            }   //  Fin case 1
                            case "-": { // Resta
                                System.out.println("----------------------------- RESTA --------------------------------");
                                System.out.println("");
                                System.out.print("Ingrese un numero: ");
                                input = sc.nextLine();
                                System.out.println("");
                                if(validar.isNum(input)) {
                                    num = Double.parseDouble(input);
                                    opBasicas.resta(num);   // Metodo para la resta 
                                } else {
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                                }
                                break;
                            }   // Fin case 2
                            case "*": { // Multiplicacion
                                System.out.println("------------------------ MULTIPLICACION ----------------------------");
                                System.out.println("");
                                System.out.print("Ingrese un numero: ");
                                input = sc.nextLine();
                                System.out.println("");
                                if(validar.isNum(input)) {
                                    num = Double.parseDouble(input);
                                    opBasicas.mult(num); // Metodo para la multiplicacion
                                } else {
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                                }
                                break;
                            }   // Fin case 3
                            case "/": { // Division
                                System.out.println("--------------------------- DIVISION -------------------------------");
                                System.out.println("");
                                System.out.print("Ingrese un numero: ");
                                input = sc.nextLine();
                                System.out.println("");
                                if(validar.isNum(input)) {
                                    num = Double.parseDouble(input);
                                    opBasicas.divide(num);   // Metodo para la division   
                                } else {
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                                }
                                break;
                            } // Fin case 4
                            case "CE": { // Reset
                                System.out.println("--------------------------- CE -------------------------------");
                                System.out.println("");
                                System.out.println("Borrando historial de operaciones, espere un momento...");
                                opBasicas.reset(); // Reinicia el valor de la variable res
                                flagOp = true;
                                System.out.println("Operacion realizada con exito!");
                                System.out.println("");
                                break;
                            }
                            case "S": { // Salir op basicas
                                System.out.println("");
                                System.out.println("Saliendo al menu principal, espere un momento...");
                                System.out.println("");
                                ciclo_opBasicas = false;
                                opBasicas.reset(); // Reinicia el valor de la variable res
                                flagOp = true;
                                break;
                            } // Fin case 5
                            default: {
                                System.out.println("");
                                System.out.println("Opcion incorrecta, seleccione una opcion correcta...");
                                System.out.println("");
                                break;
                            }
                        } // Fin switch operaciones basicas
                        flag = false;
                    } // Fin ciclo operaciones basicas
                } // Fin condicion flagValidacion que verifica si el numero es valido
                break;
            } // Fin case 1
            case "2": {
                while(ciclo_sisNum) {
                    menu(2); 
                    flagMenu_2 = false;
                    opMenu2 = sc.nextLine();
                    switch(opMenu2) { // Switch conv sistemas numericos
                        case "1" : {        
                            System.out.print("Ingrese un numero binario: ");
                            numInp = sc.nextLine();
                            if(validar.isBin(numInp)) { // Método para validar binario
                                menu(2);
                                opMenu_2 = sc.nextLine();
                                conv_sisNum(opMenu_2, opMenu2);
                            } else {
                                System.out.println("");
                                System.out.println("Numero invalido, ingrese un numero binario para continuar...");
                                System.out.println("");
                            }
                            break;
                        }
                        case "2": {
                            System.out.print("Ingrese un numero octal: ");
                            numInp = sc.nextLine();
                            if(validar.isOctal(numInp)) { // Método para validar octal
                                menu(2);
                                opMenu_2 = sc.nextLine();
                                conv_sisNum(opMenu_2, opMenu2);                  
                            } else {
                                System.out.println("");
                                System.out.println("Numero invalido, ingrese un numero binario para continuar...");
                                System.out.println("");
                            }   
                            break;
                        }
                        case "3": {
                            System.out.print("Ingrese un numero decimal: ");
                            numInp = sc.nextLine();
                            if(validar.isDecimal(numInp)) { // Metodo para validar decimal
                                menu(2);
                                opMenu_2 = sc.nextLine();
                                conv_sisNum(opMenu_2, opMenu2);
                            } else {
                                System.out.println("");
                                System.out.println("Numero invalido, ingrese un numero binario para continuar...");
                                System.out.println("");
                            } 
                            break;
                        }
                        case "4": {
                            System.out.print("Ingrese un numero hexadecimal: ");
                            numInp = sc.nextLine();
                            numInp = numInp.toUpperCase();
                            if(validar.isHex(numInp)) { // Metodo para validar hexadecimal
                                menu(2);
                                opMenu_2 = sc.nextLine();
                                conv_sisNum(opMenu_2, opMenu2);
                            } else {
                                System.out.println("");
                                System.out.println("Numero invalido, ingrese un numero binario para continuar...");
                                System.out.println("");
                            }
                            break;
                        }
                        case "5": {
                            System.out.println("");
                            System.out.println("Saliendo al menu principal, espere un momento...");
                            System.out.println("");
                            ciclo_sisNum = false;
                            break;
                        }
                        default: {
                            System.out.println("");
                            System.out.println("Opcion incorrecta, seleccione una opcion correcta...");
                            System.out.println("");
                        }
                    } // Fin switch conv sistemas numericos
                    flagMenu_2 = true;
                } // Fin ciclo sistemas numericos
                flag = false;
                break;
            } // Fin case 2
            case "3": {
                while(ciclo_sisMet) {
                    menu(3);
                    flagMenu_3 = false;
                    opMenu3 = sc.nextLine();
                    switch(opMenu3) { // Switch conv sistema metrico
                        case "1": {
                            System.out.print("Ingrese un valor en cm: ");
                            valInp = sc.nextLine();
                            if(validar.isNum(valInp)) {
                                valor = Double.parseDouble(valInp);
                                menu(3);
                                opMenu_3 = sc.nextLine();
                                conv_sisMet(opMenu_3, opMenu3);
                            }
                            else {
                                    System.out.println("");
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                            }
                            break;
                        }
                        case "2": {
                            System.out.print("Ingrese un valor en m: ");
                            valInp = sc.nextLine();
                            if(validar.isNum(valInp)) {
                                valor = Double.parseDouble(valInp);
                                menu(3);
                                opMenu_3 = sc.nextLine();
                                conv_sisMet(opMenu_3, opMenu3);
                            } else {
                                    System.out.println("");
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                            }
                            break;
                        }
                        case "3": {
                            System.out.print("Ingrese un valor en km: ");
                            valInp = sc.nextLine();
                            if(validar.isNum(valInp)) {
                                valor = Double.parseDouble(valInp);
                                menu(3);
                                opMenu_3 = sc.nextLine();
                                conv_sisMet(opMenu_3, opMenu3);
                            } else {
                                    System.out.println("");
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                            }
                            break;
                        }
                        case "4": {
                            System.out.print("Ingrese un valor en ft: ");
                            valInp = sc.nextLine();
                            if(validar.isNum(valInp)) {
                                valor = Double.parseDouble(valInp);
                                menu(3);
                                opMenu_3 = sc.nextLine();
                                conv_sisMet(opMenu_3, opMenu3);
                            } else {
                                    System.out.println("");
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                            }
                            break;
                        }
                        case "5": {
                            System.out.print("Ingrese un valor en in: ");
                            valInp = sc.nextLine();
                            if(validar.isNum(valInp)) {
                                valor = Double.parseDouble(valInp);
                                menu(3);
                                opMenu_3 = sc.nextLine();
                                conv_sisMet(opMenu_3, opMenu3);
                            } else {
                                    System.out.println("");
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                            }
                            break;
                        }
                        case "6": {
                            System.out.print("Ingrese un valor en miles: ");
                            valInp = sc.nextLine();
                            if(validar.isNum(valInp)) {
                                valor = Double.parseDouble(valInp);
                                menu(3);
                                opMenu_3 = sc.nextLine();
                                conv_sisMet(opMenu_3, opMenu3);
                            } else {
                                    System.out.println("");
                                    System.out.println("El  numero ingresado no es valido..."); // Msj de error en caso de que el numero no sea valido
                                    System.out.println("");
                            }
                            break;
                        }
                        case "7": {
                            System.out.println("");
                            System.out.println("Saliendo al menu principal, espere un momento...");
                            System.out.println("");
                            ciclo_sisMet = false;
                            break;
                        }
                        default: {
                            System.out.println("");
                            System.out.println("Opcion incorrecta, seleccione una opcion correcta...");
                            System.out.println("");
                            break;
                        }
                    } // Fin switch conv sistema metrico
                    flagMenu_3 = true;
                } // Fin ciclo sistema metrico
                flag = false;
                break;
            }
            case "4": {
                System.out.println("");
                System.out.println("Gracias por su visita, vuelva pronto...");
                System.out.println("");
                ciclo = false;
                break;
            }
            default: {
                System.out.println("Opcion incorrecta, seleccione una opcion correcta...");
                System.out.println("");
                flag = false;
            }
        } // Fin switch menu principal      
    } // Fin ciclo principal
} // Fin método main	

/* Metodo para imprimir menus*/
public static void menu(int x) { // Metodo para imprimir menus
    switch(x) {
        case 0: {
            System.out.println("------------------------- CALCULADORA ------------------------------");
            System.out.println("");
            System.out.println("1. Operaciones basicas");
            System.out.println("2. Conversion sistemas numericos");
            System.out.println("3. Conversion sistemas metricos");
            System.out.println("4. Salir");
            break;
        }
        case 1: {
            // System.out.println("--------------------- OPERACIONES BASICAS --------------------------");
            // System.out.println("");
            System.out.println("+. Suma");
            System.out.println("-. Resta");
            System.out.println("*. Multiplicacion");
            System.out.println("/. Division");
            System.out.println("CE. Reset");
            System.out.println("S. Salir");
            break;
        }
        case 2: {
            if(flagMenu_2) {
                System.out.println("----------------- CONVERSION SISTEMA NUMERICO ---------------------");
                System.out.println("");
                System.out.println("Que sistema numerico desea convertir?");
                System.out.println("1. Binario");
                System.out.println("2. Octal");
                System.out.println("3. Decimal");
                System.out.println("4. Hexadecimal");
                System.out.println("5. Salir");
            } else {
                System.out.println("");
                System.out.println("A que sistema numerico desea convertirlo?");
                if(!"1".equals(opMenu2)) { 
                    System.out.println("1. Binario");
                } 
                if(!"2".equals(opMenu2)) {
                    System.out.println("2. Octal");
                } 
                if(!"3".equals(opMenu2)) {
                    System.out.println("3. Decimal");
                } 
                if(!"4".equals(opMenu2)) {
                    System.out.println("4. Hexadecimal");
                }
            }
            break;
        }
        case 3: {
            if(flagMenu_3) {
                System.out.println("------------------------- CONVERSION SISTEMA METRICO ------------------------------");
                System.out.println("");
                System.out.println("Que sistema metrico desea convertir?");
                System.out.println("1. Cm");
                System.out.println("2. M");
                System.out.println("3. Km");
                System.out.println("4. Ft");
                System.out.println("5. In");
                System.out.println("6. Mile");
                System.out.println("7. Salir");
            } else {
                System.out.println("");
                System.out.println("A que sistema metrico desea convertirlo?");
                if(!"1".equals(opMenu3)) { 
                    System.out.println("1. Cm");
                } 
                if(!"2".equals(opMenu3)) {
                    System.out.println("2. M");
                } 
                if(!"3".equals(opMenu3)) {
                    System.out.println("3. Km");
                } 
                if(!"4".equals(opMenu3)) {
                    System.out.println("4. Ft");
                }
                if(!"5".equals(opMenu3)) {
                    System.out.println("5. In");
                }
                if(!"6".equals(opMenu3)) {
                    System.out.println("6. Mile");
                }
            }
            break;
        }
    } // Fin switch menu
    System.out.println("");
    System.out.print("Seleccione una opcion: ");
} // Fin metodo menu

/* Métodos para conversion de sistemas numéricos */
public static void conv_sisNum(String a, String b) {
    if("3".equals(b)) {
        decimalRes = parseInt(numInp);
    }
    switch(a) {
        case "1": {
            if("1".equals(a) && !"1".equals(b)) {
		System.out.println("Binario: " + convSN.decimalABinario(decimalRes));// Método para convertir decimal a binario
                System.out.println("");
            } else {
		System.out.println("El numero ya es binario");
            }
            break;
	}
	case "2": {
            if("2".equals(a) && !"2".equals(b)) {
		System.out.println("Octal: " + convSN.decimalAOctal(decimalRes));// Método para convertir decimal a octal
                System.out.println("");
            } else {
            System.out.println("El numero ya es octal");
            }
            break;
        }
	case "3": {
            if("3".equals(a) && !"3".equals(b)) {
		switch(b) {
                    case "1": {
                        decimalRes = convSN.convertirBinarioADecimal(numInp);
                        System.out.println("Decimal: " + decimalRes); // Método para convertir binario a decimal)
                        System.out.println("");
                        break;
                    } 
                    case "2": {
                        decimalRes = convSN.convertirOctalADecimal(numInp);
                        System.out.println("Decimal: " + decimalRes);// Método para convertir octal a decimal
                        System.out.println("");
                        break;
                    } 
                    case "4": {
                        decimalRes = convSN.convertirHexadecimalADecimal(numInp);
                        System.out.println("Decimal: " + decimalRes);// Metodo para convertir hexadecimal a decimal
                        System.out.println("");
                        break;
                    }
                } // Fin switch
            } else {
                System.out.println("El número ya es decimal");
            }
            break;
	}
	case "4": {
            if("4".equals(a) && !"4".equals(b)) {
		System.out.println("Hexadecimal: " + convSN.decimalAHexadecimal(decimalRes));// Método para convertir decimal a hexadecimal
                System.out.println("");
            } else {
		System.out.println("El numero ya es hexadecimal");
            }
            break;
	}
        default: {
            System.out.println("Opcion incorrecta, seleccione una opcion correcta...");
        }
    } // Fin switch conv sistemas numericos
} // Fin metodo conversion de sistemas numericos

/* Métodos para conversion de sistemas métricos */
public static void conv_sisMet(String a, String b) {
    if("2".equals(b)) {
        result = valor;
    }
    switch(a) {
        case "1": {
            if("1".equals(a) && !"1".equals(b)) {
		System.out.println("CM: " + convSM.conv_Mcm(result));// Método para convertir m a cm
                System.out.println("");
            } else {
		System.out.println("El valor ya es cm");
            }
            break;
	}
	case "2": {
            if("2".equals(a) && !"2".equals(b)) {
		switch(b) {
                    case "1": {
                        result = convSM.conv_cmM(valor); 
                        System.out.println("M: " + result); // Método para convertir cm a m
                        System.out.println("");
                        break;
                    } 
                    case "3": {
                        result = convSM.conv_kmM(valor);
                        System.out.println("M: " + result);// Método para convertir km a m
                        System.out.println("");
                        break;
                    } 
                    case "4": {
                        result = convSM.conv_ftM(valor);
                        System.out.println("M: " + result);// Método para convertir ft a m
                        System.out.println("");
                        break;
                    } 
                    case "5": {
                        result = convSM.conv_inM(valor);
                        System.out.println("M: " + result);// Metodo para convertir in a m
                        System.out.println("");
                        break;
                    }
                    case "6": {
                        result = convSM.conv_mileM(valor);
                        System.out.println("M: " + result);// Método para convertir mile a m
                        System.out.println("");
                        break;
                    } 
                } // Fin switch
            } else {
            System.out.println("El valor ya es M");
            }
            break;
        }
	case "3": {
            if("3".equals(a) && !"3".equals(b)) {
		System.out.println("KM: " + convSM.conv_Mkm(result));// Método para convertir m a km
                System.out.println("");
            } else {
                System.out.println("El valor ya es KM");
            }
            break;
	}
	case "4": {
            if("4".equals(a) && !"4".equals(b)) {
		System.out.println("Ft: " + convSM.conv_Mft(result));// Método para convertir m a ft
                System.out.println("");
            } else {
		System.out.println("El valor ya es Ft");
            }
            break;
	}
        case "5": {
            if("5".equals(a) && !"5".equals(b)) {
		System.out.println("IN: " + convSM.conv_Min(result));// Método para convertir m a in
                System.out.println("");
            } else {
		System.out.println("El valor ya es IN");
            }
            break;
	}
        case "6": {
            if("6".equals(a) && !"6".equals(b)) {
		System.out.println("Mile: " + convSM.conv_Mmile(result));// Método para convertir m a mile
                System.out.println("");
            } else {
		System.out.println("El valor ya es Mile");
            }
            break;
	}
        default: {
            System.out.println("Opcion incorrecta, seleccione una opcion correcta...");
        }
    } // Fin switch conv sistema metrico
} // Fin metodo conversion de sistema metrico

} // Fin class main
