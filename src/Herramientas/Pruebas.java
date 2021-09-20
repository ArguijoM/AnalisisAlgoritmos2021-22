/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Algoritmos.Ordenamiento;
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Pruebas {

    private ArrayList<Ordenamiento> metodos;
    private String[] nombres;

    public Pruebas(ArrayList<Ordenamiento> metodos) {
        this.metodos = metodos;
        this.nombres = new String[]{"Burbuja", "Burbuja Optimizado", "Insersión"};
    }

    public void generarPruebas(int num_pruebas, double[] datos) {
        ArrayList<double[]> tiemposTotales = new ArrayList<>();
        for (int j = 0; j < this.metodos.size(); j++) {
            tiemposTotales.add(new double[num_pruebas]);
        }
        
        for (int p = 0; p < num_pruebas; p++) {
            for (int a = 0; a < this.metodos.size(); a++) {
                Ordenamiento aux = this.metodos.get(a);
                aux.setArreglo(datos.clone());
                aux.ordenarArreglo();
                tiemposTotales.get(a)[p] = aux.getTiempoFinal();
            }
        }

        Grafica g = new Grafica("Grafica de Tiempos Finales", "Tiempos", "Pruebas de Ordenamientos");
        for (int x = 0; x < tiemposTotales.size(); x++) {
            g.agregarSerie(tiemposTotales.get(x), "" + nombres[x]);
        }

        g.mostrarGrafica();
    }

    public void imprimirArreglo(double[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " | ");
        }
        System.out.println("\n");
    }

}
