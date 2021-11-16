/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dinamica;

/**
 *
 * @author Manuel
 */
public class Item {
    
    private int peso;
    private int beneficio;

    public Item() {
    }
    public Item(int peso, int beneficio) {
        this.peso = peso;
        this.beneficio = beneficio;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the beneficio
     */
    public int getBeneficio() {
        return beneficio;
    }

    /**
     * @param beneficio the beneficio to set
     */
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
    
    
    
    
}

