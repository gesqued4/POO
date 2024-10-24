package act_prog_1;

public class Validar_datos {
    
    /**
     * Metodo para validar numeros
     * @param numero
     * @return 
     */
    
    public boolean validarNumeros(String numero) {
        boolean isnum;
        isnum = numero.matches("[0-9]{1,2}"); // .matches expresion regular valida un numero rango 0-9
        if(!isnum) {
            System.out.println("La edad ingresada es incorrecta o esta fuera de rango...");
        }
        return isnum;
    } // Fin metodo validarNumero
        
    /**
     * Metodo para validar texto
     * @param texto
     * @return 
     */
    
    public boolean validarTexto(String texto) {
        boolean istxt;
        istxt = texto.matches("[a-zA-Z ]+");
        if(!istxt){
            System.out.println("Ingrese solo letras...");
        }
        return istxt;
    } // Fin metodo validarTexto
    
}
