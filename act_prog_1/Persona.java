package act_prog_1;
import java.util.Scanner;

public class Persona {
    
    // Objetos class Validar_datos.java
    
    Validar_datos validar = new Validar_datos();
    Scanner sc = new Scanner(System.in);
    
    // Atributos
    
    String nombre, apellidos;
    String sexo, edad;
    String carrera, universidad, titulo;
    boolean universitario , titulado;
      
    /**
     * Metodo para ingresar datos
     */
  
    public void ingresarDatos() { 
        
        System.out.println("");
        do {
            System.out.print("Ingresa tu nombre: ");
            nombre = sc.nextLine();
        } while (!validar.validarTexto(nombre));
        
        do {
            System.out.print("Ingresa tus apellidos: ");
            apellidos = sc.nextLine();
        } while (!validar.validarTexto(apellidos));
        
        do {
            System.out.print("Ingresa tu edad: ");
            edad = sc.nextLine();
        } while (!validar.validarNumeros(edad));
                
        do {
            System.out.print("Sexo (M / F / N): ");
            sexo = sc.nextLine();
            if(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("N")) {
                System.out.println("Opcion incorrecta, selecciona una opcion correcta...");
            }
        } while(!validar.validarTexto(sexo) || !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("N"));
        
        do {
            System.out.print("Cursa la universidad (S / N): "); 
            universidad = sc.nextLine();
            if(!universidad.equalsIgnoreCase("S") && !universidad.equalsIgnoreCase("N")) {
                System.out.println("Opcion incorrecta, selecciona una opcion correcta...");
            }
        } while(!validar.validarTexto(universidad) || !universidad.equalsIgnoreCase("S") && !universidad.equalsIgnoreCase("N"));         
            
        if(universidad.equalsIgnoreCase("S")) { 
                universitario = true;
                do {
                    System.out.print("Carrera que estudia: ");
                    carrera = sc.nextLine();
                } while (!validar.validarTexto(carrera));
                do {
                    System.out.print("Titulado (S / N): ");
                    titulo = sc.nextLine();
                    if(!titulo.equalsIgnoreCase("S") && !titulo.equalsIgnoreCase("N")) {
                        System.out.println("Opcion incorrecta, selecciona una opcion correcta...");
                    }
                } while (!validar.validarTexto(titulo) || !titulo.equalsIgnoreCase("S") && !titulo.equalsIgnoreCase("N"));
                
                if(titulo.equalsIgnoreCase("S")) {
                    titulado = true;
                } else{
                    titulado = false;
                }
                
            } else {
                universitario = false;
                titulado = false;
            }
        System.out.println("");
        System.out.println("¡Datos registrados con exito!");
    } // Fin ingresar datos

    /**
     * Metodo para imprimir datos
     */
    
    public void imprimirDatos(){
        System.out.println("");
        System.out.println("Nombre completo: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        if(sexo.equalsIgnoreCase("M")) {
            System.out.println("Sexo: Masculino");
        } else if (sexo.equalsIgnoreCase("F")){ 
            System.out.println("Sexo: Femenino");
        } else {
            System.out.println("Sexo: Prefiero no decirlo");
        }
        if(universitario) {
            System.out.println("Universitario: 1");
            if(titulado) {
                System.out.println("Titulado: 1");
            } else {
                System.out.println("Titulado: 0");
            }
        } else {
            System.out.println("Universitario: 0");
            System.out.println("Titulado: 0");
        }
    } // Fin imprimir datos
} // Fin class Persona
