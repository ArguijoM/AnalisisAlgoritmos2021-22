/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MochilaDinamica;

/**
 *
 * @author Manuel
 */
public class Items {
    private int peso;  
    private int valor;  
    /*** 
           * Constructor 
     */  
    public Items(int weight, int value) {  
        this.valor = value;  
        this.peso = weight;  
    }  
    public int getWeight() {  
        return peso;  
    }  
      
    public int getValue() {  
        return valor;  
    }  
      
    public String toString() {  
        return "[Peso: " + peso + " " + "Valor: " + valor + "]";    
    }  

    
}
