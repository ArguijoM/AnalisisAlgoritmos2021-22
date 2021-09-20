/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Algoritmos.Burbuja;
import Algoritmos.Burbuja_Optimizado;
import Algoritmos.InsertSort;
import Algoritmos.Ordenamiento;
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Main {



    public static void main(String arg[]) {
        //Generamos los 3 casos de ordenamiento
        Herramientas a = new Herramientas(10000);
        double[] medio = a.generarCasoMedio();
        double[] peor = a.generarPeorCaso();
        double[] mejor = a.generarMejorCaso();
        a.imprimirArreglo(mejor);
        
        //Creamos objetos con los 3 algoritmos que analizaremos
        Burbuja  b = new Burbuja();
        Burbuja_Optimizado  bo = new Burbuja_Optimizado(1);
        InsertSort in = new InsertSort();
        
        //generamos una lista que contenga los 3 algoritmos
        ArrayList<Ordenamiento> lista = new ArrayList<>();
        lista.add(b);
        lista.add(bo);
        lista.add(in);
        
        //Generamos las pruebas (Numero de pruebas, arreglo)
        Pruebas p = new Pruebas(lista);
        p.generarPruebas(100,medio);
        
        

    }

}
