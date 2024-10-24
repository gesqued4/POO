package act_prog_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    // Clase Alumno para almacenar la información del alumno
    static class Alumno {
        String nombre;
        String apellidos;
        String descripcion;
        int grado;
        String grupo;

        Alumno(String nombre, String apellidos, String descripcion, int grado, String grupo) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.descripcion = descripcion;
            this.grado = grado;
            this.grupo = grupo;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + " " + apellidos + 
                   "\nDescripcion: " + descripcion + 
                   "\nGrado: " + grado + 
                   "\nGrupo: " + grupo;
        }
    }

    public static boolean bucle = true;
    public static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (bucle) {  // Ciclo while
            menu();
            String op_case = sc.nextLine();
            System.out.println("");
            switch (op_case) {
                case "1": { // Case 1: Ingresar datos del alumno
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese los apellidos: ");
                    String apellidos = sc.nextLine();
                    System.out.print("Ingrese una descripcion: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingrese el grado: ");
                    int grado = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el grupo: ");
                    String grupo = sc.nextLine();

                    alumnos.add(new Alumno(nombre, apellidos, descripcion, grado, grupo));
                    System.out.println("Alumno guardado.");
                    break;
                }
                case "2": { // Case 2: Mostrar datos por grado y grupo
                    if (alumnos.isEmpty()) {
                        System.out.println("No existen datos para mostrar...");
                    } else {
                        // Ordenar por grado y grupo
                        Collections.sort(alumnos, Comparator
                            .comparingInt((Alumno a) -> a.grado)
                            .thenComparing(a -> a.grupo));
                        for (Alumno alumno : alumnos) {
                            System.out.println(alumno);
                            System.out.println();
                        }
                    }
                    break;
                }
                case "3": { // Case 3: Eliminar alumnos
                    System.out.print("Ingrese el nombre del alumno a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    System.out.print("Ingrese los apellidos del alumno a eliminar: ");
                    String apellidosEliminar = sc.nextLine();

                    boolean eliminado = alumnos.removeIf(alumno -> 
                        alumno.nombre.equalsIgnoreCase(nombreEliminar) && 
                        alumno.apellidos.equalsIgnoreCase(apellidosEliminar));

                    if (eliminado) {
                        System.out.println("Alumno encontrado, alummno eliminado.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                }
                case "4": { // Case 4: Buscar alumnos
                    System.out.print("Ingrese el nombre del alumno a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    System.out.print("Ingrese los apellidos del alumno a buscar: ");
                    String apellidosBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Alumno alumno : alumnos) {
                        if (alumno.nombre.equalsIgnoreCase(nombreBuscar) && 
                            alumno.apellidos.equalsIgnoreCase(apellidosBuscar)) {
                            System.out.println(alumno);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                }
                case "5": { // Case 5: Eliminar todos los alumnos
                    alumnos.clear();
                    System.out.println("Todos los alumnos han sido eliminados.");
                    break;
                }
                case "6": { // Case 6: Salir
                    bucle = false;
                    break;
                }
                default: {
                    System.out.println("Opcion incorrecta, seleccione una opcion correcta para continuar...");
                    break;
                }
            }
        }
        sc.close();
    }

    /**
     * Metodo para imprimir el menu
     */
    public static void menu() {
        System.out.println("");
        System.out.println("1. Ingresar datos del alumno");
        System.out.println("2. Mostrar datos por grado y grupo");
        System.out.println("3. Eliminar alumno");
        System.out.println("4. Buscar alumno");
        System.out.println("5. Eliminar todos los alumnos");
        System.out.println("6. Salir");
        System.out.println("");
        System.out.print("Seleccione una opcion: ");
    }
}
