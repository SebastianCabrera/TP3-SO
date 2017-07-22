package com.tareaProgramadaIII;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * Created by Sebastián on 20/7/2017.
 */
public class TestSinCache {

    public TestSinCache(){}

    public void searchDBId()
    {
/*
        Connection conn = null;

        String driver   = "com.mysql.jdbc.Driver";
        String db       = "wiki";
        String url      = "jdbc:mysql://localhost/" + db;
        String user     = "root";
        String pass     = "6220";

        try {
            try {
                Class.forName(driver);
            }
            catch (ClassNotFoundException e) {
                System.out.println("Where is your MySQL JDBC Driver?");
                e.printStackTrace();
                return;
            }
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected to database : " + db);
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
*/

        int opcion = 1;
        try
        {
            // create our mysql database connection
            String myDriver = "com.mysql.jdbc.Driver"; //Si no es así es con    org.gjt.mm.mysql.Driver
            String myUrl = "jdbc:mysql://localhost/wiki?autoReconnect=true&useSSL=false"; //Siendo wiki el nombre de la base de datos
            try {
                Class.forName(myDriver);
            } catch (ClassNotFoundException e) {
                System.out.println("Where is your MySQL JDBC Driver?");
                e.printStackTrace();
                return;
            }
            Connection conn = DriverManager.getConnection(myUrl, "root", "6220"); //

            while (opcion == 1)
            {
                opcion = 2;
                System.out.print("Digite id de pagina que quiera buscar \n");
                String idToSearch = "10";//= System.console().readLine();
                int idInt = Integer.parseInt(idToSearch);

                //Este seria el SELECT a implementar
                String query = "SELECT * FROM page WHERE page_id = " + idInt;

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

                System.out.print("Quiere buscar otra pagina? 0=No 1=Si\n"); //Para verificar cuando desea dejar de hacer consultas
                String respuesta = System.console().readLine();
                opcion = Integer.parseInt(respuesta);
            }
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public void searchDBNombre()
    {
        int opcion = 1;
        try
        {
            // create our mysql database connection
            String myDriver = "com.mysql.jdbc.Driver"; //Si no es así es con    org.gjt.mm.mysql.Driver
            String myUrl = "jdbc:mysql://localhost/wiki?autoReconnect=true&useSSL=false"; //Siendo wiki el nombre de la base de datos
            try {
                Class.forName(myDriver);
            } catch (ClassNotFoundException e) {
                System.out.println("Where is your MySQL JDBC Driver?");
                e.printStackTrace();
                return;
            }
            Connection conn = DriverManager.getConnection(myUrl, "root", "SuContrasena"); //

            while (opcion == 1)
            {
                System.out.print("Digite id de pagina que quiera buscar \n");
                String nameToSearch = System.console().readLine();

                //Este seria el SELECT a implementar
                String query = "SELECT * FROM page WHERE page_id = " + nameToSearch;

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

                System.out.print("Quiere buscar otra pagina? 0=No 1=Si\n"); //Para verificar cuando desea dejar de hacer consultas
                String respuesta = System.console().readLine();
                opcion = Integer.parseInt(respuesta);
            }
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
