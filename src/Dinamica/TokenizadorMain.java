/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dinamica;
import java.util.ArrayList;
/**
 *
 * @author Manuel
 */
public class TokenizadorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tokenizador tok = new Tokenizador();
        tok.tokenizar();
        ArrayList<Item> aux = tok.getArticulos();
        
        int totalWeight = 22;
        ProblemaMochila kp = new ProblemaMochila(aux, totalWeight);

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
        System.out.println("Items de la solución: ");
        for(int i=0; i<kp.getBestSolution().size();i++){
            System.out.println("("+kp.getBestSolution().get(i).getPeso()+" , "+kp.getBestSolution().get(i).getBeneficio()+")");
        }
    }
    
}
