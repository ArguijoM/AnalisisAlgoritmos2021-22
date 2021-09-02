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
public class Burbuja {

    private double[] arreglo;
    private int verificaciones, intercambios;

    public Burbuja(double[] datos) {
        this.arreglo = datos;
    }

    public void ordenarArreglo() {
        System.out.println("Vector original:");
        imprimirArreglo(arreglo);
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
        System.out.println("No. de Intercambios: " + this.intercambios);
        System.out.println("No. de Verificaciónes: " + this.verificaciones);
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
        double datos[] = {23, 6, 15, 53, 13,27,12,11};
        Burbuja b = new Burbuja(datos);
        b.ordenarArreglo();
    }
}
