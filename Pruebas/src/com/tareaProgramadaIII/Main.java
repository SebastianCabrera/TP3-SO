package com.tareaProgramadaIII;

import java.math.BigInteger;
import java.sql.*;

public class Main {

    //Me estoy basando en el ejemplo de la pagina:
    //http://alvinalexander.com/java/java-mysql-select-query-example


    public static void main(String[] args) {

	    TestSinCache tSC = new TestSinCache();
	    tSC.searchDBId(); //En las pruebas solo se utilizaria un tipo de busqueda
	    //tSC.searchDBINombre();
    }
}
