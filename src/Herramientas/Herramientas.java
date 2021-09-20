/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Algoritmos.Burbuja;
import Algoritmos.Burbuja_Optimizado;
import Algoritmos.InsertSort;
import Algoritmos.Ordenamiento;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Manuel
 */
public class Herramientas {

    private double[] arreglo;

    public Herramientas(int tam) {
        this.arreglo = new double[tam];
    }

    public double[] generarMejorCaso() {
        double[] aux = arreglo.clone();
        for (int i = 0; i < aux.length; i++) {
            aux[i] = i + 1;
        }
        return aux;
    }

    public double[] generarPeorCaso() {
        double[] aux = arreglo.clone();
        int num = aux.length;
        for (int i = 0; i < aux.length; i++) {
            aux[i] = num;
            num--;
        }
        return aux;
    }

    public double[] generarCasoMedio() {
        double[] aux = arreglo.clone();
        Random rand = new Random();
        int limite = this.arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            aux[i] = rand.nextInt(limite);
        }
        return aux;
    }

    public void imprimirArreglo(double[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " | ");
        }
        System.out.println("\n");
    }

    public double[] getArreglo() {
        return arreglo;
    }


}
