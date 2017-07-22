package com.tareaProgramadaIII;

/**
 * Created by sebastian on 22/7/2017.
 */

import javax.swing.JOptionPane;
/**
 *
 */
public class Buscador
{
    JOptionPane mensajes;
    /**
     * Constructor for objects of class Riemann
     */
    public Buscador()
    {
        // initialise instance variables
        mensajes = new JOptionPane();

    }

    int buscar(String parametroBusqueda, boolean modo)
    {
        if(modo)
        {
            this.BuscarConCache();
        }
        else
        {
            this.BuscarSinCache();
        }
        mensajes.showMessageDialog(null, "prueba: "+ parametroBusqueda);
        return 0;
    }

    void BuscarConCache()
    {
        mensajes.showMessageDialog(null, "se está usando el caché");


    }

    void BuscarSinCache()
    {
        mensajes.showMessageDialog(null, "No se está usando el caché");
    }

}