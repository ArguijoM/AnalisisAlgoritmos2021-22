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

    public Burbuja_Optimizado(double[] datos, int bandera) {
        this.arreglo = datos;
        this.bandera = bandera;
                this.tiempo_e = 0;
        this.tiempo_i = 0;
        this.tiempo_f = 0;
    }

    @Override
    public void ordenarArreglo() {
        System.out.println("Vector original:");
        imprimirArreglo();
        this.tiempo_i = System.currentTimeMillis();
        for (int i = 0; i < this.arreglo.length - 1 && bandera == 1; i++) {
            bandera = 0;
            for (int j = 0; j < this.arreglo.length - i - 1; j++) {
                if (this.arreglo[j] > this.arreglo[j + 1]) {
                    bandera = 1;
                    double aux = this.arreglo[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arreglo[j + 1] = aux;
                    intercambios++;
                }
                verificaciones++;
            }

        }
        this.tiempo_f = System.currentTimeMillis();
        
        System.out.println("No. de Intercambios: " + this.intercambios);
        System.out.println("No. de Verificaciónes: " + this.verificaciones);
        System.out.println("Vector ordenado:");
        imprimirArreglo();
        this.tiempo_e = (this.tiempo_f - this.tiempo_i)/1000;
    }

    @Override
    public void obtenerArreglo(double[] datos) {
        this.arreglo = datos;
    }

    @Override
    public double[] getResultado() {
        return arreglo;
    }

    @Override
    public void imprimirArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " | ");
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        double datos[] = {1, 5, 10, 15, 20};
        double datos2[] = {10, 21, 98, 34, 3, 24, 6, 7, 56, 4, 98, 54, 65, 96, 43, 62, 83, 24, 75};
        Burbuja_Optimizado b = new Burbuja_Optimizado(datos2, 1);
        b.ordenarArreglo();
        System.out.println("Burbuja Optimizado: "+b.tiempo_e);
    }
}
