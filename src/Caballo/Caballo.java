/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caballo;

/**
 *
 * @author Manuel
 */
public class Caballo {
    static final int N = 8;
    static final int n = (N + 1);
    private int[][] tablero = new int[n][n];
    private boolean exito;
    private int[][] SALTO = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1},
    {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
    private int x0, y0;
    public int[] result;
// constructor

    public Caballo(int x, int y) throws Exception {
        if ((x < 1) || (x > N)
                || (y < 1) || (y > N)) {
            throw new Exception("Coordenadas fuera de rango");
        }
        x0 = x;
        y0 = y;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                tablero[i][j] = 0;
            }
        }
        tablero[x0][y0] = 1;
        exito = false;
    }

    public boolean resolverProblema() {
        saltoCaballo(x0, y0, 2);
        return exito;
    }

    private void saltoCaballo(int x, int y, int i) {
        int nx, ny;
        int k;
        k = 0; // inicializa el conjunto de posibles movimientos
        do {
            k++;
            nx = x + SALTO[k - 1][0];
            ny = y + SALTO[k - 1][1];
// determina si nuevas coordenadas son aceptables
            if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N) && (tablero[nx][ny] == 0)) {
                tablero[nx][ny] = i; // anota movimiento
                if (i < N * N) {
                    saltoCaballo(nx, ny, i + 1);
// se analiza si se ha completado la solución
                    if (!exito) { // no se alcanzó la solución
                        tablero[nx][ny] = 0; // se borra anotación
                    }
                } else {
                    exito = true; // tablero cubierto
                }
            }
        } while ((k < 8) && !exito);
    }
//muestra por pantalla los pasos del caballo

    void escribirTablero() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void convertir(){
        this.result = new int[64];
        int n=0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                result[n] = tablero[i][j];
                n++;
            }
        }
    }
}