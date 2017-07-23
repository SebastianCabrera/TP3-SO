package com.TareaProgramada3;

/**
 * Hello world!
 *
 */
public class App //Aqui solo se van a hacer pequeñas pruebas, no tiene nada que ver con el desarrollo de la aplicacion
{
    public static void main( String[] args )
    {
        ObjectC objTmp1 = new ObjectC();
        //for(int i=0; i<=5; i++)
        //{
            objTmp1.setKey(1);
            objTmp1.setValue("El primero");
        //}
        ObjectC objTmp2 = new ObjectC();
        objTmp2.setKey(4);
        objTmp2.setValue("El segundo");

        ObjectC objTmp3 = new ObjectC();
        objTmp3.setKey(2);
        objTmp3.setValue("El tercero");

        ObjectC objTmp4 = new ObjectC();
        objTmp4.setKey(7);
        objTmp4.setValue("El cuarto");

        String id = "Sebastian";
        int cantidad = 3;
        ListaCache prueba;
        prueba = new ListaCacheLRU(cantidad, id);
        prueba.put(1, objTmp1);
        prueba.put(4, objTmp2);
        prueba.put(2, objTmp3);
        ObjectC respuesta = prueba.get(4);
        if(respuesta != null)
        {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        }
        else
        {
            System.out.print("La direccion que buscó esta vacia\n");
        }
        respuesta = prueba.get(1);
        if(respuesta != null)
        {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        }
        else
        {
            System.out.print("La direccion que buscó esta vacia\n");
        }
        prueba.put(7, objTmp4);
        respuesta = prueba.get(2); //AQUI LOS CAMBIOS
        //System.out.print(prueba.list.get(3).getValue() + "\n");
        if(respuesta != null)
        {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        }
        else
        {
            System.out.print("La direccion que buscó esta vacia\n");
        }

        prueba.clear();
    }


}


