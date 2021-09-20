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
public class InsertSort implements Ordenamiento {

    private double[] arreglo;
    private int verificaciones, intercambios;
    private double tiempo_e;
    private double tiempo_i, tiempo_f;

    public InsertSort() {
        this.verificaciones = 0;
        this.intercambios = 0;
        this.tiempo_e = 0;
        this.tiempo_i = 0;
        this.tiempo_f = 0;
    }

    @Override
    public void ordenarArreglo() {
        double aux = 0;
        this.tiempo_i = System.currentTimeMillis();
        for (int i = 1; i < arreglo.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arreglo[j] < arreglo[j - 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j - 1];
                    arreglo[j - 1] = aux;
                    intercambios++;
                }
                verificaciones++;
            }

        }
        this.tiempo_f = System.currentTimeMillis();
        this.tiempo_e = (this.tiempo_f - this.tiempo_i) / 1000;
    }

    @Override
    public double getTiempoFinal() {
        return this.tiempo_e;
    }

    @Override
    public double[] getArreglo() {
        return this.arreglo;
    }

    @Override
    public double getVerificaciones() {
        return this.verificaciones;
    }

    @Override
    public double getIntercambios() {
        return this.intercambios;
    }

    @Override
    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }

}
