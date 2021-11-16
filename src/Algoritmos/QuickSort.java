/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author Manuel
 */
public class QuickSort implements Ordenamiento {

    private double[] arreglo;
    private int verificaciones, interaciones;
    private double tiempo_e;
    private double tiempo_i, tiempo_f;

    public QuickSort() {
        this.verificaciones = 0;
        this.interaciones = 0;
        this.arreglo = null;
        this.tiempo_e = 0;
        this.tiempo_i = 0;
        this.tiempo_f = 0;
    }

    @Override
    public void ordenarArreglo() {
        // implementar el metodo de ordenamiento por mezcla
        // verificar que los datos no sean nulos
        if (arreglo != null) {
            double tmpArray[] = this.arreglo.clone();
            this.tiempo_i = System.currentTimeMillis();
            ordenar(tmpArray, 0, tmpArray.length - 1);
            // calculamos el tiempo del sistema en milis   
            this.tiempo_f = System.currentTimeMillis();

        }
        this.tiempo_e = (this.tiempo_f - this.tiempo_i) / 1000;
    }

    @Override
    public void setArreglo(double[] arr) {
        this.arreglo = arr;
    }

    @Override
    public double[] getArreglo() {
        return arreglo;
    }

    @Override
    public double getTiempoFinal() {
        return tiempo_e;
    }

    @Override
    public double getVerificaciones() {
        return verificaciones;
    }

    @Override
    public double getIntercambios() {
        return interaciones;
    }

    private void ordenar(double[] tmpArray, int izq, int der) {
        // verificar por lo menos left sea menor que right
        if (izq < der) {
            int centro = (izq + der) / 2;
            ordenar(tmpArray, izq, centro);
            ordenar(tmpArray, centro + 1, der);
            merge(tmpArray, izq, centro + 1, der);
        }

    }

    private void merge(double[] arreglo, int izq, int der, int end) {
        // establecer unos limites
        int leftEnd = der - 1;
        int tmpPos = izq;
        // calcular un numero de elementos 
        int numElements = end - izq + 1;

        // generar los cambios en el arreglo temporal 
        while (izq <= leftEnd && der <= end) {
            if (this.arreglo[izq] < this.arreglo[der]) {
                arreglo[tmpPos++] = this.arreglo[izq++];
            } else {
                arreglo[tmpPos++] = this.arreglo[der++];
            }
        }
        // copiar el resto de la primera mitad
        while (izq <= leftEnd) {
            arreglo[tmpPos++] = this.arreglo[izq++];
        }
        // copiar el resto de la segunda mitad
        while (der <= end) {
            arreglo[tmpPos++] = this.arreglo[der++];
        }

        // actualizar el arreglo 
        // recorrer el arreglo
        for (int i = 0; i < numElements; i++, end--) {
            this.arreglo[end] = arreglo[end];
        }

    }

    

}
