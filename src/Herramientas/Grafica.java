/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Grafica {
    private JFreeChart grafica;
    private XYSeriesCollection series;
    private String nombre, tituloEjeX, tituloEjeY;

    public Grafica(String nombre, String ty, String tx) {
        this.grafica = null;
        this.series = new XYSeriesCollection();
        this.nombre = nombre;
        this.tituloEjeX = tx;
        this.tituloEjeY = ty;
    }

    public void agregarSerie(double[] datosSerie, String nombreSerie) {
        XYSeries serie = new XYSeries(nombreSerie);
        for (int x = 0; x < datosSerie.length; x++) {
            serie.add(x, datosSerie[x]);
        }
        this.series.addSeries(serie);
    }
    
    public void mostrarGrafica() {
        this.grafica = ChartFactory.createXYLineChart(nombre, tituloEjeX, tituloEjeY, series);
        ChartFrame panel = new ChartFrame("grafica", grafica);
        panel.pack();
        panel.setVisible(true);

    }

}
