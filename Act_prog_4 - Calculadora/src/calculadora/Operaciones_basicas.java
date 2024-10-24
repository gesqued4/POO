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

public class Operaciones_basicas {
    private double res;
    private boolean flag = true;
  
    public Operaciones_basicas() {
        this.res = 0; // Inicializa el resultado
    }
    /* Metodos operaciones basicas */ 
    public void setFirstNum(double num) {
        if(flag && res == 0) {
            res = num;
            flag = false;
        }
    }
    public void sum(double num) { // Metodo para la suma
        res += num;
    }
    public void resta(double num) { // Metodo para la resta
        res -= num;
    }
    public void mult(double num) { // Metodo para la multiplicacion
        res *= num;
    }
    public void divide(double num) { // Metodo para la division
        if (num != 0) { // Verifica si el divisor no es cero
            res /= num; 
        } else {
            System.out.println("No se puede dividir por cero."); 
            System.out.println("");
        }
    }
    public void reset() { // Metodo para restablecer el valor del resultado
        res = 0;
        flag = true;
    }
    public double getRes() { // Metodo par devolver el resultado de las operaciones
        return res;
    }
}
