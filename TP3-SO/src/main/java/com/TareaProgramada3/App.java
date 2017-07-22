package com.TareaProgramada3;

/**
 * Hello world!
 *
 */
public class App //Aqui solo se van a hacer pequeñas pruebas, no tiene nada que ver con el desarrollo de la aplicacion
{
    public static void main( String[] args )
    {
        ObjectC objTmp = new ObjectC();
        //for(int i=0; i<=5; i++)
        //{
            objTmp.setKey(1);
            objTmp.setValue("¡Felicidades!");
        //}
        String id = "Sebastian";
        int cantidad = 8;
        //ListaCache tmp = new ListaCache();
        ListaCacheFIFO pruebaFIFO = new ListaCacheFIFO(cantidad, id);
        pruebaFIFO.put(1, objTmp);
        ObjectC respuesta = pruebaFIFO.get(1);
        if(respuesta != null)
        {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        }
        else
        {
            System.out.print("La direccion que busco esta vacia\n");
        }

        //pruebaFIFO.clear();
    }


}


