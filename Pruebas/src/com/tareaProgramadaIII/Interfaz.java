package com.tareaProgramadaIII;

/**
 * Created by sebastian on 22/7/2017.
 */


import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;

import javax.swing.JOptionPane;

///////////////////////////
/**
 * Write a description of class Interfaz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interfaz
{
    // instance variables - replace the example below with your own
    private JFrame marco;
    JButton idSinCache;
    JButton tituloSinCache;
    JButton ayuda;
    JButton idConCache;
    JButton tituloConCache;

    JLabel labelError;
    JLabel labelFuncion;
    JLabel labelIntervalo;
    JTextField txtIdConCache;
    //JLabel fondo;
    JLabel resultado;
    JLabel labelIdCache;
    JTextField txtTituloConCache;
    JTextField txtTituloSinCache;
    JTextField txtIdSinCache;
    JTextField txtIdSinCache2;
    ImageIcon imagenFondo;
    //private final String IMAGEN_FONDO = "fondo.jpg";
    ////
    /**
     * Constructor for objects of class Interfaz
     */
    public Interfaz(Main controlador)
    {
        marco = new JFrame();
        marco.setLayout(null);
        marco.setPreferredSize(new Dimension(600,400));
        marco.setResizable(false);


        tituloSinCache = new JButton("Buscar sin caché");
        tituloSinCache.addActionListener(controlador);
        tituloSinCache.setActionCommand("Sin cache titulo");
        tituloSinCache.setBounds(315,25,140,50);
        marco.add(tituloSinCache);




        idSinCache = new JButton("Buscar sin caché");
        idSinCache.addActionListener(controlador);
        idSinCache.setActionCommand("Sin cache id");
        idSinCache.setBounds(315,100,140,50);

        tituloConCache = new JButton("Buscar con Cache");
        tituloConCache.addActionListener(controlador);
        tituloConCache.setActionCommand("Con cache titulo");
        tituloConCache.setBounds(315,175,140,50);
        marco.add(tituloConCache);

        idConCache = new JButton("Buscar con caché");
        idConCache.addActionListener(controlador);
        idConCache.setActionCommand("Con cache id");
        idConCache.setBounds(315,250,140,50);
        marco.add(idConCache);



        ayuda = new JButton("?");
        ayuda.addActionListener(controlador);
        ayuda.setActionCommand("ayuda");
        ayuda.setBounds(525,15,50,50);

        labelError = new JLabel("Id",SwingConstants.CENTER);
        labelError.setBounds(25,250,120,50);
        labelError.setOpaque(true);

        labelIdCache = new JLabel("Título",SwingConstants.CENTER);
        labelIdCache.setBounds(25,175,120,50);
        labelIdCache.setOpaque(true);

        labelFuncion = new JLabel("Título",SwingConstants.CENTER);
        labelFuncion.setBounds(25,25,120,50);
        labelFuncion.setOpaque(true);

        labelIntervalo = new JLabel("Id",SwingConstants.CENTER);
        labelIntervalo.setBounds(25,100,120,50);
        labelIntervalo.setOpaque(true);


        txtIdConCache = new JTextField();
        txtIdConCache.setText("10");
        txtIdConCache.setBounds(170,250,120,50);
        txtIdConCache.setOpaque(true);

        txtTituloConCache = new JTextField();
        txtTituloConCache.setBounds(170,175,120,50);
        txtTituloConCache.setOpaque(true);
        txtTituloConCache.setText("Anarchism");

        txtTituloSinCache = new JTextField();
        txtTituloSinCache.setText("Albedo");
        txtTituloSinCache.setBounds(170,25,120,50);
        txtTituloSinCache.setOpaque(true);

        txtIdSinCache = new JTextField();
        txtIdSinCache.setText("12");
        txtIdSinCache.setBounds(170,100,120,50);
        txtIdSinCache.setOpaque(true);

        //imagenFondo = new ImageIcon(this.getClass().getResource(IMAGEN_FONDO));
        //fondo = new JLabel(imagenFondo);
        //fondo.setBounds(0,0,600,400);

        marco.add(labelIdCache);
        marco.add(ayuda);
        marco.add(idSinCache);
        marco.add(txtTituloConCache);
        marco.add(txtTituloSinCache);
        marco.add(txtIdSinCache);
        marco.add(txtIdConCache);
        marco.add(labelFuncion);
        marco.add(labelIntervalo);
        marco.add(labelError);
        //marco.add(fondo);

        marco.pack();
        marco.setVisible(true);
    }

    //.setBounds(315,100,120,50);
    public void buscar()
    {

    }

    String getTextTxtIdSinCache()
    {
        return txtIdSinCache.getText();
    }

    String getTextTxtIdConCache()
    {
        return txtIdConCache.getText();
    }

    String getTextTxtTituloSinCache()
    {
        return txtTituloSinCache.getText();
    }

    String getTextTxtTituloConCache()
    {
        return txtTituloConCache.getText();
    }

    public void actualizar(Main controlador)
    {
        /*
        txtTituloConCache.setText("");
        txtTituloSinCache.setText("");
        txtIdConCache.setText("");
        txtIdSinCache.setText("");*/
    }
}