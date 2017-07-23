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
        TestSinCache adminSinCache;
        /**
         * Constructor for objects of class Controlador
         */
        public Main()
        {
            mensajes = new JOptionPane();
        }

        //Main de la aplicación
        public void iniciar()
        {


                String usuario = mensajes.showInputDialog(null, "Ingrese el usuario de la base de datos");
                if(usuario== null || usuario.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"No ingresó el usuario, se utilizará el usuairo por defecto: 'root'");
                    usuario = "root";
                }else{}


                String pass = mensajes.showInputDialog(null, "Ingrese la contraseña del usuario para la base de datos");

                if(pass == null || pass.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"No ingresó la contraseña se utilizará la contraseña por defecto " +
                            "pero lo más probable es que no funcione");
                    pass = "6220";
                }
                else{}
                    adminSinCache = new TestSinCache(usuario, pass);
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
                //buscador.buscar(busqueda,modo);
                adminSinCache.searchDBNombre(busqueda);
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
                //buscador.buscar(busqueda,modo);
                adminSinCache.searchDBId(busqueda);
            }
            else
            {
            }
            if(opcion.equals("Con cache titulo"))
            {
                modo = true;
                busqueda = interfaz.getTextTxtTituloConCache();
                interfaz.actualizar(this);
                //aqui va el metodo para las pruebas
                TestConCache admin = new TestConCache();
                admin.searchDBNombre(busqueda);
            }
            else
            {

            }
            if(opcion.equals("Con cache id"))
            {
                modo = true;
                busqueda = interfaz.getTextTxtIdSinCache();
                interfaz.actualizar(this);
                //aqui va el metodo para las pruebas
                TestConCache admin = new TestConCache();
                admin.searchDBId(busqueda);


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





