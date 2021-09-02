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
public class Burbuja_Optimizado {

    private double[] arreglo;
    private int bandera;
    private int intercambios, verificaciones;

    public Burbuja_Optimizado(double[] datos, int bandera) {
        this.arreglo = datos;
        this.bandera = bandera;
    }

    public void ordenarArreglo() {
        System.out.println("Vector original:");
        imprimirArreglo(arreglo);
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
        System.out.println("No. de Intercambios: "+this.intercambios);
        System.out.println("No. de Verificaciónes: "+this.verificaciones);
        System.out.println("Vector ordenado:");
        imprimirArreglo(arreglo);
    }

    public static void imprimirArreglo(double array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        double datos[] = {23, 6, 15, 53, 13,12,43};
        Burbuja_Optimizado b = new Burbuja_Optimizado(datos, 1);
        b.ordenarArreglo();

    }
}
