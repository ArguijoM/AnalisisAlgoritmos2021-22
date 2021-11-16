/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dinamica;

import MochilaDinamica.*;
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class ProblemaMochila {

    private ArrayList<Item> bags;
    private int PesoTotal;
    private int n;
    private int[][] MejoresValores;

    private int MejorValor;

    private ArrayList<Item> MejorSolucion;

    public ProblemaMochila(ArrayList<Item> bags, int totalWeight) {
        this.bags = bags;
        this.PesoTotal = totalWeight;
        this.n = bags.size();
        if (MejoresValores == null) {
            MejoresValores = new int[n + 1][totalWeight + 1];
        }
    }

    /**
     * Resuelva el problema de la mochila con las primeras n mochilas con un
     * peso total dado de peso total
     *
     */
    public void solve() {

        System.out.println("Mochila con capacidad total: " + PesoTotal);
        for (Item b : bags) {
            System.out.println("("+b.getPeso()+" , "+b.getBeneficio()+")");
        }
          
                 // encuentra el valor óptimo  
        for (int j = 0; j <= PesoTotal; j++) {
            for (int i = 0; i <= n; i++) {

                if (i == 0 || j == 0) {
                    MejoresValores[i][j] = 0;
                } else {
                    // Si el peso de la mochila i-th es mayor que la carga total, la solución óptima existe en las primeras mochilas i-1,  
                    // Nota: la i-ésima mochila es bolsas [i-1]  
                    if (j < bags.get(i - 1).getPeso()) {
                        MejoresValores[i][j] = MejoresValores[i - 1][j];
                    } else {
                        // Si la mochila i-th no es mayor que la carga total, la solución óptima es la solución óptima que contiene la mochila i-th,  
                        // O la solución óptima que no contiene la i-ésima mochila, la que sea máxima, y ​​se utiliza el método de discusión de clasificación  
                        // El peso, el peso y el valor del valor de la i-ésima mochila  
                        int iweight = bags.get(i - 1).getPeso();
                        int ivalue = bags.get(i - 1).getBeneficio();
                        MejoresValores[i][j]
                                = Math.max(MejoresValores[i - 1][j], ivalue + MejoresValores[i - 1][j - iweight]);
                    } // else
                } //else           
            } //for  
        } //for  

        // Resuelve la composición de la mochila  
        if (MejorSolucion == null) {
            MejorSolucion = new ArrayList<Item>();
        }
        int tempWeight = PesoTotal;
        for (int i = n; i >= 1; i--) {
            if (MejoresValores[i][tempWeight] > MejoresValores[i - 1][tempWeight]) {
                MejorSolucion.add(bags.get(i-1));
                //MejorSolucion.add(bags[i - 1]); // bolsas [i-1] significa la i-ésima mochila  
                tempWeight -= bags.get(i - 1).getPeso();
            }
            if (tempWeight == 0) {
                break;
            }
        }
        MejorValor = MejoresValores[n][PesoTotal];
    }

    public int getBestValue() {
        return MejorValor;
    }

    public int[][] getBestValues() {

        return MejoresValores;
    }
    public ArrayList<Item> getBestSolution() {
        return MejorSolucion;
    }

}
