/*
 Documentacion
 */
package contador;

/**
 * @author pades
 */
public class Counter {
    // Atributos
    private int numero;
    private int limite;
    
    // Constructor por default
    public Counter(){
        /* this sirve para identificar los atributos de la clase 
        y los parametros de la clase cuando se llaman igual */
        this.numero = 0;
        this.limite = 1000000;
    } // Fin counter
    
    /**
     * @param x Inicializar el contador en un valor x dado por el programador
     */
    public Counter(int x){
        this.numero = x;
        this.limite = 1000000;
    }
    
    // Sobrecarga de metodos
    
    // Metodo para sumar 1 al contador
    public boolean addNum(){
        if (this.numero + 1 > this.limite) {
            return false;
        } else {
            this.numero++;
            return true;
        }    
    }
    // Metodo para sumar al contador el num ingresado por el usuario
    public boolean addNum(int x){
        if (this.numero + x > this.limite) {            
            return false;
        } else {
            this.numero += x;
            return true;
        }
    }
    // Metodo para modificar el contador el num ingresado por el usuario
    public boolean modNum(int x){
        if (x > this.limite) {
            return false;
        } else {
            this.numero = x;
            return true;
        }
    }
    // Metodo para imprimir el contador actual
    public int getNum(){
        return this.numero;
    }
    // Metodo para decrementar numero
    public void decreaseNum(){
        this.numero --;
    }
    // Metodo para modificar el limite
    public void modLimite(int x){
        this.limite = x;
    }
    // Metodo para imprimir el limite actual
    public int getLimite(){
        return this.limite;
    }
}
