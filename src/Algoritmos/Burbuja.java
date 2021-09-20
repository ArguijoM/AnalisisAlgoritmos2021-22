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
public class Burbuja implements Ordenamiento {

    private double[] arreglo;
    private int verificaciones, intercambios;
    private double tiempo_e;
    private double tiempo_i, tiempo_f;
    private double[] tiempos;

    public Burbuja() {
        this.tiempo_e = 0;
        this.tiempo_i = 0;
        this.tiempo_f = 0;
    }

    @Override
    public void ordenarArreglo() {
        this.tiempo_i = System.currentTimeMillis();
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < this.arreglo.length - 1; j++) {
                if (arreglo[j] > this.arreglo[j + 1]) {
                    double aux = this.arreglo[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arreglo[j + 1] = aux;
                    this.intercambios++;
                }
                this.verificaciones++;
            }
        }
        this.tiempo_f = System.currentTimeMillis();
        this.tiempo_e = (this.tiempo_f - this.tiempo_i)/1000;
    }


    @Override
    public double getTiempoFinal() {
        return tiempo_e;
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
