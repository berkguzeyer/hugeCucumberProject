package JDBC.day01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_IntroToJDBC {

    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains type of connection(jdbc), type of database(mysql)m url to remote server, port number and name of the database you want to work on
        // Don't forget to add ``jdbc:mysql://`` - port(3306) & database(sakila)

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z"; //don't get confused by the escape character in java

        Connection connection = DriverManager.getConnection(url, username, password); // Creation of connection to the database

        Statement statement = connection.createStatement(); // Created a statement to write our queries
        ResultSet rs = statement.executeQuery("select * from actor"); // Result is ready but not on our PC
        // The result is on the database to work faster

        rs.next(); // The arrow that's next to the row is now on the FIRST row
        // rs.next moves one by one

        String firstName = rs.getString("first_name"); // We are getting the data from the first row, first_name column
        String lastName = rs.getString("last_name"); // We are getting the data from the first row, last_name column
        System.out.println("1st row first and last name: " + firstName + " " + lastName);

        rs.next(); // We are now moving to the next row (2nd row)

        firstName = rs.getString(2); // in db, index starts from 1 so the COLUMN INDEX FOR FIRST NAME IS 2
        lastName = rs.getString(3); // in db, index starts from 1
        System.out.println("2nd row first and last name: " + firstName + " " + lastName);

        connection.close();

    }

}
