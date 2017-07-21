package com.tareaProgramadaIII;

import java.math.BigInteger;
import java.sql.*;

public class Main {

    //Me estoy basando en el ejemplo de la pagina:
    //http://alvinalexander.com/java/java-mysql-select-query-example
    public static void searchDB()
    {
        try
        {
            // create our mysql database connection
            String myDriver = "com.mysql.jdbc.Driver"; //Si no es así es con    org.gjt.mm.mysql.Driver
            String myUrl = "jdbc:mysql://localhost/wiki"; //Siendo wiki el nombre de la base de datos
            try {
                Class.forName(myDriver);
            } catch (ClassNotFoundException e) {
                System.out.println("Where is your MySQL JDBC Driver?");
                e.printStackTrace();
                return;
            }
            Connection conn = DriverManager.getConnection(myUrl, "root", "SuContrasena"); //

            //Este seria el SELECT a implementar
            String query = "SELECT * FROM page WHERE page_id = 10"; //En vez de 10 se pondría el id ingresado por el usuario
            //String query = "SELECT * FROM page WHERE page_title = x"; //En x se pondría el nombre de la pagina ingresada por el usuario

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next())
            {
                int id = rs.getInt("page_id");
                int namespace = rs.getInt("page_namespace");
                String title = rs.getString("page_title");
                //Me salto page_restrictions por blob
                int counter = rs.getInt("page_counter"); //En la base aparece como "bigint"
                int is_redirect = rs.getInt("page_is_redirect"); //En la base aparece como "tinyint"
                int is_new = rs.getInt("page_is_new"); //En la base aparece como "tinyint"
                double random = rs.getDouble("page_random");
                //Me salto page_touched por blob
                int latest = rs.getInt("page_latest");
                int len = rs.getInt("page_len");

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s, %s, %s, %s\n", id, namespace, title, counter, is_redirect, is_new, random, latest, len);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

	    searchDB();
    }
}
