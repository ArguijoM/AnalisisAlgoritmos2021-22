/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caballo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Manuel
 */
public class CaballoMain {
    public static void main(String[] args) {
        int x, y;
        boolean solucion;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Posicion inicial del caballo. ");
            System.out.print(" x = ");
            x = Integer.parseInt(entrada.readLine());
            System.out.print(" y = ");
            y = Integer.parseInt(entrada.readLine());
            Caballo miCaballo = new Caballo(x, y);
            solucion = miCaballo.resolverProblema();
            if (solucion) {
                miCaballo.escribirTablero();
                miCaballo.convertir();
                Tablero t = new Tablero(x,y,miCaballo.result);
                
                
            }
            
        } catch (Exception m) {
            System.out.println("No se pudo probar el algoritmo, " + m);
        }
    }

}
    
