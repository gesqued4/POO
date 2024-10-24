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

public class Validaciones {
    public boolean isNum(String str) {  // Metodo para validar que la entrada sea un numero
        try {
            Double.parseDouble(str); // Intenta convertir la cadena a un número
            return true; // Si es un número, devuelve true
        } catch (NumberFormatException e) {
            return false; // Si no es un número, devuelve false
        }
    }
    public boolean isBin(String str) {  // Metodo para validar que sea binario
        return str.matches("[01]+");
    }
    public boolean isOctal(String str) { // Metodo para validar que sea octal
        return str.matches("[0-7]+");
    }
    public boolean isDecimal(String str) { // Metodo para validar que sea decimal
        return str.matches("[0-9]+");
    }
    public boolean isHex(String str) {  // Metodo para validar que sea hexadecimal
        return str.matches("[0-9A-F]+");
    }
}
