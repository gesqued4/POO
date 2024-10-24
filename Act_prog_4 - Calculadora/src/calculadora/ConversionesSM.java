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

public class ConversionesSM {
    //** Conversiones a metros **//
    // Convertir de centímetros a metros
    public double conv_cmM(double valor) { // CM a M
        double metros;
        metros = valor / 100; // Convertir cm a m
        return metros;
    }

    // Convertir de kilómetros a metros
    public double conv_kmM(double valor) { // KM a M
        double metros;
        metros = valor * 1000; // Convertir km a m
        return metros;
    }

    // Convertir de pies a metros
    public double conv_ftM(double valor) { // FT a M
        double metros;
        metros = valor * 0.3048; // Convertir ft a m
        return metros;
    }

    // Convertir de pulgadas a metros
    public double conv_inM(double valor) { // IN a M
        double metros;
        metros = valor * 0.0254; // Convertir in a m
        return metros;
    }

    // Convertir de millas a metros
    public double conv_mileM(double valor) { // Milla a M
        double metros;
        metros = valor * 1609.34; // Convertir milla a m
        return metros;
    }
    
    // ------------------------------------------------------------
    
    // Convertir de metros a centímetros
    public double conv_Mcm(double valor) { // M a CM
        return valor * 100; // Convertir m a cm
    }

    // Convertir de metros a kilómetros
    public double conv_Mkm(double valor) { // M a KM
        return valor / 1000; // Convertir m a km
    }

    // Convertir de metros a pies
    public double conv_Mft(double valor) { // M a FT
        return valor / 0.3048; // Convertir m a ft
    }

    // Convertir de metros a pulgadas
    public double conv_Min(double valor) { // M a IN
        return valor / 0.0254; // Convertir m a in
    }

    // Convertir de metros a millas
    public double conv_Mmile(double valor) { // M a Milla
        return valor / 1609.34; // Convertir m a milla
    }
}
