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

public class ConversionesSN {

//Funciones a DECIMAL------------------------------------------------------------------------------------------------
    // Función para convertir binario a decimal

    /**
     *
     * @param numero
     * @return
     */

    public int convertirBinarioADecimal(String numero) {
        int decimal = 0;
        int potencia = 1; // Comenzamos en 2^0

        for (int i = numero.length() - 1; i >= 0; i--) {
            char digito = numero.charAt(i);
            if (digito == '1') {
                decimal += potencia;
            }
            potencia *= 2;
        }

        return decimal;
    }
    
    // Función para convertir octal a decimal
    public int convertirOctalADecimal(String numero) {
        int decimal = 0;
        int potencia = 1; // Comenzamos en 8^0

        for (int i = numero.length() - 1; i >= 0; i--) {
            char digito = numero.charAt(i);
            int valorDigito = digito - '0'; // Convertimos el carácter a número
            decimal += valorDigito * potencia;
            potencia *= 8;
        }

        return decimal;
    }
    
    // Función para convertir hexadecimal a decimal
    public int convertirHexadecimalADecimal(String numero) {
        int decimal = 0;
        int potencia = 1; // Comenzamos en 16^0
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = numero.length() - 1; i >= 0; i--) {
            char digito = numero.charAt(i);

            // Encontrar el valor decimal del carácter hexadecimal usando el arreglo
            for (int j = 0; j < hexChars.length; j++) {
                if (digito == hexChars[j]) {
                    decimal += j * potencia; // j es el valor decimal del carácter
                    break; // Salimos del bucle una vez que encontramos el carácter
                }
            }

            potencia *= 16; // Incrementamos la potencia de 16
        }

        return decimal;
    }
//---------------------------------------------------------------------------------------------------------------------------------------

    // Método para convertir decimal a binario

    /**
     *
     * @param decimal
     * @return
     */
    public String decimalABinario(int decimal) {
        String binario = "";
        while (decimal > 0) {
            int residuo = decimal % 2;
            binario = residuo + binario;  // Concatenar el residuo al inicio
            decimal = decimal / 2;  // Dividir el decimal por 2
        }
        if (binario.equals("")) {
            return "0";  // Si el número es 0
        }
        return binario;
    }

    // Método para convertir decimal a octal
    public String decimalAOctal(int decimal) {
        String octal = "";
        while (decimal > 0) {
            int residuo = decimal % 8;
            octal = residuo + octal;  // Concatenar el residuo al inicio
            decimal = decimal / 8;  // Dividir el decimal por 8
        }
        if (octal.equals("")) {
            return "0";  // Si el número es 0
        }
        return octal;
    }

    // Método para convertir decimal a hexadecimal
    public String decimalAHexadecimal(int decimal) {
        String hexadecimal = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            int residuo = decimal % 16;
            hexadecimal = hexChars[residuo] + hexadecimal;  // Concatenar el residuo al inicio
            decimal = decimal / 16;  // Dividir el decimal por 16
        }
        if (hexadecimal.equals("")) {
            return "0";  // Si el número es 0
        }
        return hexadecimal;
    }
 
}

