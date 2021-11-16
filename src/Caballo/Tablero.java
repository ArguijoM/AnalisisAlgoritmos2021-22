/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caballo;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Manuel
 */
public class Tablero {

    JFrame frame;
    JPanel panelSuperior, panelInferior;
    int[] datos;
    JLabel valX,valY;
    JButton calc;
    int x,y;

    public Tablero(int X, int Y,int[] datos) {
        this.x=X;this.y=Y;
        this.datos=datos;
        //construyePanelSuperior();
        construyePanelInferior();
        construyeVentana();
    }
    
    void construyePanelSuperior() {
        panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(2,1));
        valX = new JLabel("Valor Inicial X: "+x);
        valX.setFont(new Font("Serif", Font.PLAIN, 16));
        panelSuperior.add(valX);
        valY = new JLabel("Valor Inicial Y: "+y);
        valY.setFont(new Font("Serif", Font.PLAIN, 16));
        panelSuperior.add(valY);
        panelSuperior.setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    void construyePanelInferior() {
        panelInferior = new JPanel();
        panelInferior.setLayout(new GridLayout(8, 8));
        for(int i=0; i<=63;i++){
            if(datos[i]==1){
                JButton b1 = new JButton();
               
                b1.setText(""+datos[i]);
                b1.setBackground(java.awt.Color.CYAN);
                panelInferior.add(b1);
            }else
                panelInferior.add(new JButton(""+datos[i]));
        }
       
    }

    void construyeVentana() {
        frame = new JFrame("Tablero 8X8");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        //frame.add(panelSuperior);
        frame.add(panelInferior);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
