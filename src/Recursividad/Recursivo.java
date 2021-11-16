/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Objects;

/**
 *
 * @author Manuel
 */
public class Recursivo {

    public int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public double fibonacciRecursivo(double n) {
        if (n > 1) {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }

    }

    public double fibonacciIterativo(double limite) {
        double n1 = 0, n2 = 1;
        for (double i = 0; i < limite - 2; i++) {
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return n2;
    }

    public long fibonacciIterativoDinamico(int n) {
        final long[] fibTab = new long[n];
        for(int i=0;i< n;i++){
            fibTab[i]= -1;
        }
        return lookupFib(fibTab, (n));

    }

    public long lookupFib(long[] fibTab, int n) {
        if (fibTab[n-1] != -1) {
            return fibTab[n-1];
        }
        fibTab[n-1] = lookupFib(fibTab, n - 2) + lookupFib(fibTab, n -3);
        return fibTab[n-1];
    }

    public int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
    }

}
