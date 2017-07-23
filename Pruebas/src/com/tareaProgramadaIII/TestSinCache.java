package com.tareaProgramadaIII;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * Created by Sebastián on 20/7/2017.
 */
public class TestSinCache {

    String usuario;
    String pass;

    public TestSinCache(String usuarioParam, String passParam)
    {
        usuario=usuarioParam;
        pass=passParam;
    }

    public void searchDBId(String idToSearch)
    {
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
            Connection conn = DriverManager.getConnection(myUrl, usuario, pass); //

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

                    JOptionPane.showMessageDialog(null, "id: "+id+"\n namespace: "+namespace+ "\n title: "+ title+
                            "\n counter: "+ counter+ "\n is_redirect: "+is_redirect+ "\n is_new: "+is_new+ "\n random: "+random+
                            "\n latest: "+latest+ "\n len: "+ len);
                }
                st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public void searchDBNombre(String nameToSearch)
    {
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
            Connection conn = DriverManager.getConnection(myUrl, usuario, pass); //


                //Este seria el SELECT a implementar
            String query = "SELECT * FROM page WHERE page_title = '" + nameToSearch+"'";

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
                    JOptionPane.showMessageDialog(null, "id: "+id+"\n namespace: "+namespace+ "\n title: "+ title+
                            "\n counter: "+ counter+ "\n is_redirect: "+is_redirect+ "\n is_new: "+is_new+ "\n random: "+random+
                            "\n latest: "+latest+ "\n len: "+ len);
                }
                st.close();



        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
