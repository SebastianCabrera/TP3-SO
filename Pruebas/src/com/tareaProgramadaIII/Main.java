package com.tareaProgramadaIII;

import java.math.BigInteger;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Main implements ActionListener
{

    //Me estoy basando en el ejemplo de la pagina:
    //http://alvinalexander.com/java/java-mysql-select-query-example
        JOptionPane mensajes;
        Interfaz interfaz;
        /**
         * Constructor for objects of class Controlador
         */
        public Main()
        {
            mensajes = new JOptionPane();
        }

        public void iniciar()
        {
            interfaz = new Interfaz(this);
        }

        /**
         * Se encarga de llamar a otras clases para ejecutar la función de los botones.
         */
        public void actionPerformed (ActionEvent evento)
        {
            String opcion = evento.getActionCommand();
            Buscador buscador = new Buscador();
            String busqueda;
            boolean modo;
            if(opcion.equals("Sin cache titulo"))
            {
                modo = false;
                interfaz.actualizar(this);
                busqueda = interfaz.getTextTxtTituloSinCache();
                buscador.buscar(busqueda,modo);
            }
            else
            {
                if(opcion.equals("ayuda"))
                {
                    JOptionPane.showMessageDialog(null, "Intervalo: use un punto para dividir la parte entera de un número su parte decimal");
                }else{}
            }
            if(opcion.equals("Sin cache id"))
            {
                modo = false;
                busqueda = interfaz.getTextTxtIdSinCache();
                interfaz.actualizar(this);
                buscador.buscar(busqueda,modo);
            }
            else
            {
            }
            if(opcion.equals("Con cache titulo"))
            {
                modo = true;
                busqueda = interfaz.getTextTxtTituloConCache();
                interfaz.actualizar(this);
                buscador.buscar(busqueda,modo);
            }
            else
            {

            }
            if(opcion.equals("Con cache id"))
            {
                modo = true;
                busqueda = interfaz.getTextTxtIdSinCache();
                interfaz.actualizar(this);
                buscador.buscar(busqueda,modo);
            }
            else
            {
            }
        }
    public static void main(String[] args) {
        Main controlador = new Main();
        controlador.iniciar();
    }
    }





