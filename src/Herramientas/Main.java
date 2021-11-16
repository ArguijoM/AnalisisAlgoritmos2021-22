/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Algoritmos.Burbuja;
import MochilaDinamica.*;
import Algoritmos.Burbuja_Optimizado;
import Algoritmos.InsertSort;
import Algoritmos.MergeSort;
import Algoritmos.Ordenamiento;
import Algoritmos.QuickSort;
import java.util.ArrayList;
import Recursividad.*;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Main {

    public static void main(String arg[]) {
        Items[] bags = new Items[]{
            new Items(1, 2), new Items(2, 5),
            new Items(4, 6), new Items(5, 10),
            new Items(7, 13), new Items(8, 16)
        };

        int totalWeight = 24;
        ProblemaMochila kp = new ProblemaMochila(bags, totalWeight);

        kp.solve();
        System.out.println("Tabla de matriz de decisión óptima:");
        int[][] bestValues = kp.getBestValues();
        for (int i = 0; i < bestValues.length; i++) {
            for (int j = 0; j < bestValues[i].length; j++) {
                System.out.printf("%-5d", bestValues[i][j]);
            }
            System.out.println();
        }
        System.out.println("Valor óptimo:" + kp.getBestValue());
        System.out.println("Solución óptima [mochila seleccionada]:");
        System.out.println(kp.getBestSolution());
    }

}
