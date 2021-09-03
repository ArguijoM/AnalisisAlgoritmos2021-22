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

    public Burbuja(double[] datos) {
        this.arreglo = datos;
    }

    @Override
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

    @Override
    public void obtenerArreglo(double[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[] getResultado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirArreglo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String args[]) {
        double datos[] = {1, 5, 10, 15, 20};
        double datos2[] = {20,15,10,5,1};
        Burbuja b = new Burbuja(datos2);
        b.ordenarArreglo();
    }
}
