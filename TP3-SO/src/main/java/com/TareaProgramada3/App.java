package com.TareaProgramada3;

/**
 * Hello world!
 *
 */
public class App //Se dejan unas pruebas para verificar el funcionamiento de los algoritmos
{
    public static void main( String[] args ) {
        //Para prueba LRU
        ObjectC objTmp1 = new ObjectC();
        objTmp1.setKey(1);
        objTmp1.setValue("El primero");

        ObjectC objTmp2 = new ObjectC();
        objTmp2.setKey(10);
        objTmp2.setValue("El segundo");

        ObjectC objTmp3 = new ObjectC();
        objTmp3.setKey(15);
        objTmp3.setValue("El tercero");

        ObjectC objTmp4 = new ObjectC();
        objTmp4.setKey(20);
        objTmp4.setValue("El cuarto");

        String id = "Sebastian1";
        int cantidad = 3;
        ListaCache prueba1;
        prueba1 = new ListaCacheLRU(cantidad, id);
        prueba1.put(5, objTmp1);
        prueba1.put(10, objTmp2);
        prueba1.put(15, objTmp3);
        ObjectC respuesta = prueba1.get(10);
        if (respuesta != null) {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        } else {
            System.out.print("La direccion que buscó esta vacia\n");
        }
        respuesta = prueba1.get(5);
        if (respuesta != null) {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        } else {
            System.out.print("La direccion que buscó esta vacia\n");
        }
        prueba1.put(20, objTmp4);
        respuesta = prueba1.get(15); //En una prueba exitosa, este get deberia recibir un valor null
        if (respuesta != null) {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        } else {
            System.out.print("La direccion que buscó esta vacia\n");
        }

        prueba1.clear();


        //Para prueba FIFO
        ObjectC objTmp5 = new ObjectC();
        objTmp1.setKey(25);
        objTmp1.setValue("El primero");

        ObjectC objTmp6 = new ObjectC();
        objTmp2.setKey(30);
        objTmp2.setValue("El segundo");

        ObjectC objTmp7 = new ObjectC();
        objTmp3.setKey(35);
        objTmp3.setValue("El tercero");

        ObjectC objTmp8 = new ObjectC();
        objTmp4.setKey(40);
        objTmp4.setValue("El cuarto");
        id = "Sebastian2";
        ListaCache prueba2;
        prueba2 = new ListaCacheFIFO(cantidad, id);
        prueba2.put(25, objTmp5);
        prueba2.put(30, objTmp6);
        prueba2.put(35, objTmp7);
        prueba2.put(40, objTmp8);
        respuesta = prueba2.get(25); //En una prueba exitosa, este get deberia recibir un valor null
        if (respuesta != null) {
            System.out.printf("El valor del objeto retornado es: " + respuesta.getValue() + "\n");
        } else {
            System.out.print("La direccion que buscó esta vacia\n");
        }

        prueba2.clear();

        
    }


}


