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
public class Burbuja_Optimizado implements Ordenamiento {

    private double[] arreglo;
    private int bandera;
    private int intercambios, verificaciones;
    private double tiempo_e;
    private double tiempo_i, tiempo_f;

    public Burbuja_Optimizado(int bandera) {
        this.bandera = 1;
        this.tiempo_e = 0;
        this.tiempo_i = 0;
        this.tiempo_f = 0;
    }

    @Override
    public void ordenarArreglo() {
        this.tiempo_i = System.currentTimeMillis();
        final int N = arreglo.length;
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j];
                    this.arreglo[j] = arreglo[j + 1];
                    this.arreglo[j + 1] = temp;
                }
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
        return arreglo;
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
